#include <iostream>

using namespace std;

int count_ones(int num) {
    int count = 0;
    while (num > 0) {
        if (num % 10 == 1) {
            count++;
        }

        num /= 10;
    }
    return count;
}

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        int s;
        cin>>s;

        int num_ones = count_ones(s);

        int num_zeros = n - num_ones;

        int output = num_ones * (num_ones - 1) + num_zeros * (num_ones + 1);

        cout << output << "\n";
    }
}