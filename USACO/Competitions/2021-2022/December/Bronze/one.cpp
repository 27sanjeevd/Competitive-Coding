#include <iostream>
#include <unordered_map>
#include <vector>
#include <cstdlib>

using namespace std;

int main() {
	int N;
	cin>>N;
	unordered_map<char, int> slider;
	slider['G'] = 0;
	slider['H'] = 0;

	vector<char> letters(N);
	for (int x = 0; x < N; x++) {
		cin>>letters[x];
	}

	int output = 0;
	for (int x = 0; x < 3; x++) {
		slider[letters[x]]++;
	}

	if (slider['G'] == 1 || slider['H'] == 1) {
		output++;
	}

	for (int x = 3; x < N; x++) {
		slider[letters[x]]++;
		slider[letters[x-3]]--;

		if (slider['G'] == 1 || slider['H'] == 1) {
			output++;
		}
	}

	cout<<output;
	return 0;
}