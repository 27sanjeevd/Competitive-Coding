#include <iostream>
#include <unordered_map>
#include <string>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        string s;
        cin>>s;

        unordered_map<int, int> num_available;
        for (char c : s) {
            num_available[(c - '0')]++;

            //cout << c << "\n";
        }
        //cout << "------\n";

        string output;
        for (int x = 0; x < 10; x++) {
            int min_val = 10 - x - 1;

            int found_val;

            for (int y = min_val; y < 10; y++) {
                if (num_available.count(y) != 0) {
                    found_val = y;
                    num_available[y]--;
                    if (num_available[y] == 0) {
                        num_available.erase(y);
                    }

                    break;
                }
            }

            output += to_string(found_val);
        }

        cout << output << "\n";
    }
}