#include<stdio.h>
#include<string.h>
int main()
{
  int len=0,count=0;
  char string[40];
  gets(string);
  for(int i=0;string[i]!='\0';i++)
  {
  	count++;
  }
  printf("%d",count);
  return 0;
}