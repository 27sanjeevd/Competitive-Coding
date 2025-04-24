#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<int> vals(n);
        for (int i = 0; i < n; i++) {
            cin >> vals[i];
        }
        
        bool foundError = false;
        
        for (int i = 1; i < n - 1; i++) {
            if (vals[i-1] < 0) {
                foundError = true;
                break;
            }

            int amt = vals[i-1];
            vals[i-1] = 0;
            vals[i] -= (amt * 2);
            vals[i+1] -= amt;
        }
        
        for (int i = 0; i < n; i++) {
            if (vals[i] != 0) {
                foundError = true;
                break;
            }
        }

        if (!foundError) {
            cout << "YES\n";
        } else {
            cout << "NO\n";
        }
    }

    return 0;
}
