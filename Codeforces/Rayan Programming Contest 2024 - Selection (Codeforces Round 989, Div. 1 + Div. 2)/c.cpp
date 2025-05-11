#include <iostream>
#include <vector>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n, m;
        cin>>n>>m;

        vector<vector<char>> grid(n, vector<char>(m));

        vector<pair<int, int>> check_list;

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                cin>>grid[x][y];

                if ((x == 0 && grid[x][y] == 'U') || (x == n-1 && grid[x][y] == 'D') || (y == 0 && grid[x][y] == 'L') || (y == m-1 && grid[x][y] == 'R')) {
                    check_list.emplace_back(x, y);
                }
            }
        }

        while (check_list.size() > 0) {
            auto [x, y] = check_list.back();
            check_list.pop_back();

            grid[x][y] = '.';
            if (x > 0 && grid[x-1][y] == 'D') {
                check_list.emplace_back(x-1, y);
            }
            if (x < n-1 && grid[x+1][y] == 'U') {
                check_list.emplace_back(x+1, y);
            }
            if (y > 0 && grid[x][y-1] == 'R') {
                check_list.emplace_back(x, y-1);
            }
            if (y < m-1 && grid[x][y+1] == 'L') {
                check_list.emplace_back(x, y+1);
            }
        }

        int output = 0;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                //cout << grid[x][y] << " ";
                if (grid[x][y] == '?') {
                    bool check = false;

                    if (x > 0 && grid[x-1][y] != '.') {
                        check = true;
                    }
                    else if (x < n-1 && grid[x+1][y] != '.') {
                        check = true;
                    }
                    else if (y > 0 && grid[x][y-1] != '.') {
                        check = true;
                    }
                    else if (y < m-1 && grid[x][y+1] != '.') {
                        check = true;
                    }

                    if (check) {
                        output++;
                    }
                }
                else if (grid[x][y] != '.') {
                    output++;
                }
            }
            //cout << "\n";
        }

        cout << output << "\n";
    }
}