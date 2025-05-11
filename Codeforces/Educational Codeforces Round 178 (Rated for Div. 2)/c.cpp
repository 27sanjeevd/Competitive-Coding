#include <iostream>
#include <vector>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;
        vector<int> alice;
        vector<int> bob;

        for (int x = 0; x < n; x++) {
            char temp;
            cin>>temp;

            if (temp == 'A') {
                alice.push_back(x);
            }
            else {
                bob.push_back(x);
            }
        }

        if (n == 2) {
            if (alice[0] == 0) {
                cout << "Alice\n";
            }
            else {
                cout << "Bob\n";
            }
        }
        else if (alice.size() >= 2 && ((alice.front() == 0 && alice.back() == n-1) || (alice[alice.size() - 2] == n-2 && alice[alice.size() - 1] == n-1))) {
            cout << "Alice\n";
        }
        else if (bob.size() > 1) {
            cout << "Bob\n";
        }
        else {
            cout << "Alice\n";
        }
        //cout << "---------\n";
    }
}