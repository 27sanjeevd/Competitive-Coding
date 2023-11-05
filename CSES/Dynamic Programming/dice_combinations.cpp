#include <iostream>
#include <cstdlib>

using namespace std;
#define MOD 1000000007

int main() {
	long long array1[6] = {0, 0, 0, 0, 0, 0};
	int n;
	cin>>n;
	int temp = 6;
	if (n < temp) {
		temp = n;
	}
	for (int x = 0; x < temp; x++) {
		array1[x] = 1;
		for (int y = 0; y < x; y++) {
			array1[x] += array1[y];
			array1[x] %= MOD;
		}
	}

	if (n <= 6) {
		cout<<array1[n-1];
	}
	if (n > 6) {
		for (int x = 6; x < n; x++) {
			long long sum = 0;
			for (int y = 0; y < 6; y++) {
				sum += array1[y];
				sum %= MOD;
			}
			for (int y = 0; y < 5; y++) {
				array1[y] = array1[y+1];
			}
			array1[5] = sum;
		}

		cout<<array1[5];
	}

	return 0;

}