#include <iostream>
#include <cstdlib>

using namespace std;

int main() {
	int n, s;
	cin>>n>>s;

	vector<int> coins;
	vector<int> nums;

	while (n--) {
		int temp;
		cin>>temp;

		coins.push_back(temp);
	}

	nums.push_back(0);
	for (int x = 0; x < s; x++) {
		int min_val = -1;

		for (int y = 0; y < coins.size(); y++) {
			if (nums.size() > coins[y] && nums[nums.size() - ])
		}
	}
}