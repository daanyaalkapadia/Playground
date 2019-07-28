#include <stdio.h>
#include<string.h>
int main() {
	char c;
  	int s;
  	scanf("%c",&c);
  	if(c>=65 && c<=90){
      s=c+32;}
  	else
      s=c-32;
  	printf("%c",s);
	return 0;
}