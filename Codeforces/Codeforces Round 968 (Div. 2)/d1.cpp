#include <iostream>
#include <vector>
#include <algorithm>
#include <utility>
#include <unordered_set>

using namespace std;

pair<long long, long long> mex(vector<long long> &a, int l) {
    vector<long long> b;
    b.push_back(a[0]);

    for (int x = 1; x < a.size(); x++) {
        if (a[x] != b.back()) {
            b.push_back(a[x]);
        }
    }

    std::unordered_set<long long> num_set(b.begin(), b.end());
    std::vector<long long> result;
    long long val = 0;

    while (result.size() < 2) {
        if (num_set.find(val) == num_set.end()) {
            result.push_back(val);
        }
        val++;
    }

    return make_pair(result.front(), result.back());
}

int main() {
    int t;
    cin>>t;

    while (t--) {
        long long n, m;
        cin>>n>>m;

        long long largest_v = -1;

        for (int x = 0; x < n; x++) {
            int l;
            cin>>l;

            vector<long long> a(l);
            for (int y = 0; y < l; y++) {
                cin>>a[y];
            }

            sort(a.begin(), a.end());

            auto [u, v] = mex(a, l);
            largest_v = max(largest_v, v);

            //cout << u << " " << v << "\n----------\n";
        }
        if (m < largest_v) {
            cout << (m+1) * largest_v << "\n";
        } 
        else {
            long long numer = (m-largest_v+1) * (m + largest_v);
            numer /= 2;
            cout << numer + largest_v * largest_v << "\n";
        }        

    }
}