#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int t;
    cin >> t;
    
    while (t--) {
        int n, m;
        cin >> n >> m;
        
        vector<int> a(n), b(m);
        
        for (int x = 0; x < n; x++) {
            cin >> a[x];
        }
        
        for (int x = 0; x < m; x++) {
            cin >> b[x];
        }
        
        
        int y = 0;
        for (int x = 0; x < n && y < m; x++) {
            if (b[y] <= a[x]) {
                y++;
            }
        }

        if (y == m) {
            cout << 0 << "\n";
            continue;
        }

        if (m > n + 1) {
            cout << -1 << "\n";
            continue;
        }

        

    }
    
    return 0;
}
