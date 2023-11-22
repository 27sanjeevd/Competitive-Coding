#include <iostream>
#include <cstdlib>
#include <vector>

using namespace std;

int main() {
	int n, m;
	cin>>n>>m;

	vector<vector<int>> adj(n + 1);
	for (int x = 0; x < m; x++) {
		int a, b;
		cin>>a>>b;
		adj[a].push_back(b);
		adj[b].push_back(a);
	}

	vector<pair<int, int> bfs;
	bool foundB = false;
	bfs.push_back(make_pair(1, 1));

	while (bfs.size() > 0 && !foundB) {
		auto it = bfs[0];
		int node = it.first;
		int pos = it.second;

		if (node == n) {
			cout<<pos;
		}
	}
}