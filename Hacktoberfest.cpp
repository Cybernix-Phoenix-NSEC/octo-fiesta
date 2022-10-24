#include <iostream>

using namespace std;

void printArray(int arr[], int n){

    for(int i=0; i<n; i++){
        cout << arr[i] <<" ";
    }
    cout<<endl;
}

int main()
{
   int m;
   cin>>m;
   int a;
   cin>>a;
   int b;
   cin>>b;
   int arr[m] = {a,b};

   printArray(arr, m);
   return 0;
}
