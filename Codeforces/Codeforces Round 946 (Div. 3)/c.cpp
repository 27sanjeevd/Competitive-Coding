#include <iostream>
#include <cstdlib>
#include <vector>
#include <unordered_set>
#include <unordered_map>
#include <vector>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        vector<int> nums(n);
        for (int x = 0; x < n; x++) {
            cin>>nums[x];
        }

        int output = 0;
        unordered_map<int, vector<pair<int, pair<int, int>>>> pair1, pair2, pair3;
        for (int x = 0; x < n - 2; x++) {
            unordered_set<int> visited;
            for (int y = 0; y < pair1[nums[x]].size(); y++) {
                if (visited.count(pair1[nums[x]][y].first) > 0) {
                    continue;
                }
                if (nums[x+1] == pair1[nums[x]][y].second.first && nums[x+2] != pair1[nums[x]][y].second.second) {
                    output++;
                    visited.insert(pair1[nums[x]][y].first);
                    cout << x << " " << output << " " << 1 << "\n";
                }
                else if (nums[x+1] != pair1[nums[x]][y].second.first && nums[x+2] == pair1[nums[x]][y].second.second) {
                    output++;
                    visited.insert(pair1[nums[x]][y].first);
                    cout << x << " " << output << " " << 2 << "\n";
                }
            }

            for (int y = 0; y < pair2[nums[x+1]].size(); y++) {
                if (visited.count(pair1[nums[x]][y].first) > 0) {
                    continue;
                }
                if (nums[x] == pair2[nums[x]][y].second.first && nums[x+2] != pair2[nums[x]][y].second.second) {
                    output++;
                    visited.insert(pair1[nums[x]][y].first);
                    cout << x << " " << output << " " << 3 << "\n";
                }
                else if (nums[x] != pair2[nums[x]][y].second.first && nums[x+2] == pair2[nums[x]][y].second.second) {
                    output++;
                    visited.insert(pair1[nums[x]][y].first);
                    cout << x << " " << output << " " << 4 << "\n";
                }
            }

            for (int y = 0; y < pair3[nums[x+2]].size(); y++) {
                if (visited.count(pair1[nums[x]][y].first) > 0) {
                    continue;
                }
                if (nums[x] == pair3[nums[x]][y].second.first && nums[x+1] != pair3[nums[x]][y].second.second) {
                    output++;
                    visited.insert(pair1[nums[x]][y].first);
                    cout << x << " " << output << " " << 5 << "\n";
                }
                else if (nums[x] != pair3[nums[x]][y].second.first && nums[x+1] == pair3[nums[x]][y].second.second) {
                    output++;
                    visited.insert(pair1[nums[x]][y].first);
                    cout << x << " " << output << " " << 6 << "\n";
                }
            }
            pair1[nums[x]].push_back({x, {nums[x+1], nums[x+2]}});
            pair2[nums[x+1]].push_back({x, {nums[x], nums[x+2]}});
            pair3[nums[x+2]].push_back({x, {nums[x], nums[x+1]}});
        }

        cout << output << "\n";
    }

    return 0;
}