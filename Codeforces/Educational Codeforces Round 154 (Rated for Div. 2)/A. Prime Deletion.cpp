#include <iostream>
using namespace std;

int main() {
	int t;
	cin>>t;
	while (t--) {
		string s;
		cin>>s;

		int a;
		for (int x = 0; x < s.size(); x++) {
			if (s[x] == '1') {
				a = '1';
				break;
			}
			else if (s[x] == '3') {
				a = '3';
				break;
			}
		}

		if (a == '1') {
			cout<<"13\n";
		}
		else {
			cout<<"31\n";
		}
	}
	return 0;
}