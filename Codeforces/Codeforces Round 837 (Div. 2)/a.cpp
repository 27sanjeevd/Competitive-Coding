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
    int n;
    cin>>n;

    vector<long long> a(n);
    for (int x = 0; x < n; x++) {
        cin>>a[x];
    }

    sort(a.begin(), a.end());

    if (a[0] == a.back()) {
        cout << 1LL * n * (n-1LL) << "\n";
        return;
    }
    long long num_largest = 0;
    long long num_smallest = 0;

    for (int x = 0; x < n; x++) {
        if (a[x] == a[0]) {
            num_smallest++;
        }
        else {
            break;
        }
    }

    for (int x = n-1; x >=0; x--) {
        if (a[x] == a.back()) {
            num_largest++;
        }
        else {
            break;
        }
    }

    cout << 2LL * num_largest * num_smallest << "\n";
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
