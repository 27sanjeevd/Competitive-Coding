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

    vector<int> vals(n);
    for (int x = 0; x < n; x++) {
        int temp;
        cin>>temp;
        vals[x] = abs(temp);
    }

    int target = vals[0];

    sort(vals.begin(), vals.end());

    //cout << target << " " << vals[n/2] << "\n";
    //cout << "-----\n";

    if (vals[n/2] < target) {
        cout << "NO\n";
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
