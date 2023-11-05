#include <iostream>
#include <cstdlib>

using namespace std;

int main() {
	int n;
	cin>>n;
	int amt = n;

	vector<int> curr;
	int sum = 0;

	while (n--) {
		int a;
		cin>>a;

		curr.push_back(a);
		sum += a;
	}

	int x;
	cin>>x;

	int div1 = x / sum;
	int temp1 = div1 * sum;

	int output = div1 * amt;
	for (int y = 0; y < curr.size(); y++) {
		temp1 += curr[y];

		if (temp1 >= x) {
			cout<<output + 1<<"\n";
			return 0;
		}
		else {
			output++;
		}
	}

	return 0;
}