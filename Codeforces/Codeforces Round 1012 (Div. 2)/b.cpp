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

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                cin>>grid[x][y];
            }
        }

        bool valid = true;

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                if (grid[x][y] == '1') {
                    if (y == 0) {
                        grid[x][y] = '2';
                    }
                    else {
                        if (grid[x][y-1] == '2') {
                            grid[x][y] = '2';
                        }
                    }
                }
                else if (grid[x][y] == '2') {
                    continue;
                }
                else {
                    break;
                }
            }
        }

        for (int y = 0; y < m; y++) {
            for (int x = 0; x < n; x++) {
                if (grid[x][y] == '1') {
                    if (x == 0) {
                        grid[x][y] = '2';
                    }
                    else {
                        if (grid[x-1][y] == '2') {
                            grid[x][y] = '2';
                        }
                    }
                }
                else if (grid[x][y] == '2') {
                    continue;
                }
                else {
                    break;
                }
            }
        }

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
                //cout << grid[x][y];
                if (grid[x][y] == '1') {
                    valid = false;
                }
            }

            //cout << "\n";
        }


        if (valid) {
            cout << "Yes\n";
        }
        else {
            cout << "No\n";
        }
    }
}