#include<stdio.h>
int main()
{
  	int limit,max,i;
  scanf("%d",&limit);
  int arr[limit];
  	for(i=0;i<limit;i++)
    {
    	scanf("%d",&arr[i]);
    }
  max=arr[0];
    for(i=1;i<limit;i++)
    {
    	if(arr[i]>max)
        {
          max=arr[i];
        }
    }
  printf("%d",max);
}