#include <stdio.h>

int main()
{
    int x=0,y=0,z=0;
    char c,c1;
    scanf("%d%c%d%c%d",&x,&c,&y,&c1,&z);
    if(x>y && x>z)
    {
        printf("%d",x);
    }
    else if(y>x && y>z)
    {
        printf("%d",y);
    }
    else
    {
        printf("%d",z);      
    }
    
    return 0;
}