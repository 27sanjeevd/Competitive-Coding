#include <iostream>
#include <cstdlib>
#include <unordered_map>

using namespace std;

int main() {
	int t;
	cin>>t;

	while (t--) {
		int n, k;
		cin>>n>>k;

		string word;
		cin>>word;

		unordered_map<char, int> freq;
		for (int x = 0; x < n; x++) {
			freq[word[x]]++;
		}

		bool check1 = true;

		bool findOdd = false;
		for (const auto &pair : freq) {
			cout<<k<<" "<<n<<"\n";
			char key = pair.first;

			int amt = freq[key];
			if (amt % 2 == 1) {
				if (!findOdd) {
					if (k > amt) {
						freq[key] = 0;
						k -= amt;
						n -= amt;
					}
					else {
						k = 0;
						n = 0;
						findOdd = true;
					}
				}
				else {
					if (k > 0) {
						freq[key]--;
						k--;
						n--;
					}
					else {
						cout<<"NOa\n";
						check1 = false;
						break;
					}
				}
				
			}
		}

		if (check1) {
			for (const auto &pair : freq) {
				char key = pair.first;
				if (k > freq[key]) {
					if (freq[key] % 2 == 0) {
						k -= freq[key];
						n -= freq[key];
					}
					else {
						k -= (freq[key] - 1);
						n -= (freq[key] - 1);
					}
				}
				else {
					if (k % 2 == 0) {
						n -= k;
						k = 0;
						break;
					}
					else {
						cout<<"NOb\n";
						break;
					}
				}
			}
		}
		if (check1) {
			if (n > 0) {
				cout<<"YES\n";
			}
			else {
				cout<<"NOc\n";
			}
		}
	}

	return 0;
}