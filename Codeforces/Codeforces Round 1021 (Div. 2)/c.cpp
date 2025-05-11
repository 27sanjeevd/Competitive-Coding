#include <iostream>
#include <vector>
#include <map>
#include <algorithm>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        map<int, int> a;

        for (int x = 0; x < n; x++) {
            int temp;
            cin>>temp;

            a[temp]++;
        }

        vector<pair<int, int>> vals;
        for (auto pair : a) {
            vals.emplace_back(pair.first, pair.second);
        }

        //cout << "-----------\n";

        bool found = false;
        int prev_condition = 0;
        int prev_index = -1;
        for (int x = 0; x < vals.size(); x++) {
            int day = vals[x].first;
            int amt = vals[x].second;

            //cout << day << " " << amt << " " << prev_condition << " " << prev_index << "\n";

            if (amt >= 4) {
                found = true;
                break;
            }
            else if (amt >= 2) {
                if (prev_index == day - 1 && prev_condition == 1) {
                    found = true;
                    break;
                }
                else {
                    prev_condition = 1;
                    prev_index = day;
                }
            }
            else {
                if (prev_index != day - 1) {
                    prev_condition = 0;
                }
                prev_index = day;
            }
            //cout << day << " " << amt << " " << prev_condition << " " << prev_index << "\n";
            //cout << "next: -----\n";
        }

        if (found) {
            cout << "Yes\n";
        }
        else {
            cout << "No\n";
        }
    }
}