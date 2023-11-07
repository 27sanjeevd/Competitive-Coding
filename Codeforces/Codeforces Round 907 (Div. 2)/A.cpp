#include <iostream>
#include <cstdlib>
#include <vector>
#include <cmath>

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

		int pos = 0;
		while (static_cast<int>(pow(2, pos)) - 1 < n - 1) {
			int loc = static_cast<int>(pow(2, pos)) - 1;

			if (nums[loc] > nums[loc+1]) {
				int diff = nums[loc] - nums[loc+1];

				for (int y = 0; y <= loc; y++) {
					nums[y] -= diff;
				}
			}
			pos++;
		}

		bool check1 = true;
		for (int x = 0; x < n-1; x++) {
			if (nums[x+1] < nums[x]) {
				check1 = false;
				break;
			}
		}

		if (check1) {
			cout<<"YES\n";
		}
		else {
			cout<<"NO\n";
		}

	}

	return 0;
}