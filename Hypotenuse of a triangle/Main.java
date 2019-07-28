#include<stdio.h>
int main()
{
  float opp,adj,hyp;
  scanf("%f%f",&opp,&adj);
  hyp=opp*opp+adj*adj;
  hyp=sqrt(hyp);
  printf("%.2f",hyp);
  return 0;
}