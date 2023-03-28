# include <bits/stdc++.h>
using namespace std;

void permute_string(unordered_map<char,int> &m,vector<char>& ans){
    for(auto i=m.begin();i!=m.end();i++){
        if(ans.size()==m.size() && i==m.begin()){
            for(int i=0;i<m.size();i++){
                cout<<ans[i];              
            }
            cout<<endl;
            continue;
        }
        if(i->second==0){
            ans.push_back(i->first);
            i->second=1;
            permute_string(m,ans);
            i->second=0;
            ans.pop_back();
        } 
    }  
    return ;
    
}

int main(){
    string s;
    cout<<"Enter the string  - ";
    cin>>s;
    int arr[s.length()];
    unordered_map<char,int> m;
    for(int i=0;i<s.length();i++){ m[s[i]]=0;}
    vector<char> x;
    permute_string(m,x);

}