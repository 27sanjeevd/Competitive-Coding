#include <iostream>
#include <vector>
#include <numeric>
#include <cmath>
#include <climits>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        int smallest = INT_MAX;
        vector<int> k(n);
        for (int x = 0; x < n; x++) {
            cin>>k[x];
            smallest = min(smallest, k[x]);
        }

        double sum1 = 0.0;
        vector<double> ratios(n);
        for (int x = 0; x < n; x++) {
            ratios[x] = static_cast<double>(smallest) / k[x];
            sum1 += ratios[x];
        }


        int l = 0;
        int r = 1000000000;

        vector<double> amts(n);
        int ans = -1;
        while (l < r) {
            int m = (r + l) / 2;
            //cout << "******\n";

            int fixedSum = 0;
            for (int x = 0; x < n; x++) {
                double share = ratios[x] / sum1;
                double temp = m * share;
                
                if (temp != floor(temp)) {
                    temp = floor(temp);
                }
                fixedSum += temp;
                amts[x] = temp;
            }
            int remained = m - fixedSum;
            int mistake1 = 0;
            for (int x = 0; x < n; x++) {
                //cout << m << " " << amts[x] << " " << amts[x] * k[x] << "\n";
                double temp = amts[x] * k[x];
                if (temp <= m) {
                    for (int y = 1; y <= m; y++) {
                        if ((amts[x] + y) * k[x] > m) {
                            mistake1 += y;
                            break;
                        }
                    }
                }
            }

            //cout << mistake1 << " " << remained << "\n";

            if (mistake1 > remained) {
                l = m + 1;
            }
            else {
                r = m - 1;
                ans = m;
            }
        }
        cout << ans << "\n";
    }
    return 0;
}