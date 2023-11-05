#include <iostream>
#include <cstdlib>

using namespace std;

int main() {
	string temp;
	cin>>temp;

	char current;
	long long max_length = 0;
	long long curr = 0;

	for (int x = 0; x < temp.length(); x++) {
		if (temp[x] == current) {
			curr++;
		}
		else {
			if (curr > max_length) max_length = curr;
			current = temp[x];
			curr = 1;
		}
	}

	if (curr > max_length) max_length = curr;
	cout<<max_length;

	return 0;
}