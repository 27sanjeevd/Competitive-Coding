#include <iostream>
#include <vector>
#include <utility>
#include <set>
#include <algorithm>
#include <iterator>
#include <climits>

using namespace std;

void solve_negative(vector<long long> &a, int smallest_index, int largest_index) {
    int max_iterations = 30;
    vector<pair<int, int>> operations;

    while (abs(a[smallest_index]) < a[largest_index] && max_iterations > 0) {
        operations.emplace_back(smallest_index+1, smallest_index+1);
        a[smallest_index] *= 2;

        max_iterations--;
    }

    for (int x = 0; x < a.size(); x++) {
        if (a[x] > 0) {
            operations.emplace_back(x+1, smallest_index+1);
            a[x] += a[smallest_index];
        }
    }

    for (int x = a.size() - 2; x >= 0; x--) {
        operations.emplace_back(x+1, x+2);
        a[x] += a[x+1];
    }

    cout << operations.size() << "\n";
    for (auto pair : operations) {
        cout << pair.first << " " << pair.second << "\n";
    }

}

void solve_positive(vector<long long> &a, int largest_index, int smallest_index) {
    int max_iterations = 30;
    vector<pair<int, int>> operations;

    while (a[largest_index] < abs(a[smallest_index]) && max_iterations > 0) {
        operations.emplace_back(largest_index+1, largest_index+1);
        a[largest_index] *= 2;

        max_iterations--;
    }

    for (int x = 0; x < a.size(); x++) {
        if (a[x] < 0) {
            operations.emplace_back(x+1, largest_index+1);
            a[x] += a[largest_index];
        }
    }

    for (int x = 1; x < a.size(); x++) {
        operations.emplace_back(x+1, x);
        a[x] += a[x-1];
    }

    cout << operations.size() << "\n";
    for (auto pair : operations) {
        cout << pair.first << " " << pair.second << "\n";
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        vector<long long> a(n);
        for (int x = 0; x < n; x++) {
            cin>>a[x];
        }

        long long largest = LLONG_MIN;
        long long smallest = LLONG_MAX;

        int largest_index = -1;
        int smallest_index = -1;

        long long num_over = 0;
        long long num_below = 0;

        for (int x = 0; x < n; x++) {
            if (a[x] > 0) {
                num_over++;
            }
            else if (a[x] < 0) {
                num_below++;
            }

            if (a[x] < smallest) {
                smallest = a[x];
                smallest_index = x;
            }
            if (a[x] > largest) {
                largest = a[x];
                largest_index = x;
            }
        }


        if (largest == 0 && smallest == 0) {
            cout << 0 << "\n";
            continue;
        }

        long long abs_smallest = abs(smallest);

        //cout << num_over << " " << num_below << " " << largest << " " << smallest << "\n";

        long long additional_pos = 0;
        long long additional_neg = 0;

        for (long long x = 0; x < 10; x++) {
            long long temp = largest * (1LL << x);
            if (temp > abs(smallest)) {
                additional_pos = x;
                break;
            }
        }

        for (long long x = 0; x < 10; x++) {
            long long temp = abs(smallest) * (1LL << x);
            if (temp > abs(largest)) {
                additional_neg = x;
                break;
            }
        }
        if (num_over + additional_neg < num_below + additional_pos) {
            solve_negative(a, smallest_index, largest_index);
        }
        else {
            solve_positive(a, largest_index, smallest_index);
        }
    }
}