#include <bits/stdc++.h>
using namespace std;
// program to find the only two non repeating numbers in an array

int main(){
    vector<int> arr;
    int n;
    cout<<"Enter the size of the array";
    cin>>n;
    for(int i=0;i<n;i++){
        int x;
        cin>>x;
        arr.push_back(x);
    }
    int counter =0;
    for(int i=0;i<n;i++){
        counter^=arr[i];
    }
    // finding the rightmost set bit 
    bool flag = false;
    int x=1;
    while(flag==false){
        if((counter &(1<<x))==1){
            flag = true;
            break;
        }
        x++;
    }
    vector<int>v1;
    vector<int>v0;
    int b= 1<<x;
    for(int i=0;i<n;i++){
        if(arr[i]&b==1){
            v1.push_back(arr[i]);
        }
        else{
            v0.push_back(arr[i]);
        }
    }
    counter =0;
    for(int i=0;i<v1.size();i++ ){
        counter^=v1[i];
    }
    cout<<"The first number is- "<<counter;
    counter =0;
    for(int i=0;i<v0.size();i++ ){
        counter^=v0[i];
    }
    cout<<endl;
    cout<<"The second number is- "<<counter;
}