package switchh;

public class ifelseswitch
{
	
	int n=1;
	void lalit(int n)
	{
		if(n>=1)
		{
			int m;
			switch(n)
			{
				case 1:
					System.out.println("first switch");
					if(n==1)
					{
						System.out.println("first switch if");
						switch(n)
						{
						case 1:
							System.out.println("dfdf");
							break;
						case 2:
							System.out.println("dfd");
							break;
						}
					}
					else
					{
						System.out.println("first switch else...");
					}
					break;	
				case 2:
					System.out.println("first switch1");
					break;
				default:
					System.out.println("default first");
					break;
			}
		}
		else
		{
			System.out.println("hiii");
		}

	}
	public static void main(String[] args) 
	{
		ifelseswitch i=new ifelseswitch();
		i.lalit(1);
	}

}
