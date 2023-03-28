#include <bits/stdc++.h>
using namespace std;
int main(){
    string s;
    cin>>s;
    // printing odd places of a string
    for(int i=1;i<s.size();i=i+2){
        cout<<s[i]<<" ";
    }
    map <char,int>m;
    for(int i=0;i<s.size();i++){
        if(m.find(s[i])==m.end()){
            m.insert({s[i],1});
        }
        else{
            auto it =m.find(s[i]);
            (it->second)++;
        }
    }
    for(auto it :m){
        cout<<endl<<it.first<<"-"<<it.second;
    }
    

    
    return 0;
}