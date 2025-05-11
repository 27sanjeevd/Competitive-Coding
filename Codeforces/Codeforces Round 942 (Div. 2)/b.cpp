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

    int num_up = 0;
    for (int x = 0; x < n; x++) {
        char temp;
        cin>>temp;

        if (temp == 'U') {
            num_up++;
        }
    }

    if (num_up % 2 == 0) {
        cout << "NO\n";
    }
    else {
        cout << "YES\n";
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