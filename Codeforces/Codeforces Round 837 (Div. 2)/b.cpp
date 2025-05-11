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

using namespace std;

void solve() {
    int n, m;
    cin>>n>>m;

    vector<int> a(n, n);

    for (int i = 0; i < m; i++) {
        int x, y;
        cin>>x>>y;

        a[min(x,y)] = min(a[min(x,y)], max(x,y)-1);
    }

    for (int x = n-2; x >= 0; x--) {
        a[x] = min(a[x], a[x+1]);
    }

    long long output = 0;
    for (int x = 0; x < n; x++) {
        output += (a[x] - x);
    }

    cout << output + n << "\n";
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin>>t;

    while (t--) {
        solve();
    }
}
