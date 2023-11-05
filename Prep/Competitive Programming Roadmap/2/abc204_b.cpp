#include <iostream>
#include <cstdlib>
using namespace std;

int main() {
	int n;
	cin>>n;

	int amount = 0;
	while (n--) {
		int a;
		cin>>a;

		if (a > 10) {
			amount += (a - 10);
		}
	}

	printf("%d\n", amount);
	return 0;
}