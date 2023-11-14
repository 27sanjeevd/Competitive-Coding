#include <iostream>
#include <cstdlib>

using namespace std;

int main() {
	string original;
	cin>>original;

	string new1;
	cin>>new1;

	int output = 0;
	bool isEqual = true;
	if (new1[0] != new1.back()) {
		isEqual = false;
	}

	int counter = 0;
	while (counter <= original.length() - new1.length()) {
		if (original.substr(counter, new1.length()) == new1) {
			output++;
			if (isEqual) {
				counter++;
			}
			else {
				counter += new1.length();
			}
		}
		else {
			counter++;
		}
	}

	cout<<output;
	return 0;
}