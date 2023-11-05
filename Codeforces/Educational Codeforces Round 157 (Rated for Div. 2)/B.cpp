#include <iostream>
#include <vector>
#include <algorithm>

struct Point {
    int x, y;
};

bool compare(int a, int b) {
    return a < b;
}

int main() {
    int t;
    std::cin >> t;

    while (t--) {
        int n;
        std::cin >> n;

        std::vector<int> a(2 * n);
        for (int i = 0; i < 2 * n; ++i) {
            std::cin >> a[i];
        }

        // Sort the input array to pair points with minimum distance
        std::sort(a.begin(), a.end(), compare);

        // Assign pairs to points and calculate the minimum possible length of the path
        std::vector<Point> points(n);
        long long minLength = 0;
        for (int i = 0; i < n; ++i) {
            points[i].x = a[i];
            points[i].y = a[2 * n - i - 1];
            minLength += (points[i].x + points[i].y);
        }

        std::cout << minLength << std::endl;

        // Output the assigned points
        for (int i = 0; i < n; ++i) {
            std::cout << points[i].x << " " << points[i].y << std::endl;
        }
    }

    return 0;
}
