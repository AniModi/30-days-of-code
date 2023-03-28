#include <bits\stdc++.h>
using namespace std;
void merge1(int arr[],int l,int mid,int r,int b[]){
    int i =l;
    int j =mid +1;
    int k=l;
    while(i<=mid && j<=r){
        if(arr[i]<arr[j]){
            b[k]=arr[i];
            i++;
        }
        else{
            b[k]=arr[j];
            j++;
        }
        k++;
    }
    if(i>mid){
        while(j<=r){
            b[k]=arr[j];
            j++;
            k++;
        }
    }
    else{
        while(i<=mid){
            b[k]=arr[i];
            i++;
            k++;
        }
   }
}

void mergesort(int arr[],int l, int r){
    if(l<r){
        int mid = (l+r)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        int b[r+1];
        merge1(arr,l,mid,r,b);
        for(int i=l;i<=r;i++){
            arr[i]=b[i];
        }
    }
    return ;
}
int main(){
    int n;
    cin>>n;
    int sum =0;
    int arr[n];
    for(int i=0;i<n;i++){
       cin>>arr[i];
    }
    // printing in reverse order 
    for(int i=n-1;i>=0;i--){
        sum+=arr[i];
        cout<<arr[i];
    }
    // sum of the array
    cout<<endl<<"sum is-"<<sum;
    cout<<endl;
    // sorting the array
    mergesort(arr,0,n-1);
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    // maximum three terms are
    cout<<endl<<arr[n-1]<<" "<<arr[n-2]<<" "<<arr[n-3];
   // check if target is present or not
    cout<<"enter the target"<<endl;
    int k;
    cin>>k;
    for(int i=0;i<n;i++){
        if(arr[i]==k){
            cout<<"It is present"<<endl;
            break;
        }
    }

    // frequency of a number in array
    int y;
    cin>>y;
    int count =0;
    for(int i=0;i<n;i++){
        if(arr[i]==y){
            count++;
        }
    }
    cout<<endl<<"frequency is- "<<count;
    return 0;
}