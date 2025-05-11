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

        if (s[0] == s[s.size() - 1]) {
            cout << "NO\n";
        }
        else {
            cout << "YES\n";
        }
    }
}