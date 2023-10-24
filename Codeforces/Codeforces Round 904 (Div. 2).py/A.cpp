#include <iostream>
#include <cstdlib>
using namespace std;

int main() {
	int t;
	cin>>t;

	while (t--) {
		int x, k;
		cin>>x>>k;

		for (int y = 0; y < 100; y++) {

			int temp = x + y;

			int digit, sum = 0;

			while (temp != 0) {
				digit = temp % 10;
				sum += digit;
				temp /= 10;
			}

			if (sum % k == 0) {
				printf("%d\n", (x + y));
				break;
			}
		}
	}
}