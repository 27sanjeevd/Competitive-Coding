#include <iostream>
#include <vector>
#include <cstdlib>
#include <cmath>

using namespace std;

int main() {
	int n;
	cin>>n;

	vector<long long> nums(n);
	for (int x = 0; x < n; x++) {
		long long temp;
		cin>>temp;
		nums[x] = temp;
	}

	sort(nums.begin(), nums.end());

	long long val = -1;
	val = nums[(n-1)/2];

	long long output = 0;
	for (int x = 0; x < n; x++ ){
		output += abs(val - nums[x]);
	}

	cout<<output;
	return 0;
}