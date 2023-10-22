#include <iostream>
#include <cstdlib>
using namespace std;

int main() {
	int t;
	cin>>t;

	while (t--) {
		int a, b, c;
		cin>>a>>b>>c;

		int first = a - 1;
		int second = abs(b-c) + abs(c-1);

		if (first < second) {
			cout<<"1\n";
		}
		else if (first > second) {
			cout<<"2\n";
		}
		else {
			cout<<"3\n";
		}
	}

	return 0;
}