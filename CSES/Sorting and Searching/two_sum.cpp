#include <iostream>
#include <cstdlib>
#include <vector>
#include <algorithm>
#include <unordered_map>

using namespace std;

int main() {
	int n, x;
	cin>>n>>x;

	vector<int> nums(n);
	unordered_map<int, int> vals;
	for (int y = 0; y < n; y++) {
		cin>>nums[y];
	}

	bool check1 = false;
	for (int y = 0; y < n; y++) {
		int compliment = x - nums[y];
		if (vals.count(compliment) > 0) {
			cout<<vals[compliment] + 1<<" "<<y + 1;
			check1 = true;
			break;
		}
		else {
			vals[nums[y]] = y;
		}
	}

	if (!check1) {
		cout<<"IMPOSSIBLE";
	}
	return 0;

}