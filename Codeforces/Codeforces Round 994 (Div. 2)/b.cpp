#include <iostream>
#include <vector>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        int non_dot = 0;
        int num_s = 0;
        int num_p = 0;

        vector<char> s(n);
        for (int x = 0; x < n; x++) {
            cin>>s[x];
            if (s[x] != '.') {
                non_dot++;
            }

            if (s[x] == 's') {
                num_s++;
            }
            else if (s[x] == 'p') {
                num_p++;
            }
        }

        //cout << ": " << num_s << " " << num_p << "\n";

        if (s[0] == 's') {
            s[0] = '.';
            num_s--;
        }
        if (s[n-1] == 'p') {
            s[n-1] = '.';
            num_p--;
        }

        //cout << ": " << num_s << " " << num_p << "\n";

        if (num_s > 0 && num_p > 0) {
            cout << "NO\n";
        }
        else {
            cout << "YES\n";
        }
    }
}