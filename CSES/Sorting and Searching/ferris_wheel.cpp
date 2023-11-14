#include <iostream>
#include <cstdlib>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
	int n, x;
	cin>>n>>x;

	vector<int> children(n);
	for (int y = 0; y < n; y++) {
		cin>>children[y];
	}

	sort(children.begin(), children.end());

	int end = n - 1;
	int beg = 0;

	int output = 0;
	while (end > beg) {
		if (children[end] > x) {
			end--;
		}
		else {
			if (children[end] + children[beg] <= x) {
				output++;
				end--;
				beg++;
			}
			else {
				output++;
				end--;
			}
		}
	}

	if (end == beg) {
		output++;
	}

	cout<<output;
	return 0;
}