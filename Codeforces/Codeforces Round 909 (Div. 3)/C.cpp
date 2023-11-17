#include <iostream>
#include <cstdlib>
#include <vector>
#include <climits>

using namespace std;

int main() {
	int t;
	cin>>t;

	while (t--) {
		int n;
		cin>>n;

		int output = INT_MIN;
		int curr_sum = INT_MIN;
		int prev_num = 0;
		for (int x = 0; x < n; x++) {
			int temp;
			cin>>temp;

			if (x == 0) {
				curr_sum = temp;
				output = max(output, curr_sum);
				prev_num = temp;
			}
			else {
				if ((temp % 2 == 0 && prev_num % 2 != 0) || (temp % 2 != 0 && prev_num % 2 == 0)) {
					curr_sum = max(curr_sum + temp, temp);
					output = max(output, curr_sum);
					prev_num = temp;
				}
				else {
					output = max(output, curr_sum);
					curr_sum = temp;
					prev_num = temp;
					output = max(output, curr_sum);
				}
			}
		}

		cout<<output<<"\n";
	}

	return 0;
}