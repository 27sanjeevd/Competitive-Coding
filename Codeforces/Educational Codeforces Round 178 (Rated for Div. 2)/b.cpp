#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        vector<long long> vals(n);
        vector<long long> curr_max;

        for (int x = 0; x < n; x++) {
            cin>>vals[x];
            if (x == 0) {
                curr_max.push_back(vals[x]);
            }
            else {
                curr_max.push_back(max(vals[x], curr_max.back()));
            }
        }

        vector<long long> suffix_sum(n);
        for (int x = n-1; x >= 0; x--) {
            if (x == n-1) {
                suffix_sum[x] = vals[x];
            }
            else {
                suffix_sum[x] = vals[x] + suffix_sum[x+1];
            }
        }

        for (int x = 0; x < n; x++) {
            if (x == 0) {
                cout << curr_max[n - 1 - x];
            }
            else {
                long long curr_sum = curr_max[n-1-x];
                curr_sum += suffix_sum[n-x];

                cout << " " << curr_sum;
            }
        }

        cout << "\n";
    }
}