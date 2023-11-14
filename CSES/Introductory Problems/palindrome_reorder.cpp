#include <iostream>
#include <vector>
#include <cstdlib>
#include <unordered_map>

using namespace std;

int main() {
	string word;
	cin>>word;

	unordered_map<char, int> freq;

	for (int x = 0; x < word.length(); x++) {
		freq[word[x]]++;
	}

	string output;
	bool check1 = true;

	for (const auto &pair : freq) {
		char key = pair.first;

		int amt = pair.second;
		if (amt % 2 == 1) {
			if (output.length() % 2 == 1) {
				cout<<"NO SOLUTION";
				check1 = false;
				break;
			}
			else {
				int add_amt = amt/2;
				output.insert(output.length()/2, 1, key);
				output.insert(0, add_amt, key);
				output.append(add_amt, key);
			}
		}
		else {
			int add_amt = amt/2;
			output.insert(0, add_amt, key);
			output.append(add_amt, key);
		}
	}

	if (check1) {
		cout<<output;
	}

	return 0;
}