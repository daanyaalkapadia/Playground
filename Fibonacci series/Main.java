#include<stdio.h>
int main()
{
  int n,t;
  scanf("%d",&n);
  int f=0;
  int s=1;
  printf("%d %d ",f,s);
  for(int i=3;i<=n;i++){
    t=f+s;
  	printf("%d ",t);
  	f=s;
  	s=t;}
  return 0;
}