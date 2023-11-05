#include <iostream>
#include <cstdlib>
#include <algorithm>

using namespace std;

int main() {
	int n, x;
	cin>>n>>x;

	vector<int> nums;
	for(int x = 0; x < n; x++) {
		int new1;
		cin>>new1;

		nums.push_back(new1);
	}

	sort(nums.begin(), nums.end());

	int sum = 0;

	int counter = 0;
	for (int y = 0; y < n; y++) {
		if (sum > x) {
			cout<<counter-1<<"\n";
			return 0;
		}
		else {
			sum += nums[y];
			counter++;
		}
	}

	if (sum > x) {
		cout<<counter-1<<"\n";
	}
	else {
		cout<<counter<<"\n";
	}
	return 0;
}