#include <iostream>
#include <cstdlib>
#include <vector>

using namespace std;

int main() {
	int n;
	cin>>n;
	if ((n-3) % 4 == 0 || n % 4 == 0) {
		cout<<"YES\n";
		vector<int> first;
		vector<int> second;

		while (n > 3) {
			first.push_back(n);
			n--;
			second.push_back(n);
			n--;
			second.push_back(n);
			n--;
			first.push_back(n);
			n--;
		}
		if (n == 3) {
		first.push_back(n);
			n--;
			second.push_back(n);
			n--;
			second.push_back(n);
			n--;
		}

		cout<<first.size()<<"\n";
		for (int x = 0; x < first.size(); x++) {
			cout<<first[x]<<" ";
		}
		cout<<"\n";
		cout<<second.size()<<"\n";
		for (int x = 0; x < second.size(); x++) {
			cout<<second[x]<<" ";
		}
		cout<<"\n";
	}
	else {
		cout <<"NO";
	}

	return 0;
}	