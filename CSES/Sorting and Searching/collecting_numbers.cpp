#include <iostream>
#include <cstdlib>
#include <unordered_map>

using namespace std;

int main() {
	int n;
	cin>>n;

	unordered_map<int, int> nums;
	for (int x = 0; x < n; x++) {
		int temp;
		cin>>temp;

		nums[temp] = x;
	}

	int output = 1;
	int curr_pos = 0;
	int curr_number = 1;
	while (curr_number <= n) {
		int next_pos = nums[curr_number];
		if (next_pos < curr_pos) {
			output++;
		}

		curr_pos = next_pos;
		curr_number++;
	}

	cout<<output;

	return 0;
}