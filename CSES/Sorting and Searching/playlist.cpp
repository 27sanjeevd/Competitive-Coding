#include <iostream>
#include <unordered_map>
#include <cstdlib>
#include <vector>

using namespace std;

int main() {
	int n;
	cin>>n;
	vector<int> nums(n);
	for (int x = 0; x < n; x++) {
		cin>>nums[x];
	}

	int output = 0;
	int curr_length = 0;
	int beg = 0;
	int end = 0;
	unordered_map<int, int> set1;


	while (end < n) {
		//cout<<beg<<" "<<end<<" "<<output<<" "<<curr_length<<"\n";
		if (set1.count(nums[end]) == 0) {
			set1[nums[end]] = end;
			curr_length++;
			end++;
			output = max(output, curr_length);
		}
		else {
			int pos = set1[nums[end]];
			for (int x = beg; x <= pos; x++) {
				set1.erase(nums[x]);
			}
			beg = pos+1;
			curr_length = end - beg;
		}
	}

	cout<<output;
	return 0;
}