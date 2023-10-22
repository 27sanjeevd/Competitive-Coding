#include <iostream>
#include <vector>
#include <cstdlib>
using namespace std;

int main() {
	int t;
	cin>>t;

	while (t--) {
		int n;
		cin>>n;

		string s;
		cin>>s;

		string output = "";

		int pos = n - 1;
		while (pos >= 0) {
			if (s[pos] == '0') {
				output += static_cast<char>('a' + ((s[pos-2] - '0') * 10 + (s[pos-1] - '0')) - 1);
				pos -= 3;
			}
			else {
				output += static_cast<char>('a' + (s[pos] - '0') - 1);
				pos--;
			}
		}
		string output1 = "";
		for (int x = output.size() - 1; x >= 0; x--) {
			output1 += output[x];
		}
		cout << output1 << '\n';

	}
	return 0;
}