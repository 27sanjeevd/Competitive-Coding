#include <iostream>
#include <vector>
#include <utility>
#include <algorithm>
#include <unordered_set>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        vector<pair<int, int>> a;
        int real_index = 0;

        for (int x = 0; x < n; x++) {
            int val;
            cin>>val;

            if (a.size() == 0) {
                a.emplace_back(val, real_index);
                real_index++;
            }
            else if (val != a.back().first) {
                a.emplace_back(val, real_index);
                real_index++;
            }
        }

        sort(a.begin(), a.end());
        //cout << "----------\n";

        int num_clones = 0;
        unordered_set<int> visited;

        while (a.size() > 0) {
            auto [val, index] = a.back();
            a.pop_back();

            //cout << "a----------\n";

            bool found = false;
            if (index < n-1 && visited.count(index+1) != 0) {
                found = true;
            }
            //cout << "b----------\n";
            if (index > 0 && visited.count(index-1) != 0) {
                found = true;
            }
            //cout << "c----------\n";

            if (!found) {
                //cout << index << " " << val << "\n";
                num_clones++;
            }

            visited.insert(index);
        }

        cout << num_clones << "\n";
    }
}