#include<stdio.h>
int main()
{
  int length,arr[100],search,flag=0;
  scanf("%d",&length);
  for(int i=0;i<length;i++)
  {
  	scanf("%d",&arr[i]);
  }
  scanf("%d",&search);
  for(int j=0;j<length;j++)
  {
  	if(search == arr[j]){
      printf("%d",j+1);
    	flag=1;}
  }
  if(flag==0)
    printf("%d isn't present in the array.",search);
  return 0;
}