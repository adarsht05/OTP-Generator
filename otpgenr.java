import java.util.*;
public class newClass
{
	static char[] OTP(int len)
	{
		System.out.println("generating otp using random() fn:");
		System.out.println("Your otp is:");
		String numbers="0123456789";
		Random rndm_method = new Random();
		char[] otp = new char[len];
		for(i=0;i<len;i++)
			otp[i]= numbers.charAt(rndm_method.nextInt(numbers.length()));
		return otp;
	}
	public static void main(String[] args)
	{
		int length = 4;
		System.out.println(OTP(length));
	}
}