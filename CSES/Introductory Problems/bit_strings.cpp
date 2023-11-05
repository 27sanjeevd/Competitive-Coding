#include <iostream>
#include <cstdlib>
#include <cmath>

using namespace std;

int main() {
	int n;
	cin>>n;

	long long mod_val = static_cast<long long>(pow(10,9) + 7);
	int output = 1;
	for (int x = 0; x < n; x++) {
		output *= 2;
		output %= mod_val;
	}
	cout<<output;
	return 0;
}