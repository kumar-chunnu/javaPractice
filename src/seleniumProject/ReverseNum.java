package seleniumProject;

public class ReverseNum {

	public static void main(String[] args) {
		int i=123;
	    int res1,res2,res3,res4;
		res1=i%10;
		System.out.print(res1);
		res2=i/10;
		res3=res2%10;
		System.out.print(res3);
		res4=res2/10;
		System.out.print(res4);
	}
}
