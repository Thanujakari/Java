package day2;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		String str1=new String("Hello");
		String str2=new String("Hello");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1==str2);//false
		System.out.println(str1.equals(str2));//true
		System.out.println();
		
		StringBuffer br1=new StringBuffer("Hello");
		StringBuffer br2=new StringBuffer("Hello");
		System.out.println(br1==br2);//false
		System.out.println(br1.equals(br2));//false
		System.out.println();
		System.out.println(br1.equals(br1));//true
		System.out.println(br1.capacity());//21
		System.out.println(br1.append("world"));//helloworld
		System.out.println(br1.capacity());//21
		System.out.println(br1.append("nhtrewscftuoojnnvcfrexft"));
		
		System.out.println(br1.capacity());//44
		System.out.println(br1.length());//34
		System.out.println(br1.getClass().getName());//StringBuffer
		
		System.out.println(str1.getClass().getName());//string
		String str3=new String(br1);//String
		System.out.println(br1.getClass().getName());
		
		// string to stringbuffer
		 String st=new String("hello");
		 StringBuffer sb=new StringBuffer(st);
		 System.out.println(st.getClass().getName());
		
		

	}

}
