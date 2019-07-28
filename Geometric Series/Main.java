#include<stdio.h>
#include<math.h>
int main()
{
  int n,i,count=0,res;
  scanf("%d",&n);
  if(n%2!=0)
  {
  	for(i=0;i<=n;i++)
    {
    	if(i%2!=0)
          count++;
    }
    res=pow(2,count-1);
    printf("%d",res);
  }
  else
  {
  	for(i=0;i<=n;i++)
    {
    	if(i%2==0)
          count++;
    }
    res=pow(3,count-2);
    printf("%d",res);
  }
  return 0;
}