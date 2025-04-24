#include <iostream>
#include <cstdlib>
#include <vector>
#include <unordered_set>
#include <unordered_map>
#include <algorithm>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        string val;
        cin>>n>>val;

        unordered_set<char> unique_char;
        string new1;
        for (int x = 0; x < val.size(); x++) {
            if (unique_char.count(val[x]) == 0) {
                new1 += val[x];
                unique_char.insert(val[x]);
            }
        }

        sort(new1.begin(), new1.end());

        unordered_map<char, char> pairing;
        for (int x = 0; x < new1.size(); x++) {
            pairing[new1[x]] = new1[new1.size() - 1 - x];
        }

        string output = "";
        for (int x = 0; x < val.size(); x++) {
            output += pairing[val[x]];
        }

        cout << output << "\n";
    }

    return 0;
}