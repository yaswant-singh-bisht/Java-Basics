package javaBasics;

public class StringClass {

	public static void main(String[] args) {

		String s = "my name is yash";
		System.out.println(s);
				
		System.out.println(s.charAt(1));
		String str1 = "Learning";
		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		String str2 = new String("learning");
		String str3 = new String("Java Tutorial");
		System.out.println(str1.compareToIgnoreCase(str2)); //Unicode comparision
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.compareTo(str3));
		
		String str4 = new String("Its ok");
		String str5 = new String("Its ok");
		System.out.println(str1.contentEquals(str2));
		System.out.println(str4.contentEquals(str5));
		
		String s1 = "Hi";
		System.out.println(s1.concat(" Yash"));
		
		char[] list1 = {'h','e','l','l','o'};
		String list2 = "";
		System.out.println(list2.copyValueOf(list1));
		System.out.println(list2.copyValueOf(list1, 1, 3));
		System.out.println(str1.endsWith("ng"));
		System.out.println(s.length());
		System.out.println(str1.replace('L', 'H'));
		
		String str = new String("Welcome to Tutorialspoint.com");
		String substr = new String("Tutorials");
		System.out.println("Found index: "+ str.indexOf(substr));
		
		float floatvar = 10.02f;
		int intvar = 20;
		String strvar = "Yash";
		
		String fs = String.format("Float value "+
					"%f, Int value is "+
					"%d, and the string is "+
					"%s", floatvar,intvar,strvar);
		System.out.println(fs);
		
		String str6 = " trim ";
		System.out.println(str6.trim());
	}

}
