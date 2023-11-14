#include <iostream>
#include <cstdlib>

using namespace std;

int main() {
	int t;
	cin>>t;

	while (t--) {
		int n;
		cin>>n;
		string plays;
		cin>>plays;

		bool check1 = true;
		for (int x = 1; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				if (check1) {
					int a_wins = 0;
					int b_wins = 0;

					int curr_a = 0;
					int curr_b = 0;

					int z = 0;
					while (z < plays.length()) {
						if (plays[z] == 'A') {
							curr_a++;
							if (curr_a == x) {
								a_wins++;
								curr_a = 0;
								curr_b = 0;
								if (a_wins == y) {
									break;
								}
							}
						}
						else if (plays[z] == 'B') {
							curr_b++;
							if (curr_b == x) {
								b_wins++;
								curr_a = 0;
								curr_b = 0;
								if (b_wins == y) {
									break;
								}
							}
						}
						z++;
					}

					if (z == plays.length() - 1 && (a_wins == y || b_wins == y)) {
						if (a_wins == y) {
							cout<<"A\n";
						}
						else {
							cout<<"B\n";
						}
						check1 = false;
					}
				}
			}
		}
		if (check1) {
			cout<<"?\n";
		}
	}

	return 0;
}