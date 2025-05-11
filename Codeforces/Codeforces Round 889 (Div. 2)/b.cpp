#include <iostream>

using namespace std;



int main() {
    int t;
    cin>>t;

    while (t--) {
        long long n;
        cin>>n;

        if (n % 2 == 1) {
            cout << 1 << "\n";
        }
        else {
            int num_valid = 0;
            long long curr = 1;
            while (n % curr == 0) {
                num_valid++;
                curr++;
            }

            cout << num_valid << "\n";
        }
    }
}