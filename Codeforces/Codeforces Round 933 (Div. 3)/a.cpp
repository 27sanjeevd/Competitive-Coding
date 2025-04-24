#include <iostream>
#include <cstdlib>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n, m, k;
        cin>>n>>m>>k;

        vector<int> left(n), right(m);
        for (int x = 0; x < n; x++) {
            cin>>left[x];
        }
        for (int x = 0; x < m; x++) {
            cin>>right[x];
        }

        sort(left.begin(), left.end());
        sort(right.begin(), right.end());

        int output = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                if (left[x] + right[y] > k) {
                    break;
                }
                output++;
            }
        }

        cout << output << "\n";
    }

    return 0;
}