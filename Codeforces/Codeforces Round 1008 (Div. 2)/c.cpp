#include <iostream>
#include <vector>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        vector<long long> nums(2 * n);

        for (int x = 0; x < 2 * n; x++) {
            cin>>nums[x];
        }

        long long sum1 = 0;
        for (int x = 0; x < 2 * n; x++) {
            if (x % 2 == 0) {
                sum1 += nums[x] * -1;
            }
            else {
                sum1 += nums[x];
            }
        }

        if (sum1 > 0) {
            cout << sum1;
            for (int x = 0; x < 2 * n; x++) {
                cout << " " << nums[x];
            }
            cout << "\n";
        }
        else {
            long long left = nums[0];

            for (int x = 0; x < 2 * n; x++) {
                sum1 = 0;

                for (int y = 0; y < 2 * n; y++) {
                    int new_index = y;
                    if (y >= x) {
                        new_index++;
                    }

                    if (new_index % 2 == 0) {
                        sum1 += nums[y] * -1;
                    }
                    else {
                        sum1 += nums[y];
                    }
                }

                if (sum1 > 0) {
                    cout << sum1;
                    for (int x = 0; x < 2 * n; x++) {
                        cout << " " << nums[x];
                    }
                    cout << "\n";
                    break;
                }
            }
        }
    }
}