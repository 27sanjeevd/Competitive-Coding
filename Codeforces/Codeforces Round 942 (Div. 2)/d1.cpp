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

    long long output = n;
    for (long long x = 2; x <= m; x++) {
        output += ((n+x) / (x*x));
    }

    cout << output << "\n";
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

