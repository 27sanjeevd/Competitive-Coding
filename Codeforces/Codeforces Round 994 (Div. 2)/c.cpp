#include <iostream>
#include <vector>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n, x, y;
        cin>>n>>x>>y;

        x--;
        y--;

        vector<int> vals(n);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                vals[(i+x)%n] = 0;
            }
            else {
                vals[(i+x)%n] = 1;
            } 
        }

        if (n % 2 == 1) {
            vals[x] = 2;
        }
        if ((x - y) % 2 == 0) {
            vals[x] = 2;
        }

        for (int x = 0; x < n-1; x++) {
            cout << vals[x] << " ";
        }
        cout << vals[n-1] << "\n";
    }
}