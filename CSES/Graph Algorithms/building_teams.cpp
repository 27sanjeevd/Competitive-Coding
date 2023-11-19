#include <iostream>
#include <cstdlib>
#include <unordered_set>
#include <vector>

using namespace std;

int main() {
	int n, m;
	cin>>n>>m;
	vector<vector<int>> adj(n);
	for (int x = 0; x < m; x++) {
		int first, second;
		cin>>first>>second;
		adj[first-1].push_back(second-1);
		adj[second-1].push_back(first-1);
	}

	unordered_set<int> a, b, visited;
	for (int x = 1; x <= n; x++) {

		vector<int> temp = adj[x-1];
		if (a.count(x) > 0) {
			for (int y = 0; y < temp.size(); y++) {
				if (a.count(temp[y]) > 0) {
					cout<<"IMPOSSIBLE";
					return 0;
				}
				else {
					b.insert(temp[y]);
				}
			}
		}
		else if (b.count(x) > 0) {
			for (int y = 0; y < temp.size(); y++) {
				if (b.count(temp[y]) > 0) {
					cout<<"IMPOSSIBLE";
					return 0;
				}
				else {
					a.insert(temp[y]);
				}
			}
		}
		else {
			a.insert(x);
			for (int y = 0; y < temp.size(); y++) {
				if (a.count(temp[y]) > 0) {
					cout<<"IMPOSSIBLE";
					return 0;
				}
				else {
					b.insert(temp[y]);
				}
			}
		}
	}

	for (int x = 1; x <= n; x++) {
		if (a.count(x) > 0) {
			cout<<"1 ";
		}
		else {
			cout<<"2 ";
		}
	}

	return 0;
}