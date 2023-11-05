#include <iostream>
#include <cstdlib>
#include <unordered_set>

using namespace std;

int main() {
	int n;
	cin>>n;
	int val = n;

	unordered_set<int> set1;

	while (n--) {
		int a;
		cin>>a;

		if (set1.find(a) != set1.end() && a >= 1 && a <= val) {
			cout<<"NO\n";
			return 0;
		}
		else {
			set1.insert(a);
		}
	}

	cout<<"YES\n";
	return 0;
}