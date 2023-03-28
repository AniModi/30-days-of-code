#include <bits/stdc++.h>
using namespace std;
// code for factorial
int fact(int n){
    if(n==0 || n==1){
        return 1;
    }
    return n * fact(n-1);
}

// code for nth term of fibonacci
int fib(int n){
    if(n==1 || n==2){
        return 0;
    }
    return fib(n-1)+fib(n-2);
}


// code for sum of digits of an integer using recursion
int sumofdigit(int n){
    if(n==0){
        return 0;
    }
    return n%10 + sumofdigit(n/10);
}

// code for sum of natural numbers
int sumofnatural(int n){
    if(n==1){
        return 1;
    }
    return n + sumofnatural(n-1);
}


// code for gcd of two numbers
int GCD(int a,int b){
    if(b==0){
        return a;
    }
    return GCD(b,a%b);
}

// sum of array using recursion
int sumofarray(int arr[],int n){
    if(n==0){
        return arr[0];
    }
    return arr[n]+sumofarray(arr,n-1);
}

// code to reverse string using recursion

// function required for recur_revers_string function
void add_char(char y, int n,char a[]){
    for(int i =n-1;i>=0;i--){
        a[i+1]=a[i];
    }
    a[0]=y;
    return;
}
void recur_revers_string(int n, char a[]){
    if(n==1){
        return;
    }
    char y = a[--n];
    recur_revers_string(n,a);
    add_char(y,n++,a);
}


// code to check if an integer is palindrome or not , returns boolean value
bool palin_check(string s,int n){
    bool flag =false ;
    if(n==s.length()/2){
        return true;
    }
    if(s[s.length()-n]==s[n-1]){
        flag = true;
    }
    return flag && palin_check(s,n-1);
}


