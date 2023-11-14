#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>

using namespace std;

int main() {
	int n, m, k;
	cin>>n>>m>>k;

	vector<int> applicants(n);
	for (int x = 0; x < n; x++) {
		cin>>applicants[x];
	}

	vector<int> apartments(m);
	for (int x = 0; x < m; x++) {
		cin>>apartments[x];
	}

	sort(applicants.begin(), applicants.end());
	sort(apartments.begin(), apartments.end());

	int output = 0;
	int applicant = 0;
	int apartment = 0;
	while (applicant < n && apartment < m) {
		if (abs(applicants[applicant] - apartments[apartment]) <= k) {
			applicant++;
			apartment++;
			output++;
		}
		else {
			if (applicants[applicant] > apartments[apartment]) {
				apartment++;
			}
			else {
				applicant++;
			}
		}
	}

	cout<<output;
	return 0;
}