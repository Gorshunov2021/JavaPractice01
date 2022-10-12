package task0007_compareString;

public class ComparisonString {
	public static void main(String[] args) {
		String str1, str2;
		str1="JAVA";
		str2=str1;
		System.out.println("comparison of references " + (str1==str2));

		str2 = new String("JAVA"); // is equivalent to str2 = new String(str1);
		System.out.println("comparison of references " + (str1==str2));
		System.out.println("comparison of values " + str1.equals(str2));
	}
}
