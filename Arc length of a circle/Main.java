#include<stdio.h>
int main()
{
float arc_length,radius,angle;
scanf("%f",&radius);
scanf("%f",&angle);
arc_length=2*3.14*radius*(angle/360);
printf("%.2f",arc_length);
return 0;
}