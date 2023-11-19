#include <iostream>
#include <cstdlib>
#include <vector>

using namespace std;

int main() {
	int n, z;
	cin>>n>>z;

	vector<int> nums(n);
	for (int x = 0; x < n; x++) {
		cin>>nums[x];
	}

	int output = 0;
	for (int x = 0; x < n; x++) {
		int sum1 = 0;
		for (int y = x; y < n; y++) {
			sum1 += nums[y];
			if (sum1 == z) {
				output++;
			}
		}
	}

	cout<<output<<"\n";
	return 0;

}