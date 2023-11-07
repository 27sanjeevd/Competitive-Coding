#include <iostream>
#include <cstdlib>
#include <vector>

using namespace std;

int main() {
	int t;
	cin>>t;

	while (t--) {
		int n, m;
		cin>>n>>m;

		string s;
		cin>>s;
		string t;
		cin>>t;

		bool isHelp = true;
		char ends = -1;

		for (int x = 0; x < m - 1; x++) {
			if (t[x] == t[x+1]) {
				isHelp = false;
			}
		}

		if (m == 1) {
			ends = t[0];
		}
		else {
			if (t[0] == t[m-1]) {
				ends = t[0];
			}
		}

		bool check1 = false;
		for (int x = 0; x < n-1; x++) {
			if (s[x] == s[x+1]) {
				if (isHelp) {
					if ((s[x] == '1' && ends == '0') || s[x] == '0' && ends == '1') {
						continue;
					}
					else {
						cout<<"NO\n";
						check1 = true;
						break;
					}
				}
				else {
					cout<<"NO\n";
					check1 = true;
					break;
				}
			}
		}

		if (!check1) {
			cout<<"YES\n";
		}
	}

	return 0;
}