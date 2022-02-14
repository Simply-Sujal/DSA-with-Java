
// Fibonacci number by recursion 

#include <bits/stdc++.h>
using namespace std;

int fibbo(int n){
    // base condtion 
    if(n <= 1){
        return n;
    }
    //  recurence relation fibbo(n) = fibbo(n-1) + fibbo(n-2);
    int last = fibbo(n-1);
    int slast = fibbo(n-2);
    return last + slast;
}

int main(){
    int n;
    cout << "Enter any number : ";
    cin >> n;
    cout << (fibbo(n));

    return 0;
}