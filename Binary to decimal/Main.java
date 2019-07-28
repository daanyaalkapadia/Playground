#include<stdio.h>
#include<math.h>
int main()
{
  int n,rev,digit,i=0,sum=0;
  scanf("%d",&n);
  while(n!=0)
  {
  	digit=n%10;
    sum=sum+digit*power(i);
    n=n/10;
    i++;
  }
  printf("%d",sum);
  return 0;
}
int power(int y)
{
    int mul=1;
    for(int i=0;i<y;i++)
    {
        mul=mul*2;
    }
    return mul;
}