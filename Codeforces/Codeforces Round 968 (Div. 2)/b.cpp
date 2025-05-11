#include <iostream>
#include <algorithm>
#include <vector>

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

        sort(a.begin(), a.end());


        if (a.size() % 2 == 1) {
            cout << a[a.size() / 2] << "\n";
        }
        else {
            cout << max(a[a.size() / 2 - 1], a[a.size() / 2]) << "\n";
        }
    }
}