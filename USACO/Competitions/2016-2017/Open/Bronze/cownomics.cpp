#include <iostream>
#include <fstream>
#include <cstdlib>
#include <set>
#include <vector>

using namespace std;

int main() {
	ifstream fin("cownomics.in");
	ofstream fout("cownomics.out");

	int n, m;
	fin>>n>>m;

	vector<vector<char>> spotted(n, vector<char>(m));
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			fin>>spotted[i][j];
		}
	}

	vector<vector<char>> plain(n, vector<char>(m));
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			fin>>plain[i][j];
		}
	}

	int output = 0;
	for (int x = 0; x < m; x++) {
		set<char> found;
		for (int y = 0; y < n; y++) {
			found.insert(plain[y][x]);
		}

		bool dupe = false;
		for (int y = 0; y < n; y++) {
			if (found.count(spotted[y][x]) >= 1) {
				dupe = true;
			}
		}

		if (!dupe) {
			output++;
		}
	}

	fout<<output;
	return 0;

}