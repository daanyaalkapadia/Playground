#include<stdio.h>
int main()
{
	int n,j;
  scanf("%d",&n);
  if(n%2!=0){
    int x=-2;
  	for(j=1;j<=n;j++)
    {
    	x=x+2;
      j++;
    }
    printf("%d",x);
    }
  else
  {
    int count=-2;
  	for(int i=0;i<=n;i++)
    {
    	count++;
      i++;
    }
    printf("%d",count);
  }
}