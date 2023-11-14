#include <iostream>
#include <cstdlib>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	int n;
	cin>>n;

	vector<int> start_times(n);
	vector<int> end_times(n);

	for (int x = 0; x < n; x++) {
		cin>>start_times[x];
		cin>>end_times[x];
	}

	sort(start_times.begin(), start_times.end());
	sort(end_times.begin(), end_times.end());

	int counter = 0;
	int output = 0;

	int start_pos = 0;
	int end_pos = 0;
	while (start_pos < n && end_pos < n) {
		if (start_times[start_pos] <= end_times[end_pos]) {
			start_pos++;
			counter++;
			output = max(output, counter);
		}
		else {
			end_pos++;
			counter--;
		}
	}

	if (start_pos < n) {
		counter += (n - start_pos);
		output = max(output, counter);
	}

	cout<<output;
	return 0;
}