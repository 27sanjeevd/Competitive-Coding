#include <iostream>
#include <cstdlib>
#include <vector>

using namespace std;

int main() {
	int n;
	cin>>n;

	vector<int> curr;

	while (n--) {
		int a;
		cin>>a;

		curr.push_back(a);
	}

	int output = 0;
	for (int x = 0; x < curr.size() - 1; x++) {
		for (int y = x + 1; y < curr.size(); y++) {
			if (curr[x] != curr[y]) {
				output++;
			}
		}
	}

	cout<<output<<"\n";
	return 0;
}