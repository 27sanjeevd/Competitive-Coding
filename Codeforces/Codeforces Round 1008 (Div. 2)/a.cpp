#include <iostream>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n, x;
        cin>>n>>x;

        int sum = 0;
        int temp;

        int n1 = n;
        while (n1--) {
            cin>>temp;
            sum += temp;
        }

        if (sum % n == 0 && sum / n == x) {
            cout << "YES\n";
        }
        else {
            cout << "NO\n";
        }
    }
}