#include <iostream>
#include <cstdlib>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
	int t;
	cin>>t;
	while (t--) {
		int n;
		cin>>n;
		vector<int> vals(2*n);
		for (int x = 0; x < 2 * n; x++) {
			cin>>vals[x];
		}

		sort(vals.begin(), vals.end());
		int output = 0;
		for (int x = 0; x < 2 * n; x += 2) {
			output += vals[x];
		}

		cout << output << "\n";
	}

	return 0;
}