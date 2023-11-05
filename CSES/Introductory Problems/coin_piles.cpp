#include <iostream>
#include <cstdlib>

using namespace std;

int main() {
	int t;
	cin>>t;
	while (t--) {
		long long a;
		long long b;
		cin>>a>>b;

		if (a > b) {
			long long temp = (a - b);
			b -= temp;
			a = b;
		}
		else if (b > a) {
			long long temp = (b - a);
			a -= temp;
			b = a;
		}
		if (a == 0) {
			cout<<"YES\n";
		}
		else if (a > 0) {
			if (a % 3 ==0) {
				cout<<"YES\n";
			}
			else {
				cout<<"NO\n";
			}
		}
		else {
			cout<<"NO\n";
		}
	}

	return 0;
}