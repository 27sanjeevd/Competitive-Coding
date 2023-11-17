#include <iostream>
#include <map>
#include <vector>
#include <algorithm>

using namespace std;

vector<int>::iterator helper(vector<int>& nums, int target) {
	auto it = upper_bound(nums.begin(), nums.end(), target);
	it--;
	return it;
}

int main() {
	int x, n;
	cin>>x>>n;

	map<int, int> lengths;
	vector<int> positions;

	positions.push_back(0);
	positions.push_back(x);
	lengths[x] = 1;

	for (int y = 0; y < n; y++) {
		int temp;
		cin>>temp;
		auto it = helper(positions, temp);
		auto prev = it - 1;
		auto after = it + 1;

		int diff = *after - *prev;
		cout<<diff<<" ASD " << lengths[diff] << "\n";
		if (lengths[diff] == 1) {
			lengths.erase(diff);
		}
		else {
			lengths[diff]--;
		}

		lengths[*after-*it]++;
		lengths[*it-*prev]++;
		positions.insert(it, temp);
		cout<<lengths.rbegin()->first<<" ";


	}

	return 0;
}