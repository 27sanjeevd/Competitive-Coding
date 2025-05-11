#include <iostream>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        int odd_enter = 0;
        int even_enter = 0;

        char temp;
        for (int x = 0; x < n; x++) {
            cin>>temp;

            if (temp == '1') {
                if (x % 2 == 0) {
                    even_enter++;
                }
                else {
                    odd_enter++;
                }
            }
        }

        int odd_space = 0;
        int even_space = 0;
        for (int x = 0; x < n; x++) {
            cin>>temp;

            if (temp == '0') {
                if (x % 2 == 0) {
                    even_space++;
                }
                else {
                    odd_space++;
                }
            }
        }

        //cout << even_space << " " << even_enter << " " << odd_space << " " << odd_enter << "\n";

        if (odd_space >= even_enter && even_space >= odd_enter) {
            cout << "YES\n";
        }
        else {
            cout << "NO\n";
        }
    }
}