#include<stdio.h>
#include<ctype.h>
#include<math.h>

int main()
{
	int n,moves;

	printf("How many Disks You Want :");
	scanf("%d",&n);

	moves=pow(2,n)-1;

	for(int i=1;i<=moves;i++)
	{
		if(i%3==1){
			printf("\nS->D");			
		}
		if(i%3==2){
			printf("\nS->A");			
		}
		if(i%3==0){
			printf("\nA->D");			
		}
	}	
}
