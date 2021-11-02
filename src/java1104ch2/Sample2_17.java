package java1104ch2;


public class Sample2_17 {
	public static void main(String[] args)
	{
		int[]test;
		test = new int[5];
				
		test[0]	= 80;
		test[1]	= 66;
		test[2]	= 23;	
		test[3]	= 51;	
		test[4]	= 79;
		
		test[10]=77;
		for(int i=0;i<5;i++) {	
			System.out.println("第" + (i+1) + "個人的分數是" + test[i]+"分");
		}
	}
}	