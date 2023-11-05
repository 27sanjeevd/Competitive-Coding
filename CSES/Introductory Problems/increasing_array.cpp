#include <iostream>
#include <cstdlib>

using namespace std;

int main() {
	long long n;
	cin>>n;

	long long output = 0;
	long long prev = 0;
	long long curr = 0;

	while (n--) {
		cin>>curr;

		if (curr < prev) {
			output += (prev - curr);
		}
		else {
			prev = curr;
		}
	}

	cout<<output;
	return 0;
}