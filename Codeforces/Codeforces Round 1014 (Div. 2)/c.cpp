#include <iostream>
#include <vector>
#include <deque>
#include <algorithm>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        deque<int> a(n-1);

        int max_val = -1;

        int curr;
        cin>>curr;

        max_val = max(max_val, curr);

        for (int x = 0; x < n-1; x++) {
            cin>>a[x];
            max_val = max(max_val, a[x]);
        }

        int counter = 0;
        while (counter < n-1 && (a.front() + curr) % 2 == 0) {
            int temp = a.front();
            a.pop_front();
            a.push_back(temp);

            counter++;
        }

        if (counter == n-1) {
            cout << max_val << "\n";
            continue;
        }

        int num_ones = 0;
        while (a.size() > 0) {
            int temp = a.front();
            a.pop_front();

            cout << curr << " " << temp << " " << a.size() << " " << num_ones << "\n";

            if ((curr + temp) % 2 == 1) {
                int div_amt = temp / 2;
                curr += div_amt * 2;
                temp -= div_amt * 2;

                if (temp == 1) {
                    num_ones++;
                }
            }
            else {
                if (num_ones > 0) {
                    curr++;
                    num_ones--;
                } 
                else {
                    if (a.size() == 0) {
                        break;
                    }
                    a.push_back(temp);
                }
            }
        }

        cout << curr << "\n";
    }
}
