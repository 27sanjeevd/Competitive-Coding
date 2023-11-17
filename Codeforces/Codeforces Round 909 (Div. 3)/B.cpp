#include <iostream>
#include <cstdlib>
#include <vector>
#include <limits>

using namespace std;

int find_diff(vector<int> nums, int space) {
	int min1 = INT_MAX;
	int max1 = INT_MIN;

	for (int x = 0; x < nums.size() - space + 1; x += space) {
		if (x == 0) {
			int temp = nums[space-1];
			min1 = min(min1, temp);
			max1 = max(max1, temp);
		}
		else {
			int temp = nums[x + space - 1] - nums[x-1];
			min1 = min(min1, temp);
			max1 = max(max1, temp);
		}
	}
	return max1 - min1;
}

int main() {
	int t;
	cin>>t;
	while (t--) {
		int n;
		cin>>n;
		vector<int> prefix_sum(n);

		for (int x = 0; x < n; x++) {
			int temp;
			cin>>temp;

			if (x == 0) {
				prefix_sum[x] = temp;
			}
			else {
				prefix_sum[x] = prefix_sum[x-1] + temp;
			}
		}

		int output = 0;
		for (int x = 1; x <= n/2; x++) {
			if (n % x == 0) {
				output = max(output, find_diff(prefix_sum, x));
			}
		}
		cout<<output<<"\n";

	}

	return 0;
}
