#include <iostream>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        int num_wrong = 0;
        for (int x = 0; x < n; x++) {
            int temp;
            cin>>temp;

            if (temp == (x+1)) {
                num_wrong++;
            }
        }

        int output = 0;
        output += (num_wrong / 2);

        if (num_wrong % 2 == 1) {
            output++;
        }

        cout << output << "\n";
    }
}