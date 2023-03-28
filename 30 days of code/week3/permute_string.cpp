# include <bits/stdc++.h>
using namespace std;

void permute_string(string s, int arr[],vector<char>& ans){
    for(int i=0;i<s.length();i++){
        if(ans.size()==s.length() && i==0){
            for(int i=0;i<s.length();i++){
                cout<<ans[i];              
            }
            cout<<endl;
            break; 
        }
        if(arr[i]==0){
            ans.push_back(s[i]);
            arr[i]=1;
            permute_string(s,arr,ans);
            arr[i]=0;
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
    for(int i=0;i<s.length();i++){ arr[i]=0;}
    vector<char> x;
    permute_string(s,arr,x);

}