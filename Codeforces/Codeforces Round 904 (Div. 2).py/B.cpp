#include <iostream>
#include <string>

int main() {
    int t;
    std::cin >> t;

    while (t--) {
        int n;
        std::cin >> n;

        std::string s;
        std::cin >> s;

        std::string output = "";
        int printed = 1;
        int swaps = 0;

        int temp = s.length();
        for (int x = temp - 1; x >= 0; x--) {
            if (s[x] == '0') {
                printed++;
                if (output.length() == 0) {
                    output += std::to_string(swaps);
                } else {
                    output += " " + std::to_string(swaps);
                }
            } else {
                swaps++;
            }
        }

        while (printed <= n) {
            output += " -1";
            printed++;
        }

        std::cout << output << std::endl;
    }

    return 0;
}
