#include <iostream>
#include <fstream>
#include <cstdlib>

using namespace std;

int main() {

	ofstream fout ("shell.out");
    ifstream fin ("shell.in");

	int n;
	fin>>n;

	int answers[3] = {0, 0, 0};
	while (n--) {
		int a, b, g;
		fin>>a>>b>>g;

		int temp = answers[a-1];
		answers[a-1] = answers[b-1];
		answers[b-1] = temp;

		answers[g-1]++;
	}

	int max1 = answers[0];
	for (int x = 1; x < 3; x++) {
		if (answers[x] > max1) {
			max1 = answers[x];
		}
	}

	fout<<max1<<"\n";
}