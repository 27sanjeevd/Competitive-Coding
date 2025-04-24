#include <iostream>
#include <cstdlib>
#include <unordered_map>
#include <vector>

using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;

        vector<int> vals(n);
        for (int x = 0; x < n; x++) {
            int temp;
            cin>>temp;
            vals[x] = temp;
        }
        int pre1 = 1;
        for (int x = 1; x < n && vals[x] == vals[0]; x++) {
            pre1++;
        }

        int end1 = 1;
        for (int x = n-2; x >= 0 && vals[x] == vals[n-1]; x--) {
            end1++;
        }

        if (vals[0] == vals[n-1]) {
            if (pre1+end1 >= n) {
                cout << 0 << "\n";
            }
            else {
                cout << n - (pre1 + end1) << "\n";
            }
        }
        else {
            if (pre1 > end1) {
                cout << n - pre1 << "\n";
            }
            else {
                cout << n - end1 << "\n";
            }
        }

    }

    return 0;
}
