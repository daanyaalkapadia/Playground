#include<stdio.h>
int main()
{
  char str[100],str1[100];
    int i=0,j=0;
  scanf("%[^\n]s", str);
  //Type your code here
  for(i=0;i<str[i]!='\0';i++)
  {
  	if(str[i]!='a'&&str[i]!='e'&&str[i]!='i'&&str[i]!='o'&&str[i]!='u'&&
      str[i]!='A'&&str[i]!='E'&&str[i]!='I'&&str[i]!='O'&&str[i]!='U')
    {
      str1[j]=str[i];
      //printf("%c",str1[j]);
      j++;
    }
  }
  for(i=0;i<j;i++)
printf("%c",str1[i]);
  return 0;
}