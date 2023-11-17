#include <iostream>
#include <cstdlib>
#include <algorithm>
#include <vector>
#include <climits>

using namespace std;

int output = INT_MAX;

void helper(vector<int> &nums, int carry, int operations, int k) {
	if (nums.size() == 0) {
		if (carry % k == 0) {
			output = min(output, operations);
		}
	}
	else {
		nums
		helper(nums, carry, operations, k, index + 1);

		helper(nums, carry * nums[index], operations + 1, k, index + 1);
	}
}

int main() {
	int t;
	cin>>t;
	for (int x = 0; x < t; x++) {
		int n, k;
		cin>>n>>k;
		vector<int> nums(n);
		for (int y = 0; y < n; y++) {
			cin>>nums[y];
		}
		helper(nums, 1, 0, k, 0);
		cout<< (output == INT_MAX ? -1 : output) <<"\n";
		output = INT_MAX;
	}
	return 0;
}