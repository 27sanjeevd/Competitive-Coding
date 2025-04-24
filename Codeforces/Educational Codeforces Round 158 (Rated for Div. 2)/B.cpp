#include <iostream>
#include <cstdlib>

using namespace std;

int main() {
	int t;
	cin>>t;
	while (t--) {
		int n;
		cin>>n;
		long long output = 0;
		long long prev = -1;
		for (int x = 0; x < n; x++) {
			int temp;
			cin>>temp;
			if (x == 0) {
				output += (temp - 1);
			}
			else {
				if (temp > prev) {
					output += temp - prev;
				}
			}
			prev = temp;
		}

		cout<<output<<"\n";
	}

	return 0;
}