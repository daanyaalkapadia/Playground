#include<stdio.h>
#include<string.h>
int main()
{
  int i=0;
  char str1[100],str2[100],str3[100],str[100];
  gets(str1);
  gets(str2);
  gets(str3);
  for(i=0;i<strlen(str1);i++)
  {
  	if(str1[i]=='a'||str1[i]=='e'||str1[i]=='i'||str1[i]=='o'||str1[i]=='u'||
      str1[i]=='A'||str1[i]=='E'||str1[i]=='I'||str1[i]=='O'||str1[i]=='U')
    {
      str1[i]='$';
    }
  }
  
    for(i=0;i<strlen(str2);i++)
  {
  	if(str2[i]!='a'&&str2[i]!='e'&&str2[i]!='i'&&str2[i]!='o'&&str2[i]!='u'&&
      str2[i]!='A'&&str2[i]!='E'&&str2[i]!='I'&&str2[i]!='O'&&str2[i]!='U')
    {
    	str2[i]='#';
    }
  }
  for(i=0;i<strlen(str3);i++)
  {
    if(str3[i]>='a'&&str3[i]<='z')
  	str3[i]=str3[i]-32;
  }
  //strcat(str1,str2);
  for(i=0;str1[i]!='\0' && str1[i]!=' ';i++)
    printf("%c",str1[i]);
    for(i=0;i<5;i++)
    printf("%c",str2[i]);
    for(i=0;i<strlen(str3);i++)
    printf("%c",str3[i]);
  	//printf("%s",str2);
  	//printf("%s",str3);
 
}