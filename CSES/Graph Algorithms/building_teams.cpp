#include <iostream>
#include <cstdlib>
#include <unordered_set>
#include <vector>

using namespace std;

vector<vector<int>> adj(100002);
vector<int> visited(100002);
bool continue1 = true;

void dfs(int node, int color) {
	if (continue1 && visited[node] == 0) {
		visited[node] = color;
		for (int y = 0; y < adj[node].size(); y++) {
			if (visited[adj[node][y]] == color) {
				cout<<"IMPOSSIBLE\n";
				continue1 = false;
			}
			else {
				dfs(adj[node][y], color * -1);
			}
		}
	}
}

int main() {
	int n, m;
	cin>>n>>m;
	for (int x = 0; x < m; x++) {
		int first, second;
		cin>>first>>second;
		adj[first].push_back(second);
		adj[second].push_back(first);
	}

	dfs(1, 1);
	for (int x = 1; x <= n; x++) {
		if (continue1 && visited[x] == 0) {
			dfs(x, 1);
		}
	}

	if (continue1) {
		for (int x = 1; x <= n; x++) {
			if (visited[x] == 1) {
				cout<<"2 ";
			}
			else {
				cout<<"1 ";
			}
		}
	}

	return 0;
}