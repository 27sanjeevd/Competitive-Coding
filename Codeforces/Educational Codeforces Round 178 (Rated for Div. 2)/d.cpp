#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<long long> first_k(int k) {
    vector<long long> output;
    if (k == 0) {
        return output;
    }

    output.push_back(2);
    for (int x = 3; output.size() < k; x += 2) {
        bool isPrime = true;
        for (long long o : output) {
            if (o * o > x) {
                break;
            }
            if (x % o == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            output.push_back(x);
        }
    }

    return output;
}

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        vector<long long> vals(n);
        for (int x = 0; x < n; x++) {
            cin>>vals[x];
        }

        sort(vals.begin(), vals.end(), greater<long long>());

        vector<long long> primes = first_k(n);

        if (n == 1) {
            if (vals[0] >= 2) {
                cout << "0\n";
            }
            else {
                cout << "1\n";
            }
            continue;
        }

        long long num_carry = 0;
        bool outputed = false;

        for (int x = 0; x < n; x++) {
            if (vals[x] > primes[x]) {
                num_carry += (vals[x] - primes[x]);
            }
            else {
                long long diff = primes[x] - vals[x];
                if (diff > num_carry) {
                    cout << (n-x) << "\n";
                    outputed = true;
                    break;
                }
                else {
                    num_carry -= diff;
                }
            }
        }

        if (!outputed) {
            cout << 0 << "\n";
        }
    }
}