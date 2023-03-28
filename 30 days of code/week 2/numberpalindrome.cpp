#include <bits/stdc++.h>
using namespace std;

int main(){
    cout<<"enter the number- ";
    int x;
    cin>>x;
    int c =x;
    int y=0;
    while(c>0){
        y=y*10 +c%10;
        c/=10;
    }
    if(x==y){
        cout<<"the number is palindrome";
    }
    else{
        cout<<"The number isnt palindrome";
    }
}