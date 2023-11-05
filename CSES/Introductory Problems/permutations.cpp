#include <iostream>
#include <cstdlib>

using namespace std;

int main() {
	long long n;
	cin>>n;

	if (n > 1 && n < 4) {
		cout<<"NO SOLUTION";
	}
	else {
		for (long long x = n-1; x > 0; x -= 2) {
			cout<<x<<" ";
		}
		for (long long x = n; x > 0; x -= 2) {
			cout<<x<<" ";
		}
	}

	return 0;
}