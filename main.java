import java.util.Scanner;
public class GMain {
	private static int box [][]=new int [5][3];
	public static void main(String[] args)
	{
		System.out.println("Hi");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<3;j++)
				if (j==0)
					box[i][j]=i+1;
				else
					box[i][j]=0;
		}
		bPrint();
		int cunt=0;
		for(int i=0;i<100;i++)
		{
			if(checkCulum( cunt)!=-1)//to check the column not be empty
			{
				if (checkCulum( ((((cunt+1)%3))%3))==-1)
				{
					
					box[4][((cunt+1)%3)]=box[checkCulum( cunt)][cunt];
					box[checkCulum( cunt)][cunt]=0;
					cunt=(((cunt+2)%3))%3;

					Scanner input=new Scanner(System.in);
					String s=input.nextLine();
					bPrint();
				}
				else if (box[checkCulum( cunt)][cunt]<box[checkCulum( ((cunt+1)%3))][((cunt+1)%3)])
				{
					box[checkCulum( ((cunt+1)%3))-1][((cunt+1)%3)]=box[checkCulum( cunt)][cunt];
					box[checkCulum( cunt)][cunt]=0;
					cunt=(((cunt+2)%3))%3;
					Scanner input=new Scanner(System.in);
					String s=input.nextLine();
					bPrint();
					
				}
				else if (checkCulum( ((cunt+2)%3))==-1)
				{
					
					box[4][((cunt+2)%3)]=box[checkCulum( cunt)][cunt];
					box[checkCulum( cunt)][cunt]=0;
					cunt=(cunt+3)%3;
					Scanner input=new Scanner(System.in);
					String s=input.nextLine();
					bPrint();
		
				}
				else if	(box[checkCulum( cunt)][cunt]<box[checkCulum( ((cunt+2)%3))][((cunt+2)%3)])
				{
					box[checkCulum( ((cunt+2)%3))-1][((cunt+2)%3)]=box[checkCulum( cunt)][cunt];
					box[checkCulum( cunt)][cunt]=0;
					cunt=(cunt+3)%3;
					Scanner input=new Scanner(System.in);
					String s=input.nextLine();
					bPrint();
				}
				else
				{
					cunt=(((cunt+1)%3))%3;
					Scanner input=new Scanner(System.in);
					String s=input.nextLine();
					bPrint();
				}
			}
			else 
			{
				cunt=(((cunt+1)%3))%3;
				Scanner input=new Scanner(System.in);
				String s=input.nextLine();
				bPrint();
			}
		}
	}//end of main
	public static int checkCulum(int c)
	{
		if (c>2)
		{
			System.out.print("Hi ");
			Scanner input=new Scanner(System.in);
			String s=input.nextLine();
			c=c%3;
		}
		for(int i=0;i<5;i++)
		{
			if (box[i][c]<6&&box[i][c]>0)
				return i;
		}
		return -1;
	}
	public static Boolean checkAnswer()
	{
		//Boolean a;
		if (box[4][2]==5 && box[3][2]==4 &&
				box[2][2]==3 &&box[1][2]==2 &&box[0][2]==1  )
			return true;
		else
			return false;
	}
	public static void  bPrint()
	{
		System.out.print("press enter for next");
		for(int i=0;i<5;i++)
		{
			System.out.println("");
			for(int j=0;j<3;j++)
			{
				System.out.print(box[i][j]+" ");
			}
		}
	}
}//end of class


