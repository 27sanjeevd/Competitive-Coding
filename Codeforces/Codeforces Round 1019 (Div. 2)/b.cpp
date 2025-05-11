#include <iostream>
#include <string>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        string s;
        cin>>s;

        s = '0' + s;

        int num_swaps = 0;
        for (int x = 1; x < s.size(); x++) {
            if (s[x] != s[x-1]) {
                num_swaps++;
            }
        }

        if (num_swaps == 0) {
            cout << n << "\n";
        }
        else if (num_swaps == 1 || num_swaps == 2) {
            cout << n + 1 << "\n";
        }
        else {
            cout << n + num_swaps - 2 << "\n";
        }
    }
}