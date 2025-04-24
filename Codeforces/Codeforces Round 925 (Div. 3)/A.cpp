#include <iostream>
#include <cstdlib>
#include <cstring>

using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        if (n <= 28) {
            int last = n - 2;
            string word = "aa" + string(1, static_cast<char>('a' + last - 1));
            cout << word << "\n";
        } else if (n <= 53) {
            int middle = n - 27;
            string word = "a" + string(1, static_cast<char>('a' + middle - 1)) + "z";
            cout << word << "\n";
        } else {
            int first = n - 52;
            string word = string(1, static_cast<char>('a' + first - 1)) + "zz";
            cout << word << "\n";
        }
    }

    return 0;
}
