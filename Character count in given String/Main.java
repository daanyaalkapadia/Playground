#include<stdio.h>
#include<string.h>
int main()
{
  int count=1,j=0,strs[50],store=0;
  char string[100],str[50];
  gets(string);
  for(int i=0;i<strlen(string);i++)
  {
  	if(string[i] ==string[i+1])
      count++;
    else
    {
		str[j]=string[i];
        strs[j]=count;
      	store=count;
      	j++;
      	count=1;
    }
  }
  if(store>20)
  {
    printf("Invalid Input");
  }
  else
  {
	for(int i=0;i<j;i++)
	{
		printf("%c%d",str[i],strs[i]);
	}
  }
}