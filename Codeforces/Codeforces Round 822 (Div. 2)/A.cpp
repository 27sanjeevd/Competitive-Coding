#include <iostream>
#include <vector>
#include <cstdlib>
using namespace std;

int main() {
	int t;
	cin>>t;

	while (t--) {
		int n;
		cin>>n;

		vector<int> vals;
		for (int x = 0; x < n; x++) {
			int temp;
			scanf("%d", &temp);

			vals.push_back(temp);
		}

		sort(vals.begin(), vals.end());
		int min1 = -1;

		for (int x = 1; x < n-1; x++) {
			if (min1 == -1) {
				min1 = (abs(vals[x-1] - vals[x]) + abs(vals[x+1] - vals[x]));
			}
			else {
				min1 = min(min1, abs(vals[x-1] - vals[x]) + abs(vals[x+1] - vals[x]));
			}
		}

		cout<<min1<<"\n";
	}

	return 0;
}