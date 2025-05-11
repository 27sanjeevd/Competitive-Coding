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

using namespace std;

int gcd(int x,int y) { 
    return y ? gcd(y, x%y) : x;
}

void solve() {
    int n;
    cin>>n;

    vector<int> a(n);
    for (int x = 0; x < n; x++) {
        cin>>a[x];
    }

    int g = 0;
    for (int x = 0; x < n; x++) {
        g = gcd(g, a[x]);
    }

    bool allSame = true;
    for (int x = 1; x < n; x++) {
        if (a[x] != a[0]) {
            allSame = false;
            break;
        }
    }

    if (allSame) {
        cout << "NO\n";
        return;
    }
    
    
    bool found = false;
    for (int x = 0; x < n; x++) {
        int currentGcd = 0;
        for (int y = 0; y < n; y++) {
            if (x == y) {
                continue;
            }

            if (currentGcd == 0) {
                currentGcd = a[y];
            } else {
                currentGcd = gcd(currentGcd, a[y]);
            }
        }

        if (currentGcd != a[x]) {
            cout << "YES\n";
            for (int k = 0; k < n; k++) {
                cout << (k == x ? "1 " : "2 ");
            }
            cout << "\n";
            found = true;
            break;
        }
    }

    if (!found) {
        cout << "NO\n";
    }
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
