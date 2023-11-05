#include <iostream>
#include <cstdlib>

using namespace std;

int main() {
	long long n;
	cin>>n;

	long long sum = (n) * (n+1)/2;

	long long counter = 0;
	for (int x = 1; x < n; x++) {
		long long temp;
		cin>>temp;
		counter += temp;
	}

	cout<<sum - counter;
	return 0;

}