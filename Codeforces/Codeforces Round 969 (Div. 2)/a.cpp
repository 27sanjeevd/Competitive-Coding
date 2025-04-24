#include <iostream>
#include <algorithm>

using namespace std;

void solve(int l, int r) {
    int n = r - l + 1;
    
    int output = (n + (l % 2)) / 4;
    
    cout << output << endl;
}

int main() {
    int t;
    cin>>t;

    while (t--) {
        int l, r;
        cin>>l>>r;
        solve(l, r);
    }
}