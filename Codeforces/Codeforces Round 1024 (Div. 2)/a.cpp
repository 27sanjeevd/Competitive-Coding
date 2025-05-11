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
    int n, m, p, q;
    cin>>n>>m>>p>>q;

    if (n % p == 0) {
        if (m == (n/p) * q) {
            cout << "YES\n";
        }
        else {
            cout << "NO\n";
        }
    } 
    else {
        cout << "YES\n";
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
