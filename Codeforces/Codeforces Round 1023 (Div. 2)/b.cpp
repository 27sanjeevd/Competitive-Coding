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
    int n, k;
    cin>>n>>k;

    vector<int> a(n);
    for (int i = 0; i < n; ++i) {
        cin >> a[i];
    }
    
    long long total = accumulate(a.begin(), a.end(), 0LL);

    sort(a.begin(), a.end());
    a[n-1]--;
    sort(a.begin(), a.end());

    if (a[n-1] - a[0] > k || total % 2 == 0) {
        cout << "Jerry\n";
    }
    else {
        cout << "Tom\n";
    }
    
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    while (t--) {
        solve();
    }
    return 0;
}