#include <iostream>
#include <cstdlib>
using namespace std;

int main() {
	int t;
	cin>>t;

	while (t--) {
		int a, b, c;
		cin>>a>>b>>c;

		if (a == b) {
			printf("0\n");
		}
		else {
			if (a < b) {
				int result = (b-a)/(2*c);
				if ((b-a) % (2*c) != 0) {
					result++;
				}
				printf("%d\n", result);
			}
			else {
				int result = (a-b)/(2*c);
				if ((b-a) % (2*c) != 0) {
					result++;
				}
				printf("%d\n", result);

			}
		}
	}

	return 0;
}