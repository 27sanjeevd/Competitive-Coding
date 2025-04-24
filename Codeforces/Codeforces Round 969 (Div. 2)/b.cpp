#include <iostream>


using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n, m;
        cin>>n>>m;

        int largest = 0;
        int temp;

        while (n--) {
            cin>>temp;
            largest = largest > temp ? largest : temp;
        }

        while (m--) {
            char c;
            int l, r;
            cin>>c>>l>>r;

            if (l <= largest && r >= largest) {
                if (c == '+') {
                    largest++;
                }
                else {
                    largest--;
                }
            }

            cout << largest;
            if (m == 0) {
                cout << "\n";
            }
            else {
                cout << " ";
            }
        }
    }
}