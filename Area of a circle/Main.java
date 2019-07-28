#include<stdio.h>
int main()
{
  float radius,diameter=0,area;
  scanf("%f",&diameter);
  radius=diameter/2;
  area=3.14*radius*radius;
  printf("%.2f",area);
  return 0;
}