#include <iostream>
#include <cstdlib>
#include <vector>

using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<int> nums(n);
        int sum = 0;
        for (int x = 0; x < n; x++) {
            cin>>nums[x];
            sum += nums[x];
        }

        int avg = sum/n;
        int overflow = 0;
        bool found = false;
        for (int x = 0; x < n; x++) {
            if (nums[x] > avg) {
                overflow += (nums[x] - avg);
            }
            else {
                overflow -= (avg - nums[x]);
                if (overflow < 0) {
                    cout << "NO\n";
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            cout << "YES\n";
        }
    }

    return 0;
}
