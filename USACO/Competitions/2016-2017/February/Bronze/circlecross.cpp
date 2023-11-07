#include <iostream>
#include <fstream>
#include <cstdlib>
#include <vector>
#include <unordered_map>

using namespace std;

int main() {
	//vector<char> nums(52);
	unordered_map<char, vector<int>> charMap;

	ifstream fin("circlecross.in");
	ofstream fout("circlecross.out");

	for (int x = 0; x < 52; x++) {
		char temp;
		fin>>temp;
		//nums[x] = temp;

		if (charMap.find(temp) != charMap.end()) {
			charMap[temp][1] = x;
		}
		else {
			charMap[temp] = {x, 0};
		}
	}

	int output = 0;

	for (char x = 'A'; x <= 'Y'; x++) {
		for (char y = x + 1; y <= 'Z'; y++) {
			vector<int> first = charMap[x];
			vector<int> second = charMap[y];

			if (first[0] < second[1] && first[0] > second[0] && first[1] > second[1]) {
				output++;
			}
			else if (first[0] < second[0] && first[1] > second[0] && second[1] > first[1]) {
				output++;
			}
		}
	}

	fout<<output;
	return 0;


}