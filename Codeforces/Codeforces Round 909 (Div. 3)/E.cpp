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

		vector<int> sorted1(nums);
		sort(sorted1.begin(), sorted1.end());

		bool check1 = true;
		for (int x = 1; x < n; x++) {
			if (nums[x] < *max_element(nums.begin(), nums.begin() + x)) {
            	cout<<-1<<"\n";
            	check1 = false;
            	break;

        	}
		}
		if (check1) {
			int output = 0;
			for (int x = n - 1; x >= 0; x--) {
				if (nums[x] != sorted1[x]) {
					auto it = find(nums.begin(), nums.begin() + x, sorted1[x]);
					rotate(it, it+1, nums.begin() + x + 1);
					output++;
				}
			}

			cout<<output<<"\n";
		}
	}

	return 0;
}