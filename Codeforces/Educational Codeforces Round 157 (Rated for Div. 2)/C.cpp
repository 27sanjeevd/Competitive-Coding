#include <iostream>
#include <cstdlib>
#include <vector>
#include <cctype>

using namespace std;

int main() {
	int n;
	cin>>n;

	vector<string> nums;
	vector<int> sizes;

	int output = 0;

	for (int x = 0; x < n; x++) {
		string temp;
		cin>>temp;

		nums.push_back(temp);
		sizes.push_back(temp.size());
	}

	for (size_t i = 0; i < nums.size(); i++) {
		for (size_t j = 0; j < nums.size(); j++) {
			int sum = sizes[i] + sizes[j];
			if (sum % 2 == 0) {
				string combined = nums[i] + nums[j];
				string first_half = combined.substr(0, combined.size()/2);
				string second_half = combined.substr(combined.size()/2);

				int first_sum = 0;
				int second_sum = 0;

				for (char ch : first_half) {
					if (isdigit(ch)) {
						first_sum += ch - '0';
					}
				}
				for (char ch : second_half) {
					if (isdigit(ch)) {
						second_sum += ch - '0';
					}
				}

				if (first_sum == second_sum) {
					output++;
				}
			}

		}
	}
	cout<<output<<"\n";
	return 0;
}