#include<stdio.h>
int main()
{
	 int a,b,c[100],d=0;
	 scanf("%d",&a);
	 for(int i=0;i<a;i++)
     {
     sacnf("%d",&b);
	 for(int i=0;i<b;i++)
	 scanf("%d",&c[i]);	
	 for(int i=0;i<b;i++)
	 d=d+c[i];
	 printf("%d",d);
	 printf("\n");
	 }
	 return 0;
     
 } 
