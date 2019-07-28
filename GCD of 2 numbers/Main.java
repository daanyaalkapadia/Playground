#include<stdio.h>
int main()
{
    int x,y,GCD;
    scanf("%d%d",&x,&y);
    GCD=(x<y)?x:y;
    while(GCD>0)
    {
        if(x%GCD==0 && y%GCD==0)
        {
            printf("%d",GCD);
            break;
        }
        GCD--;
    }
}
