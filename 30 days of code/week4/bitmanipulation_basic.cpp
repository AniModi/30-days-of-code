#include <bits/stdc++.h>
using namespace std;
// program to count the number of set bits
int no_of_setbits(int n){
    int count =0;
    while(n>0){
        if(n&1==1){
            count++;
        }
        n>>=1;
    }
    return count;
}

// code to count the number of bits required to represent the number in bnary
int no_of_bits(int n){
    int count =0;
    while(n>0){
        count++;
        n>>=1;
    }
    return count ;
}

// program to check if a given number is power of 2 or not 
bool P2(int n){
    if(no_of_setbits(n)==1){
        return true;
    }
    else{
        return false;
    }
}

// code to set a bit at a particular position in an integer
int set_bit(int n, int x){
    int y = 1<<(x-1);
    return  n|y;
}
// code to clear a bit at a particular position in an integer
int clear_bit(int n,int x){
    int y =1<<(x-1);
    return n^y;
}

// code to toggle a bit at a given position in a integer
int toggle_bit(int n, int x, int y){
    if (y==1){
        return set_bit(n,x);
    }
    else{
        return clear_bit(n,x);
    }
}

// code to reverse all the bits of an integer 
int reverse_bits(int n){
    int ans;
    if(n&1==1){
        ans =1;
    }
    else{
        ans=0;
    }
    int i=1;
    while(i<no_of_bits(n)){
        ans<<=1;
        if(n&(1<<i)){
            ans|=1;
        }
        i++;
    }
    return ans;
}

// code to find out the number of different bits in two numbers
int diff_bits(int n,int m){
    int sum=0;
    int x =max(n,m);
    int y= min(n,m);
    while(x>0){
        if((x&1)!=(y&1)){
            sum++;
        }
        y>>=1;
        x>>=1;
    }
    return sum;
}

// code to find the next largest number having the same set bits
int next_highest(int n){
    int x= no_of_setbits(n);
    int ans=1;
    for(int i=1;i<x;i++){
        ans<<=1;
        ans|=1;
    }
    ans<<=no_of_bits(n)-x;
    return ans;
}
// code to find the smallest number having the same set bits
int next_lowest(int n){
    int ans =1;
    for(int i=1;i<no_of_setbits(n);i++){
        ans<<=1;
        ans|=1;
    }
    return ans;
}
// code to swap adjacent bits
int swap_adajacent(int n){
    int ans=0;
    int i=no_of_bits(n)-1;
    while(i>=1){
        if(n&(1<<(i-1))){
            ans|=1;
        }
        ans<<=1;
        if(n&(1<<(i))){
            ans|=1;
        }
        ans<<=1;
        i=i-2;
    }
    return ans>>1;
}
int main(){
    cout<<swap_adajacent(2);
    return 0;
}