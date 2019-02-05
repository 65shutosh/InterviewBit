int Solution::isPalindrome(string A) {
    char a[A.size()];
    int size=0;
    bool palindrome=true;
    for(int i=0;i<=A.size();i++)
    {
        if(A[i]>64 && A[i]<91 || A[i]>96 && A[i]<123 || A[i]>47 &&A[i]<58)
        {
            a[size]=A[i];
            size++;
        }
    }
   // string newStr(a);
    
    for(int i=0,j=size-1;;i++,j--)
    {
        if(a[i]<91)
        a[i]=a[i]+32;
        if(a[j]<91)
        a[j]=a[j]+32;
        if(i>j)
        break;
        if(a[i]!=a[j])
            palindrome=false;

    }
    if(palindrome==true)
     return 1;
     else 
     return 0;
}
