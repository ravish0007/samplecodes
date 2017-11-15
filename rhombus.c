#include<stdio.h>
#include<string.h>
 void f(int x)
 { int j=x;  if(x==2)  printf(" ") ;   else  { for(j;j>2;j--){ if (j==3) printf("   "); else printf("  ");}  } }
 void y(int x,int l)
    { int j=1; while(j<=(l-x)) { printf(" "); j++;}  printf("*");f(x);printf("*");   }
 
 void main()
 { int i,n,k,b,c; 
     printf("enter rows \n"); scanf("%d",&n);
      for(i=1;i<=(2*n-1);i++)
     { if(i==1||i==(2*n-1)){k=1; while(k<=n-1){ printf(" ");k++;} printf("*\n"); continue;}
        else if(i<=n) { y(i,n); printf("\n");continue;}
        else { b=n-(i- n); y(b,n); printf("\n"); continue;}
     }
 }

 
 
 
