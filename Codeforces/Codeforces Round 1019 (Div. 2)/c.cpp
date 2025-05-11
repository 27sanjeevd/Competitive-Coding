#include <iostream>
#include <set>
#include <vector>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n, k;
        cin>>n>>k;

        vector<int> a(n);
        for (int x = 0; x < n; x++) {
            cin>>a[x];
            if (a[x] <= k) {
                a[x] = 0;
            }
            else {
                a[x] = 1;
            }
        }

        vector<int> left_valid;
        int sum = 0;
        for (int x = 0; x < n; x++) {
            sum += a[x];
            if (sum / (x+1) <= k) {
                left_valid.push_back(x);
            }
        }

        bool valid = false;
        int r_sum = 0;
        for (int x = n-1; x >= 0; x--) {
            r_sum += a[x];

            if (r_sum / (n - x) <= k) {}
        }
    }
}