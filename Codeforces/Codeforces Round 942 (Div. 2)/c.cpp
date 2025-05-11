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

void solve() {
    long long n, k;
    cin>>n>>k;

    vector<long long> a(n);
    for (int x = 0; x < n; x++) {
        cin>>a[x];
    }
    
    sort(a.begin(), a.end());

    long long num_equal = 1;

    while (k > 0 && num_equal < n) {
        long long diff = a[num_equal] - a[0];
        long long cost = diff * num_equal;

        if (cost <= k) {
            k -= cost;
            a[0] += diff;

            while (num_equal < n && a[num_equal] == a[0]) {
                num_equal++;
            }              
        }
        else {
            long long increment = k / num_equal;
            a[0] += increment;
            k -= increment * num_equal;
            break;
        }
    }

    a[0] += k / num_equal;
    k %= num_equal;

    cout << a[0] * n + 1 - num_equal + k << "\n";
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
