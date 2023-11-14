#include <iostream>
#include <cstdlib>
#include <cmath>

using namespace std;

int main() {
	int n;
	cin>>n;

	int amount = static_cast<int>(pow(2, n));

	string zeros(n, '0');
	cout<<zeros<<"\n";
	zeros[0] = '1';
	cout<<zeros<<"\n";
	for (int x = 1; x < amount; x++) {
		zeros[x] = '1';
		if (x-2 > 0) {
			zeros[x-2] = '0';
		}
		cout<<zeros<<"\n";
	}
	zeros[amount-2] = '0';
	cout<<zeros;

	return 0;
}