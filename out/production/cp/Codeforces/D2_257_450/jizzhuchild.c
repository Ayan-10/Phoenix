#include<stdio.h>
#include<math.h>
int main()
{
    int n,m;
    scanf("%d %d",&n,&m);
    double a[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%lf",&a[i]);
    }
    double max = 0;
    int idx;
    for (int i = 0;i<n ;i++){
        int temp = a[i];
        if (ceil(temp/m) >= max ){
            idx = i;
            max = ceil(temp/m);
            
        }
    }
    printf("%d", idx+1);
    return 0;
}

