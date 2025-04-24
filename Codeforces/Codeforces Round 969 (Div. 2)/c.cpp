#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }

    return gcd(b, a % b);
}

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n, a, b;
        cin>>n>>a>>b;

        int delta = gcd(a, b);

        vector<int> vals(n);

        for (int x = 0; x < n; x++) {
            cin>>vals[x];
            vals[x] = vals[x] % delta;
        }

        sort(vals.begin(), vals.end());

        int smallest_diff = INT_MAX;
        smallest_diff = smallest_diff < vals[vals.size() - 1] - vals[vals.size() - 1 - n] ? smallest_diff : vals[vals.size() - 1] - vals[vals.size() - 1 - n];

        for (int x = 0; x < n; x++) {
            vals.push_back(vals[x] + delta);
            smallest_diff = smallest_diff < vals[vals.size() - 1] - vals[vals.size() - 1 - n] ? smallest_diff : vals[vals.size() - 1] - vals[vals.size() - 1 - n];
        }

        cout << smallest_diff << "\n";
    }
}