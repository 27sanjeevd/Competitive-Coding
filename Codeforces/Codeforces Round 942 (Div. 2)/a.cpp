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
    int n;
    cin>>n;

    vector<int> a(n);
    vector<int> b(n);

    for (int x = 0; x < n; x++) {
        cin>>a[x];
    }
    for (int x = 0; x < n; x++) {
        cin>>b[x];
    }

    int added = 0;
    int a_index = 0;
    for (int x = 0; x < n; x++) {
        if (a[a_index] <= b[x]) {
            a_index++;
            continue;
        }

        added++;
    }

    cout << added << "\n";
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
