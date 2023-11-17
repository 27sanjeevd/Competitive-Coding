#include <iostream>
#include <cstdlib>
#include <vector>
#include <algorithm>
#include <map>

using namespace std;

int helper(map<int, int>& nums, int target) {
	auto it = nums.upper_bound(target);
	if (it != nums.begin()) {
		it--;
		return it->first;
	}
	else {
		return -1;
	}
}

int main() {
	int n, m;
	cin>>n>>m;
	map<int, int> tickets;

	for (int x = 0; x < n; x++) {
		int temp;
		cin>>temp;
		if (tickets.count(temp) == 0) {
			tickets[temp] = 1;
		}
		else {
			tickets[temp]++;
		}
	}

	for (int x = 0; x < m; x++) {
		int temp;
		cin>>temp;
		if (tickets.size() > 0) {
			int pos = helper(tickets, temp);
			if (pos == -1) {
				cout<<"-1\n";
			}
			else {
				cout<<pos<<"\n";
				if (tickets[pos] == 1) {
					tickets.erase(pos);
				}
				else {
					tickets[pos]--;
				}
			}
		}
		else {
			cout<<"-1\n";
		}
		
	}

	return 0;
}