#include <iostream>
#include <cstdlib>
#include <unordered_set>
#include <vector>

using namespace std;

int main() {
	int n, m;
	cin>>n>>m;
	int main = -1;
	unordered_set<int> group;
	vector<vector<int>> output;

	for (int x = 0; x < m; x++) {
		int a, b;
		cin>>a>>b;

		if (x == 0) {
			main = a;
			group.insert(a);
			group.insert(b);
		}
		else {
			if (group.count(a) > 0 && group.count(b) > 0) {
				continue;
			}
			else if (group.count(a) > 0) {
				group.insert(b);
			}
			else if (group.count(b) > 0) {
				group.insert(a);
			}
			else {
				group.insert(a);
				group.insert(b);
				output.push_back({main, a});
			}
		}
	}

	for (int x = 1; x <= n; x++) {
		if (group.count(x) == 0) {
			output.push_back({main, x});
		}
	}

	cout<<output.size()<<"\n";
	for (int x = 0; x < output.size(); x++) {
		cout<<output[x][0]<<" "<<output[x][1]<<"\n";
	}

	return 0;
}