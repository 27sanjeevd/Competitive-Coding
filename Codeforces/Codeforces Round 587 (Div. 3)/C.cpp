#include <iostream>
#include <cstdlib>
#include <algorithm>

using namespace std;

int main() {
	int white[4];
	for (int x = 0; x < 4; x++) {
		int temp;
		cin>>temp;

		white[x] = temp;
	}

	int black1[4];
	for (int x = 0; x < 4; x++) {
		int temp;
		cin>>temp;

		black1[x] = temp;
	}

	int black2[4];
	for (int x = 0; x < 4; x++) {
		int temp;
		cin>>temp;

		black2[x] = temp;
	}

	int x1 = max(0, min(white[2], black1[2]) - max(white[0], black1[0]));
	int y1 = max(0, min(white[3], black1[3]) - max(white[1], black1[1]));

	int overlap1 = x1 * y1;

	int x2 = max(0, min(white[2], black2[2]) - max(white[0], black2[0]));
	int y2 = max(0, min(white[3], black2[3]) - max(white[1], black2[1]));

	int overlap2 = x2 * y2;

	int x3 = max(0, min(black2[2], black1[2]) - max(black2[0], black1[0]));
	int y3 = max(0, min(black2[3], black1[3]) - max(black2[1], black1[1]));

	int counter1 = x3 * y3;

	int original_area = (white[2] - white[0]) * (white[3] - white[1]);
	original_area = original_area - overlap1 - overlap2 + counter1;

	if (original_area > 0) {
		cout<<"YES";
	}
	else {
		cout<<"NO";
	}

	return 0;
}