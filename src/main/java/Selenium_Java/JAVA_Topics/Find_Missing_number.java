package Selenium_Java.JAVA_Topics;

public class Find_Missing_number {

	public static void main(String[] args) {
		
		
		int num[] = {1,2,3,4,5,7,8,9};
		int numsub = 0;
		
		for (int i = 0;i<num.length;i++) {
			
		
			numsub += num[i];
			
		}System.out.println(numsub);
		
		int Total = 0;
		
		for(int i =0;i<=9;i++) {
			
			Total = Total+i;
		}
		System.out.println(Total);
	}

}
