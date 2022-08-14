import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ExtractNumFromString {

    public static void main(String[] args) {
		String myString = "That is 2 fifty dollar bills 10 twenty dollar bills 5 nickels and 3 pennies";
		//int output = extractInt(myString);
		int sum = 0;
		int[] ans = extractInt(myString);
		for(int myNums : ans)
			System.out.println(myNums);
		for(int i = 0; i < ans.length; i++) {
			sum += ans[i];
		}
		System.out.println(sum);
	}
	static int[] extractInt(String str) {
		int[] myInts = new int[4];
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(str);
		int counter = 0;
		while(m.find()) {
			myInts[counter] = Integer.parseInt(m.group());
			counter++;
		}
		//System.out.println(myInts);
		for(int nums : myInts)
			System.out.println(nums);
		//if(!m.find())
		//	throw new NumberFormatException("For input string [" + str + "]");


		return myInts;
	}
}
