#include <iostream>
#include <cstdlib>
#include <algorithm>
#include <climits>

using namespace std;

int main() {
	int n;
	cin>>n;

	long long max1 = INT_MIN/2;
	long long curr = INT_MIN/2;

	for (int x = 0; x < n; x++) {
		long long temp;
		cin>>temp;
		curr = max(curr+temp, temp);
		max1 = max(max1, curr);
	}

	cout<<max1<<"\n";
	return 0;
}