#include <iostream>
#include <vector>
#include <cstdlib>
#include <algorithm>

using namespace std;

int main() {
	int t;
	cin>>t;

	while (t--) {
		int n;
		cin>>n;

		vector<int> nums(n);
		for (int x = 0; x < n; x++) {
			cin>>nums[x];
		}

		sort(nums.begin(), nums.end());

		int k = -1;

		if (n % 2 == 1) {
			k = nums.back();
			nums.pop_back();
		}
		bool check1 = false;
		for (int x = 0; x < (nums.size())/2; x++) {
			int sum = nums[x] + nums[nums.size() - 1 - x];
			if (k == -1) {
				k = sum;
			}
			else {
				if (k != sum) {
					cout<<"NO\n";
					check1 = true;
					break;
				}
			}
		}

		if (!check1) {
			cout<<"YES\n";
		}
	}

	return 0;
}