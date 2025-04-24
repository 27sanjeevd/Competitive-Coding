#include <iostream>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n, x;
        cin>>n>>x;

        for (int y = 0; y < n; y++) {
            if (y != x) {
                cout << y << " ";
            }
        }

        if (x < n) {
            cout << x << "\n";
        }
        else {
            cout << "\n";
        }
    }
}