#include <iostream>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;
        
        int q;
        cin>>q;

        while (q--) {

            char dir;
            cin>>dir;

            if (dir == '-') {
                cin>>dir;

                int x, y;
                cin>>x>>y;

                int x_beg = 0;
                int x_end = 1 << n;
                int y_beg = 0;
                int y_end = 1 << n;

                int counter = 0;
                
                while (x_end - x_beg + 1 > 2) {
                    counter *= 4;

                    int x_mid = (x_end + x_beg) >> 1;
                    int y_mid = (y_end + y_beg) >> 1;

                    if (x > x_mid && y > y_mid) {
                        counter += 1;
                        x_beg = x_mid;
                        y_beg = y_mid;
                    }
                    else if (x > x_mid && y <= y_mid) {
                        counter += 2;
                        x_beg = x_mid;
                        y_end = y_mid;
                    }
                    else if (x <= x_mid && y > y_mid) {
                        counter += 3;
                        x_end = x_mid;
                        y_beg = y_mid;
                    }
                    else {
                        x_end = x_mid;
                        y_end = y_mid;
                    }
                }

                int x_mid = (x_end + x_beg) >> 1;
                int y_mid = (y_end + y_beg) >> 1;

                if (x > x_mid && y > y_mid) {
                    counter += 1;
                    x_beg = x_mid;
                    y_beg = y_mid;
                }
                else if (x > x_mid && y <= y_mid) {
                    counter += 2;
                    x_beg = x_mid;
                    y_end = y_mid;
                }
                else if (x <= x_mid && y > y_mid) {
                    counter += 3;
                    x_end = x_mid;
                    y_beg = y_mid;
                }
                else {
                    x_end = x_mid;
                    y_end = y_mid;
                }

                cout << counter << "\n";
            }
            else {
                cin>>dir;

                int d;
                cin>>d;

                int largest = (1 << n) * (1 << n);

                int x_beg = 0;
                int x_end = 1 << n;
                int y_beg = 0;
                int y_end = 1 << n;

                while (x_end - x_beg> 2) {
                    int baseline = 0;

                    int x_mid = (x_end + x_beg) >> 1;
                    int y_mid = (y_end + y_beg) >> 1;

                    if (d <= largest / 4) {
                        x_end = x_mid;
                        y_end = y_mid;
                    }
                    else if (d <= largest / 2) {
                        baseline = largest / 4;

                        x_beg = x_mid;
                        y_beg = y_mid;
                    }
                    else if (d <= largest * 3 / 4) {
                        baseline = largest / 2;

                        x_beg = y_mid;
                        y_end = y_mid;
                    }
                    else {
                        baseline = largest * 3 / 4;

                        x_end = x_mid;
                        y_beg = y_mid;
                    }

                    d -= baseline;
                    largest /= 4;


                    /*
                    cout << x_beg << " " << x_end << " " << y_beg << " " << y_end << "\n";
                    cout << d << " " << largest << "\n";
                    cout << "-------\n";
                    */
                }

                int x_mid = (x_end + x_beg) >> 1;
                int y_mid = (y_end + y_beg) >> 1;

                if (d == 1) {
                    cout << (x_beg + 1) << " " << (y_beg + 1) << "\n";
                }
                else if (d == 2) {
                    cout << (x_beg + 2) << " " << (y_beg + 2) << "\n";
                }
                else if (d == 3) {
                    cout << (x_beg + 2) << " " << (y_beg + 1) << "\n";
                }
                else {
                    cout << (x_beg + 1) << " " << (y_beg + 2) << "\n";
                }
            }
        }
    }
}