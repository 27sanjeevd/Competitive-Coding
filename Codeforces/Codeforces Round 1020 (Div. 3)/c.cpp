#include <iostream>
#include <vector>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n, k;
        cin>>n>>k;

        vector<int> a(n);
        vector<int> b(n);

        int largest = -1;
        int smallest = INT_MAX;

        for (int x = 0; x < n; x++) {
            cin>>a[x];
            largest = largest > a[x] ? largest : a[x];
            smallest = smallest < a[x] ? smallest : a[x];
        }

        for (int x = 0; x < n; x++) {
            cin>>b[x];
        }

        int sum = -1;

        bool continue1 = true;
        
        for (int x = 0; x < n; x++) {
            if (b[x] != -1) {
                int temp_sum = a[x] + b[x];
                if (sum == -1) {
                    sum = temp_sum;
                }
                else {
                    if (sum != temp_sum) {
                        continue1 = false;
                        cout << 0 << "\n";
                        break;
                    }
                }
            }
        }

        if (continue1) {
            //cout << n << " " << k << " " << sum << " " << largest << " " << smallest << "\n";
            if (sum != -1 && sum < largest) {
                cout << 0 << "\n";
            }
            else if (sum != -1) {
                if (smallest + k >= sum) {
                    cout << 1 << "\n";
                }
                else {
                    cout << 0 << "\n";
                }
                //cout << 1 << "\n";
            }
            else {
                cout << k - (largest - smallest) + 1 << "\n";
            }
        }

        //cout << "----------------\n";
    }
}