#include <iostream>
#include <cstdlib>
#include <unordered_set>
#include <vector>

using namespace std;

vector<vector<int>> adj(100002);
vector<bool> visited(100002);

void dfs(int node) {
	if (!visited[node]) {
		visited[node] = true;

		for (int y = 0; y < adj[node].size(); y++) {
			dfs(adj[node][y]);
		}
	}
}

int main() {
	int n, m;
	cin>>n>>m;

	vector<vector<int>> output;

	for (int x = 0; x < m; x++) {
		int a, b;
		cin>>a>>b;
		adj[a].push_back(b);
		adj[b].push_back(a);
	}

	dfs(1);
	for (int x = 1; x <= n; x++) {
		if (!visited[x]) {
			output.push_back({1, x});
			adj[1].push_back(x);
			adj[x].push_back(1);

			dfs(x);
		}
	}

	cout<<output.size()<<"\n";
	for (int y = 0; y < output.size(); y++) {
		cout<<output[y][0]<<" "<<output[y][1]<<"\n";
	}

	return 0;
}