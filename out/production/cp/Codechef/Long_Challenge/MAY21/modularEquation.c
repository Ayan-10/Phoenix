#include<stdio.h>
#include<math.h>
int main()
{
    int t,n,m;
    scanf("%d",&t);
    while (t-->0)
    {
    scanf("%d %d",&n,&m);
          
    int count = 0;
    for (int i = 1;i<n+1 ;i++){
        for (int j = i+1; j < n+1; j++)
        {
            if( i < j <= n && ((m%i)%j) == ((m%j)%i)){
                count++;
            }
        }
    }
    printf("%d", count);
    printf("\n");
    }
    return 0;
}