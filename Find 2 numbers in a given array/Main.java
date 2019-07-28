#include<stdio.h>
int main()
{
  int limit,s1,s2,arr[100],i,flag=0,flag1=0,index1,index2;
  scanf("%d",&limit);
  for(i=0;i<limit;i++)
  {
  	scanf("%d",&arr[i]);
  }
  scanf("%d%d",&s1,&s2);
  for(i=0;i<limit;i++)
  {
  	if(s1 == arr[i] && flag==0)
    {
      flag=1;
      index1=i;
    }
    if(s2 == arr[i] && flag1==0)
    {
      flag1=1;
      index2=i;
    }
  }
  if(flag == 0)
    printf("Element 1 index = %d\n",-1);
  else if(flag ==1)
    printf("Element 1 index = %d\n",index1);
  if(flag1 == 0)
    printf("Element 2 index = %d",-1);
  else if(flag1 ==1)
    printf("Element 2 index = %d\n",index2);
}