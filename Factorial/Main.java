#include<stdio.h>
int main()
{
	int n;
  long fact=1;
  	scanf("%d",&n);
  if(n==0)
  {
  	fact=1;
  }
  else{
  	for(int i=1;i<=n;i++)
    {
    	fact=fact*i;
    }
  }
  printf("%ld",fact);
}