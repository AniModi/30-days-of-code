#include <bits/stdc++.h>
using namespace std;

void comb(vector<int> & v){
    if(v.size()==0){
        return;
    }
   for(int i=0;i<v.size()-1;i++){
      cout<<v[v.size()-1]<<" "<<v[i];
      cout<<endl;
   }
   v.pop_back();
   comb(v);
}

int main(){
    vector<int> v;
    int n;
    cout<<"Enter the number of elements- ";
    cin>>n;
    for(int i=0;i<n;i++){
        int x;
        cin>>x;
        v.push_back(x);
    }
    comb(v);
}