
package alphabets;
import java.util.Scanner;

public class Run extends Thread {
	
	public static void execute(char[] arr,int n)
	{
		int s=2,e=n-1;
		int start=2,end=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int k=0;k<arr.length;k++)
			{
				switch(arr[k])
				{
				   case 'A':
				   {
					   for(int j=1;j<n;j++)
						{
						    if(i==1 || i==(n/2)+1 || j==1 || j==n-1)
							{
								System.out.print("A ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
					   System.out.print("  ");
					   break;
				   }
				   
				   case 'B':
				   {
					   for(int j=1;j<=n;j++)
						{
							if((i==1 && j==n) || (i==n && j==n) || (i==(n/2)+1 && j==n))
							{
								System.out.print("  ");
								sleep_method();
							}
							else if(i==1 || i==(n/2)+1 || i==n || j==1 || j==n)
							{
								System.out.print("B ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
					   System.out.print("  ");
					   break;
				   }
				   
				   case 'C':
				   {
					   for(int j=1;j<=n;j++)
						{
							if((i==1 && j==1) || (i==n && j==1) )
							{
								System.out.print("  ");
								sleep_method();
							}
							else if(i==1 || i==n || j==1)
							{
								System.out.print("C ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");
					   break;
				   }
				   
				   case 'D':
				   {
					   for(int j=1;j<n;j++)
						{
							if((i==1 && j==n-1) || (i==n && j==n-1))
							{
								System.out.print("  ");
								sleep_method();
							}
							else if(i==1 || i==n || j==1 || j==n-1)
							{
								System.out.print("D ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");
					   break;
				   }
				   
				   case 'E':
				   {
					   for(int j=1;j<n;j++)
						{
							if(i==1 || i==(n/2)+1 || i==n || j==1)
							{
								System.out.print("E ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");
					   break;
				   }
				   
				   case 'F':
				   {
					   for(int j=1;j<=n;j++)
						{
							if(i==1 || i==(n/2)+1 || j==1)
							{
								System.out.print("F ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");   
					   break;
				   }
				   
				   case 'G':
				   {
					   for(int j=1;j<=n;j++)
						{
							if((i==1 && j==1) || (i==n && j==1))
							{
								System.out.print("  ");
								sleep_method();
							}
							else if(i==1 || i==n || j==1 || (i>=(n/2)+1 && j==n) || (i==(n/2)+1 && j>=(n/2)+1))
							{
								System.out.print("G ");
								sleep_method();
							}
							else
							{ 
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");
					   break;
				   }
				   case 'H':
				   {
					   for(int j=1;j<=n;j++)
						{
							if(i==(n/2)+1 || j==1 || j==n)
							{
								System.out.print("H ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
					   System.out.print("  ");
					   break;
				   }
				   
				   case 'I':
				   {
					   for(int j=1;j<=n;j++)
						{
							if(i==1 || i==n || j==(n/2)+1)
							{
								System.out.print("I ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");
					   break;
				   }
				   
				   case 'J':
				   {
					   for(int j=1;j<=n;j++)
						{
							if(i==1 || j==(n/2)+1 || (i==n && j<=(n/2)+1) || (i>=(n/2)+2 && j==1))
							{
								System.out.print("J ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");
					   break;
				   }
				   
				   case 'K':
				   {
					   for(int j=1;j<=n;j++)
						{
							if(j==1 || (i==(n/2)+1  && j<=(n/2)+1)|| (i<=(n/2)+1 && j==(n-i+1)) || (i>=(n/2)+1) && i==j)
							{
								System.out.print("K ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");
						break;
				   }
				   
				   case 'L':
				   {
					   for(int j=1;j<=n;j++)
						{
							if(i==n || j==1)
							{
								System.out.print("L ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");
					   break;
				   }
				   
				   case 'M':
				   {
					   for(int j=1;j<=n;j++)
						{
							if(j==1 || j==n || (i<=(n/2)+1 && j==i)|| (i<=(n/2)+1 && i==(n-j+1)))
							{
								System.out.print(" M");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");
					   break;
				   }
				   
				   case 'N':
				   {
					   for(int j=1;j<=n;j++)
						{
							if(i==j || j==1 || j==n)
							{
								System.out.print("N ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");
						break;
				   }
				   
				   case 'O':
				   {
					   for(int j=1;j<=n;j++)
						{
							if((i==1 && j==1) || (i==1 && j==n) || (i==n && j==1) || (i==n && j==n))
							{
								System.out.print("  ");
								sleep_method();
							}
							else if(i==1 || i==n || j==1 || j==n)
							{
								System.out.print("O ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");	
						break;
				   }
				   
				   case 'P':
				   {
					   for(int j=1;j<=n;j++)
						{
						    if((i==1 && j==n) || (i==(n/2)+1 && j==n))
						    {
						    	System.out.print("  ");
						    	sleep_method();
						    }
						    else if(i==1 || i==(n/2)+1 || j==1 || (i<=(n/2)+1 && j==n))
							{ 
								System.out.print("P ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
					   System.out.print("  ");
					   break;
				   }
				   
				   case 'Q':
				   {
					   for(int j=1;j<=n;j++)
						{
							if((i==1 && j==1) || (i==1 && j==n) || (i==n && j==1) || (i==n && j==n))
							{
								System.out.print("  ");
								sleep_method();
							}
							else if(i==1 || i==n || j==1 || j==n || (i>=(n/2)+1 && i==j))
							{
								System.out.print("Q ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");
					   break;
				   }
				   
				   case 'R':
				   {
					   for(int j=1;j<=n;j++)
						{
						    if((i==1 && j==n) || (i==(n/2)+1 && j==n))
						    {
						    	System.out.print("  ");
						    	sleep_method();
						    }
						    else if(i==1 || i==(n/2)+1 || j==1 || (i<=(n/2)+1 && j==n) || (i>=(n/2)+1 && i==j))
							{
								System.out.print("R ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");
					   break;
				   }
				   
				   case 'S':
				   {
					   for(int j=1;j<=n;j++)
						{
                            if(i==1 || i==(n/2)+1 || i==n || (i<=(n/2)+1 && j==1) || (i>=(n/2)+1 && j==n))
							{
								System.out.print("S ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");
					   break;
				   }
				   
				   case 'T':
				   {
							for(int j=1;j<=n;j++)
							{
								if(i==1 || j==(n/2)+1)
								{
									System.out.print("T ");
									sleep_method();
								}
								else
								{
									System.out.print("  ");
									sleep_method();
								}
							}
							System.out.print("  ");
					   break;
				   }
				
				   case 'U':
				   {
					  
							for(int j=1;j<=n;j++)
							{
								if((i==n && j==1) || (i==n && j==n))
								{
									System.out.print("  ");
									sleep_method();
								}
								else if(i==n || j==1 || j==n)
								{
									System.out.print("U ");
									sleep_method();
								}
								else
								{
									System.out.print("  ");
									sleep_method();
								}
							}
							System.out.print("  ");
					   break;
				   }
				   
				   case 'V':
				   {
					   for(int j=1;j<=n;j++)
						{
							if((i<=(n/2)+1 && j==1) || (i<=(n/2)+1 && j==n))
							{
								System.out.print("V ");
								sleep_method();
							}
							else if((i>(n/2)+1 && j==s) || (i>(n/2+1) && j==e))
							{
								System.out.print("V ");
								sleep_method();
								
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
							
						}
						if(i>(n/2+1))
						{
							s++;
							e--;
						}
						System.out.print("  ");
					
					   break;
				   }
				   
				   case 'W':
				   {
					   for(int j=1;j<=n;j++)
						{
							if(j==1 || j==n || (i>=(n/2)+1 && i==j) || (i>=(n/2)+1 && i==n-j+1))
							{
								System.out.print("W ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");
					   break;
				   }
				   
				   case 'X':
				   {
					   for(int j=1;j<=n;j++)
						{
							if((i==j) || i==(n-j+1))
							{
								System.out.print("X ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");
					   break;
				   }
				   
				   case 'Y':
				   {
					   for(int j=1;j<=n;j++)
						{
							if((i<=(n/2) && i==j) || (i<=(n/2) && i==(n-j)))
							{
								System.out.print("Y ");
								sleep_method();
							}
							else if((i>=(n/2)+1 && j==(n/2)))
							{
								System.out.print(" Y");
                                 sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
					   System.out.print("  ");
					   break;
				   }
				   
				   case 'Z':
				   {
					   for(int j=1;j<=n;j++)
						{
							if(i==1 || i==n || i==n-j+1)
							{
								System.out.print("Z ");
								sleep_method();
							}
							else
							{
								System.out.print("  ");
								sleep_method();
							}
						}
						System.out.print("  ");
				   }
				   case ' ':
				   {
					   for(int j=1;j<=1;j++)
					   {
						   System.out.print("  ");
						   sleep_method();
					   }
					   System.out.print("  ");
				   }
				}
				
			}
			System.out.println();
		}
		
	}
	
	public static void sleep_method()
	{
		try {
			Thread.sleep(10);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter BirthDay Boy Name:-");
		String str=scan.nextLine();
		str=str.trim();
		str=str.toUpperCase();
		char[] name=str.toCharArray();
		char happy[]= {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','H','A','P','P','Y'};
		char birth[]= {' ',' ',' ' ,' ',' ',' ',' ',' ','B','I','R','T','H','D','A','Y'};
		char advance[]= {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','A','D','V','A','N','C','E'};
		execute(advance,7);
		System.out.println("\n");
		execute(happy,7);
		System.out.println("\n");
		execute(birth,7);
		System.out.println("\n");
	    execute(name,7);
		System.out.println("\n");
	}

}
