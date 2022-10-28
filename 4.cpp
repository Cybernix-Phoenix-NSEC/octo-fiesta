#include<iostream>
using namespace std;

int main(){
    for(int i=0;i<=3;i++){
        if(i%5==0){
            cout<<"%"<<endl;
        }
        else{
            cout<<"@"<<endl;
        }
    }
}