#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n, k;
        cin>>n>>k;

        vector<int> vals(n);
        for (int x = 0; x < n; x++) {
            cin>>vals[x];
        }
        //cout << "----------\n";

        sort(vals.begin(), vals.end());

        int r_bound = -1;
        int l_bound = -1;

        int new_size = n - k;

        r_bound = vals[k + (new_size) / 2];

        //cout << new_size << "\n";

        if (new_size % 2 == 0) {
            l_bound = vals[new_size / 2 - 1];
        }
        else {
            l_bound = vals[new_size / 2];
        }

        //cout << l_bound << " " << r_bound << "\n";
        cout << (r_bound - l_bound + 1) << "\n";
    }
}