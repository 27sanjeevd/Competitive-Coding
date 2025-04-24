#include <iostream>
#include <vector>
#include <climits>

using namespace std;

int main() {
    int t;
    cin>>t;
    while (t--) {
        int n;
        cin>>n;
        vector<int> vals(n);
        for (int x = 0; x < n; x++) {
            cin>>vals[x];
        }

        int output = INT_MAX;
        for (int x = 0; x < vals.size() - 1; x++) {
            output = min(output, max(vals[x], vals[x+1]));
	}

        cout << output-1 << "\n";
    }

    return 0;
}
