#include <iostream>
#include <cstdlib>
#include <vector>
#include <unordered_set>
#include <algorithm>

using namespace std;

int main() {
	unordered_set<int> nums;
	vector<int> vals;
	for (int x = 0; x < 7; x++) {
		int temp;
		cin>>temp;

		vals.push_back(temp);
		nums.insert(temp);
	}

	sort(vals.begin(), vals.end());
	cout<<vals[0]<<" "<<vals[1]<<" "<<vals[vals.size()-1] - vals[0] - vals[1];
	return 0;
}