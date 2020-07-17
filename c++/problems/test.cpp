#include <iostream>
using namespace std;

int main() {
	
	// your code here
	int n;
	while(true) {
		cin >> n;
		if(n == 42) {
			return 0;
		}
		printf("%d\n", n);
	}

	return 0;
}