#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {
    int t;
    cin>>t;

    while (t--) {
        int n;
        cin>>n;

        string word;
        cin>>word;

        string output = "";
        int removed = 0;
        for (int x = 0; x < n; x++) {
            //cout << output << "\n";
            if (output.size() > 0 && output.back() == 'm') {
                if (word[x] == 'a' && (x + 1 < n && word[x+1] == 'p')) {
                    if (x+3 < n && word[x+2] == 'i' && word[x+3] == 'e') {
                        output += word[x];
                        x++;
                        removed++;
                    }
                    else {
                        removed++;
                    }
                }
                else {
                    output += word[x];
                }
            }
            else if (output.size() > 0 && output.back() == 'p') {
                if (word[x] == 'i' && (x + 1 < n && word[x+1] == 'e')) {
                    removed++;
                }
                else {
                    output += word[x];
                }
            }
            else {
                output += word[x];
            }
        }

        cout << removed << "\n";
    }

    return 0;
}