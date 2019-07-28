#include<stdio.h>
#include<string.h>

int main()
{
  char string[100];
  gets(string);
  int count=0;
  for(int i=0;i<strlen(string)-1;i++)
  {
  	if(string[i]==' ')
      count++;
  }
  printf("%d",count+1);
}