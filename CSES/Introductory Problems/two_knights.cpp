#include <iostream>
#include <cstdlib>

using namespace std;

int main() {
	int n;
	cin>>n;

	int one = 0;
	int two = 6;
	int three = 28;
	int four = 96

	int e_corner = 2;
	int e_edge = 3;
	int e_middle = 4;
	int m_corner = 4;
	int m_middle = 6;
	int other = 8;

	if (n >= 1) {
		cout<<one<<"\n";
	}
	if (n >= 2) {
		cout<<two<<"\n";
	}
	if (n >= 3) {
		cout<<three<<"\n";
	}
	if (n >= 4) {
		cout<<four<<"\n";
	}
	for (int x = 5; x <= n; x++) {
		int output = 0;
		output += (x * x - 4 * e_corner - 1);
		output += (x * x - 8 * e_edge - 1);
		output += (x * x - (x-4) * 4 * e_middle - 1);
		
	}

}