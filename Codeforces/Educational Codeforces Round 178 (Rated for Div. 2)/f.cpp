#include <iostream>
#include <unordered_set>
#include <string>
#include <algorithm>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        unordered_set<string> vals;

        int n;
        cin>>n;

        for (int x = 1; x <= n; x++) {
            string temp = to_string(x) + to_string(x+1);
            sort(temp.begin(), temp.end());

            vals.insert(temp);
        }

        cout << vals.size() << "\n";
    }
}