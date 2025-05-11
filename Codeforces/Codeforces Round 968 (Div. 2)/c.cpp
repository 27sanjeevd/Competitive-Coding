#include <iostream>
#include <unordered_map>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        string s;
        cin>>s;

        sort(s.begin(), s.end());

        unordered_map<int, vector<char>> counts;
        unordered_map<char, int> char_count;

        counts[1].push_back(s[0]);
        char_count[s[0]] = 1;

        for (int x = 1; x < n; x++) {
            if (s[x] == s[x-1]) {
                int curr_count = char_count[s[x]];
                curr_count++;

                char_count[s[x]] = curr_count;
                counts[curr_count].push_back(s[x]);
            }
            else {
                char_count[s[x]] = 1;
                counts[1].push_back(s[x]);
            }
        }

        string output = "";
        int counter = 1;
        while (counts.count(counter) != 0) {
            for (char c : counts[counter]) {
                output += c;
            }

            counter++;
        }

        cout << output << "\n";
    }
}