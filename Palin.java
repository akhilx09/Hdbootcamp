//Write a Program to find Palindrome Number
eg. Input n=121 then after reverse output is same 121 then it is a palindrome.
eg. Input n=321 then after reverse output is not same it's 123 then it is not a palindrome number.


class Palin {
	static int reversNumber(int n)
	{
		int reversed_n = 0;
		while (n > 0) {
			reversed_n = reversed_n * 10 + n % 10;
			n = n / 10;
		}
		return reversed_n;
	}
	public static void main(String[] args)
	{
		int n = 123464321;
		int reverseN = reversNumber(n);
		System.out.println("Reverse of n = " + reverseN);
		if (n == reverseN)
			System.out.println("Palindrome = Yes");
		else
			System.out.println("Palindrome = No");
	}
}
