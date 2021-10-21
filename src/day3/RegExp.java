package day3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp {

	public static void main(String[] args) {
		String str1="flyingreturn.base@airindia.in";
		String str2="star.retros@airindia.in";
		String str3="1860 233 1407";
		String str4="020-26231407";
		String str5="0930 hrs - 1730 hrs";
		String str6="MTNL / BSNL ";
		String str7="+ 91 124 2641407 (International call rates applicable)";
		
		System.out.println(Pattern.matches("\\w{3,}\\.\\w{2,}@\\w{3,}\\.\\w{2,}", str1));//true
		System.out.println(Pattern.matches("\\w{3,}\\.\\w{2,}@\\w{3,}\\.\\w{2,}", str2));//true
		System.out.println(Pattern.matches("[0-9]{4}\s[0-9]{3}\s[0-9]{4}", str3));//true
		System.out.println(Pattern.matches("[0-9]{3}-[0-9]{6,8}", str4));//true
		System.out.println(Pattern.matches("[0-9]{4}\s\\w{3,}\s-\s[0-9]{4}\s\\w{3}", str5));//true
		System.out.println(Pattern.matches("\\w{4}\s/\s\\w{4}\s", str6));//true
		System.out.println(Pattern.matches("\\+\s[0-9]{2}\s[0-9]{3}\s[0-9]{7}\s\\(\\w{4,}\s\\w{2,}\s\\w{3,}\s\\w{4,}\\)", str7));//true
		
		String str8="star.retros@airindia.in";
		String pattern="\\w{3,}\\.\\w{2,}@(\\w{3,})\\.\\w{2,}";
		Pattern p1 = Pattern.compile(pattern);
		Matcher m1=p1.matcher(str8);
		System.out.println(m1.matches());
		System.out.println(m1.group(0));
		System.out.println(m1.group(1));
		
		if(m1.group(1).equals("airindia")){
		      System.out.println("success");
		} 
		else
		{
			System.out.println("failure");
		}
		
		String str9="0930 hrs - 1730 hrs";
         String pattern1="[0-9]{4}\s\\w{3,}\s-\s([0-9]{4})\s\\w{3}";
         Pattern p2 = Pattern.compile(pattern1);
 		Matcher m2=p2.matcher(str9);
 		System.out.println(m2.matches());
 		System.out.println(m2.group(0));
 		System.out.println(m2.group(1));
 		
 		if(m2.group(1).equals("1730")){
 		      System.out.println("success");
 		} 
 		else
 		{
 			System.out.println("failure");
 		}
	}

}
