#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
	int n;
	cin>>n;

	vector<int> nums(n);
	for (int x = 0; x < n; x++) {
		cin>>nums[x];
	}

	sort(nums.begin(), nums.end());
	int output = 1;

	for (int x = 0; x < n - 1; x++) {
		if (nums[x] != nums[x+1]) {
			output++;
		}
	}

	cout<<output;
	return 0;
}