#include <iostream>
using namespace std;

int main(){
    int a,b,c;
    cin>>a>>b>>c;
    if(a>b){
        if(a>c){
            cout<<a<<" is the greatest among 3 numbers"<<endl;
        }else{
            cout<<c<<" is the greates among 3 numbers"<<endl;
        }
    }else{
        if(b>c){
            cout<<b<<" is the greatest among 3 numbers"<<endl;
        }else{
            cout<<c<<" is greatest among 3 numbers"<<endl;
        }
    }
    return 0;
}
