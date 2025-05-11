#include <iostream>

using namespace std;

int main() {
    long long n, m, a;
    cin>>n>>m>>a;

    int x_offset = 0;
    if (n % a != 0) {
        x_offset = 1;
    }

    int y_offset = 0;
    if (m % a != 0) {
        y_offset = 1;
    }

    long long answer =  (n / a + x_offset) * (m / a + y_offset);
    cout << answer << "\n";
}