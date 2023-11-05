#include <iostream>
#include <cstdlib>

using namespace std;

int main() {
	int t;
	cin>>t;
	while (t--) {
		int x, y, k;
		cin>>x>>y>>k;

		if (x == y) {
			cout<<x<<"\n";
		}
		else if (x > y) {
			cout<<x<<"\n";
		}
		else {
			if (y - x <= k) {
				cout<<y<<"\n";
			}
			else {
				int total = x + k;
				total += (y - (x+k)) * 2;

				cout<<total<<"\n";
			}
		}
	}


	return 0;
}