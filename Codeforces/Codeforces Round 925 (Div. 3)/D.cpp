#include <iostream>
#include <cstdlib>
#include <unordered_map>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	int t;
	cin>>t;

	while (t--) {
		unordered_map<int, vector<int>> Xs, Ys;

		int x, y, n;
		cin>>n>>x>>y;

		int output = 0;

		for (int i = 0; i < n; i++) {
			int temp;
			cin>>temp;

			/*
			vector<int> X1 = Xs[x - (temp % x)];
			vector<int> Y1 = Ys[temp & y];

			cout << temp % x << " " << temp % y << " " << X1.size() << " " << Y1.size() << "\n";

			sort(X1.begin(), X1.end());
			sort(Y1.begin(), Y1.end());
			vector<int> common;

			set_intersection(
				X1.begin(), X1.end(),
				Y1.begin(), Y1.end(),
				back_inserter(common)
			);
			output += common.size();
			*/

			cout << Xs[x - (temp % x)].size() << "\n";

			Xs[temp % x].push_back(i);
			Ys[temp % y].push_back(i);

		}

		cout << output << "\n";
	}

	return 0;
}