import java.io.*;
public class Testing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple_compound cs = new Simple_compound();
		System.out.println("Simple Interest is : " + cs.findSimpleInterest(1000,2,5));
		System.out.println("Compound Interest yearly is : " + cs.findCompoundInterest(1500,2,5,true));
		System.out.println("Compound Interest half yearly is : " + cs.findCompoundInterest(1600,3,4,false));

}
}