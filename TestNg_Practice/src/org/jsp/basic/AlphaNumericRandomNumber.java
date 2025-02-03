package org.jsp.basic;

public class AlphaNumericRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numeric = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int n = 20;
		
		StringBuilder sb = new StringBuilder(n);
		
		for(int i = 0;i < n;i++) {
			int index = (int)(numeric.length()*Math.random());
			System.out.println(index);
			sb.append(numeric.charAt(index));
		}
		
		System.out.println(sb);

	}

}
