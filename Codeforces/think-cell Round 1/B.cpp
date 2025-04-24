#include <iostream>
#include <cstdlib>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
	int t;
	cin>>t;
	while (t--) {
		int n;
		cin>>n;

		bool order = true;
		int pos1 = 1, pos2 = n;
		while (pos1 < pos2) {
			if (order) {
				cout << pos2 << " " << pos1 << " ";
				pos2--;
				pos1++;
				order = false;
			}
			else {
				cout << pos1 << " " << pos2 << " ";
				pos2--;
				pos1++;
				order = true;
			}
		}
		if (pos1 == pos2) {
			cout << pos2;
		}
		cout << "\n";
	}
	return 0;
}