#include <iostream>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n, k;
        cin>>n>>k;

        for (int x = 1; x < n; x++) {
            if (k % 2 == 1) {
                cout << n << " ";
            } 
            else {
                if (x == n-1) {
                    cout << n << " ";
                }
                else {
                    cout << (n-1) << " ";
                }
            }
        }
        cout << (n-1) << "\n";
    }
}