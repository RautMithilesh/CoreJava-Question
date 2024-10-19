
/* Que no 2 = Write a C program to accept string with multiple spaces
           from user and print it with a sinlge space as a delimiter */

#include <stdio.h>


void main()
{

	char str[100];       // declaration + initilization 
	int i=0;

	printf("please enter a string:\n");

	fgets(str,sizeof(str),stdin);    

	while(str[i]!='\n')
	{
		if(str[i]!=' ')
		{
			printf("%c", str[i]);
		}
	      if(str[i]==' ' && str[i+1]!=' ')
		{
			printf("%c", str[i] );

		}
			i++;
	}
	
}