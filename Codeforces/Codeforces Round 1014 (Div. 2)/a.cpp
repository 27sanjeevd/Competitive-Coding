#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        vector<int> a(n);
        for (int x = 0; x < n; x++) {
            cin>>a[x];
        }

        int output = 0;

        for (int x = 0; x < n - 1; x++) {
            for (int y = x+1; y < n; y++) {
                int diff = abs(a[x] - a[y]);

                if (diff == 0) {
                    output = max(output, a[x]);
                }
                else {
                    output = max(output, diff);
                }
            }
        }

        cout << output << "\n";
    }
}