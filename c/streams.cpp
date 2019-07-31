#include <stdio.h>
#include <iostream>

using namespace std;

int main()
{
	int i;
	cin >> i;
	cout << i << endl;
	cout << "Output";
	cerr << "Error";

	cout << endl;

	printf("C Output");
	fprintf(stderr,"C Error");

	return 0;
}
