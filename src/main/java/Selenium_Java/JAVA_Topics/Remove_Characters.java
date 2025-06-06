package Selenium_Java.JAVA_Topics;

public class Remove_Characters {

	public static void main(String[]args) {
		//  REGULAR Expression :(i)   [a-zA-Z0-9] when you don't want     (ii)  [^a-zA-Z0-9] when you want value
		
		String Text = "adsafdadasd1YUVYUVU2HKJYUTVKU3%^&$^%#4^^*%$!5(*%&6";  //only want integer into this string
		
		Text =Text.replaceAll("[^0-9]", "");
		System.out.println(Text);
		
	}

}
