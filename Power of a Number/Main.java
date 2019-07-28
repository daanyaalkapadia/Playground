#include <stdio.h>
int main()
{
  long int num,pow,result=1;
  scanf("%ld%ld",&num,&pow);
  if(pow<0)
    printf("Wrong input");
  else{
  for(int i=1;i<=pow;i++)
  {
  	result=result*num;
  }
  printf("%ld",result);
  }
    return 0;
}