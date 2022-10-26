#include<iostream>
using namespace std;

// Driver code
int main()
{
    int a;
    int b;
    cin>>a>>b;
    
    cout<< "Before swaping a = "<<a<<", b = "<< b << endl;
    int temp;   
    temp = a;
    a = b;
    b = temp;
    cout << "After swaping a = " << a << " , b = " << b << endl;
    return 0;
}
    