#include <iostream>
#include <vector>
#include <unordered_map>
#include <map>
#include <unordered_set>
#include <set>
#include <algorithm>
#include <climits>
#include <utility>
#include <iterator>
#include <string>
#include <numeric>

#define int long long

using namespace std;

void solve() {
    int n;
    cin>>n;
    
    struct Cell {
        int w; 
        int x;
        int y; 
    };

    vector<Cell> cells;

    for (int x = 0; x < n; x++) {
        for (int y = 0; y < n; y++) {
            int weight = (x+1) * (y+1) * (n-x) * (n-y);
            cells.emplace_back(weight, x, y);
        }
    }

    sort(cells.begin(), cells.end(),
        [](auto &a, auto &b) { return a.w <= b.w; });

    vector<vector<int>> grid(n, vector<int>(n));
    for (int i = 0; i < n*n; i++) {
        Cell temp = cells.back();
        cells.pop_back();
        grid[temp.x][temp.y] = i;
    }

    for (int x = 0; x < n; x++) {
        for (int y = 0; y < n; y++) {
            cout << grid[x][y] << " ";
        }
        cout << "\n";
    }
}

#undef int
int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin>>t;

    while (t--) {
        solve();
    }
}
