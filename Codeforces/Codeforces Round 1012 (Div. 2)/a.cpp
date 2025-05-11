#include <iostream>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int x, y, a;
        cin>>x>>y>>a;


        int sum = x + y;
        int rem = a % sum;
        double real_rem = static_cast<double>(rem + 0.5);

        if (real_rem < static_cast<double>(x)) {
            cout << "NO\n";
        }
        else {
            cout << "YES\n";
        }
    }
}