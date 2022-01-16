package day2Ex;

import java.util.Scanner;

public class question1 {
	public static void main(String[] args) {
//*****************QUESTION-1*********************************		
		int num= 4;
		for (int x=0; x<=num; x++) 
			{
				for (int y=1; y<=x+1; y++) 
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		for (int i=1; i<=num; i++) 
		{
			for (int j=1; j<=num+1-i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
//--------------------------------------------------------------------
//*********************Question-2*************************************
	
			    int rows = 5, k = 0;

			    for (int i = 1; i <= rows; ++i, k = 0) {
			      for (int space = 1; space <= rows - i; ++space) {
			        System.out.print("  ");
			      }

			      while (k != 2 * i - 1) {
			        System.out.print("* ");
			        ++k;
			      }

			      System.out.println();
			    }
		
//---------------------------------------------------------------------
//*********************QUESTION-3**************************************
	
	int num ;
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter Number:");
	num = sc.nextInt();
	
	for(int i = 1; i <= 10; ++i)
    {
        System.out.printf("%d * %d = %d \n", num, i, num * i);
    }

//-------------------------------------------------------------------
//***************************Question-6*******************************

	int sum = 0;
	int[] num = new int[3];
	num [0]=10;
	num [1]=20;
	num [2]=30;
	for (int i=0; i<num.length; i++) {
		sum=sum+num[i];
	}
	System.out.printf("Average is : %d", sum/num.length);
		
//----------------------------------------------------------------------
//****************************Question-7********************************
	
	int[] num = new int[3];
	num [0]=10;
	num [1]=20;
	num [2]=30;
	if (num[0]>num[1] && num[0]>num[2]) {
		System.out.println(num[0] +" is the highest number.");
	}
	else if (num[1]>num[2]) {
		System.out.println(num[1] +" is the highest number.");
	}
	else {
		System.out.println(num[2] +" is the highest number.");
	}
		
//---------------------------------------------------------------------
//*****************************Question-8******************************
String[] days = new String[7]; 
days[0] = 'Sunday';
days[1] = 'Monday';
days[2] = 'Tuesday';
days[3]	= 'Wednesday';
days[4]='Thursday';
days[5]='Friday';
days[6]='Saturday';
for (int i=0; i<days.length; i++) {
	System.out.println(days[i]);
}


//***********************************************************************	
//***********************************************************************
		}

	}

