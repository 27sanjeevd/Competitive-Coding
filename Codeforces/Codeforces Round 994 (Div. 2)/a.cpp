#include <iostream>
#include <vector>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        int num_zero = 0;

        vector<int> a(n);
        for (int x = 0; x < n; x++) {
            cin>>a[x];
            if (a[x] == 0) {
                num_zero++;
            }
        }

        if (num_zero == n) {
            cout << "0\n";
            continue;
        }
        else if (num_zero == 0) {
            cout << "1\n";
            continue;
        }

        bool found_left = false;
        bool zero_after_left = false;
        bool found_right = false;

        for (int x = 0; x < n; x++) {
            if (a[x] == 0) {
                if (found_left) {
                    zero_after_left = true;
                }
            }
            else {
                found_left = true;
                if (zero_after_left) {
                    found_right = true;
                }
            }
        }

        if (found_left && found_right) {
            cout << "2\n";
        }
        else {
            cout << "1\n";
        }
    }
}