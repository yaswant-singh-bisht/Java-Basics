package javaTopics;

public class StringBufferClass {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("String Buffer Example...");
		System.out.println(sb);
		
		System.out.println(sb.append("... append text"));
		System.out.println(sb.insert(14,"...inserted text at index 14... "));
		System.out.println(sb.delete(14,46)); // Delete text from index 14 to 46
		System.out.println(sb.reverse());
		System.out.println(sb.replace(0, 100, "New String"));
		System.out.println(sb.length());
		System.out.println(sb.substring(4));// Display from index 4
		System.out.println(sb.substring(2,6)); // Display from index 2 to 6
		System.out.println(sb.subSequence(2, 6)); // Display from index 2 to 6
		System.out.println(sb.indexOf("w"));
		System.out.println(sb.charAt(4));
		
		
	}

}
