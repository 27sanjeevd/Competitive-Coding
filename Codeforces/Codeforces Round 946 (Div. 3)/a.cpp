#include <iostream>
#include <cstdlib>
#include <vector>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int x, y;
        cin>>x>>y;

        int ans = 0, extra1 = 0;
        if (y % 2 == 0) {
            ans = y / 2;
        }
        else {
            ans = (y-1) / 2;
            extra1 = 1;
        }

        int num1s = ans * 7 + extra1 * 11;
        ans += extra1;

        if (x > num1s) {

            ans += (x - num1s + 14) / 15;
        }

        cout << ans << "\n";
    }

    return 0;
}