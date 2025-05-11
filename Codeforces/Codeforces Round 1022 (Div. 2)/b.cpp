#include <iostream>
#include <bit>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        long long n, x;
        cin>>n>>x;

        if (n == 1) {
            if (x > 0) {
                cout << x << "\n";
            }
            else {
                cout << -1 << "\n";
            }
        }
        else if (n == 2) {
            if (x == 0) {
                cout << 2 << "\n";
            }
            else if (x == 1) {
                cout << 5 << "\n";
            }
            else {
                long long count = 0;
                long long temp = x;
                while (temp) {
                    count += temp & 1;
                    temp >>= 1;
                }

                if (count >= 2) {
                    cout << x << "\n";
                }
                else {
                    cout << x + 2 << "\n";
                }
            }
        }
        else {
            if (x == 0) {
                if (n % 2 == 0) {
                    cout << n << "\n";
                } else {
                    cout << n + 3 << "\n";
                }
            }
            else {
                long long count = 0;
                long long temp = x;
                while (temp) {
                    count += temp & 1;
                    temp >>= 1;
                }

                if (n <= count) {
                    cout << x << "\n";
                } 
                else {
                    if (x == 1) {
                        if (n % 2 == 1) {
                            cout << n << "\n";
                        }
                        else {
                            cout << 5 + (n-2) << "\n";
                        }
                    }
                    else {
                        long long diff = n - count;
                        if (diff % 2 == 0) {
                            cout << x + diff << "\n";
                        } 
                        else {
                            cout << x + diff + 1 << "\n";
                        }
                    }
                }
            }
        }
    }
}
