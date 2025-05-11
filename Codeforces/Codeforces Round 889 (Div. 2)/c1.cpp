#include <iostream>
#include <vector>
#include <utility>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        vector<pair<int, int>> output;

        int largest = -21;
        int largest_index = 0;

        int smallest = 21;
        int smallest_index = 0;

        vector<int> a(n);
        for (int x = 0; x < n; x++) {
            cin>>a[x];
    
            if (a[x] > largest) {
                largest = a[x];
                largest_index = x;
            }
            if (a[x] < smallest) {
                smallest = a[x];
                smallest_index = x;
            }
        }

        if (largest > 0) {
            for (int x = 0; x < 5; x++) {
                output.emplace_back(largest_index+1, largest_index+1);
                a[largest_index] *= 2;
            }

            for (int x = 1; x < n; x++) {
                if (x == 1) {
                    output.emplace_back(x+1, largest_index+1);
                    a[x] += a[largest_index];

                    output.emplace_back(x+1, largest_index+1);
                    a[x] += a[largest_index];
                }
                else {
                    output.emplace_back(x+1, x);
                    a[x] += a[x-1];

                    output.emplace_back(x+1, x);
                    a[x] += a[x-1];
                }
            }

            cout << output.size() << "\n";
            for (auto pair : output) {
                cout << pair.first << " " << pair.second << "\n";
            }
        }
        else if (smallest < 0) {
            for (int x = n-2; x >= 0; x--) {
                output.emplace_back(x+1, x+2);
            }

            cout << output.size() << "\n";
            for (auto pair : output) {
                cout << pair.first << " " << pair.second << "\n";
            }
        }
        else {
            cout << "0\n";
        }
    }
}