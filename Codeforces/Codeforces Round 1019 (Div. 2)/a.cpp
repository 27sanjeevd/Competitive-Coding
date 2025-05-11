#include <iostream>
#include <unordered_set>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        unordered_set<int> vals;
        for (int x = 0; x < n; x++) {
            int temp;
            cin>>temp; 

            vals.insert(temp);
        }

        cout << vals.size() << "\n";
    }
}