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
    n = 30;
    m = 8;

    for (int x = 1; x <= n; x++) {
        for (int y = 1; y <= m; y++) {
            int a = x + y;
            int b = y * gcd(x, y);

            if (a % b == 0) {
                cout << a << " " << b << " | " << x << " " << y << "\n";
            }
        }
    }
    cout << "-\n";
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
