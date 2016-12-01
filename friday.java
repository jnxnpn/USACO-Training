/*
ID: jpan1
LANG: JAVA
TASK: friday
*/
//Author: Jinxin Pan
//Date: Dec 30, 2016
//Note: Is a Friday the Thirteenth that rare? 

import java.io.*;



public class friday {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("friday.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("friday.out")));
		int year = Integer.parseInt(br.readLine());
		//int year = 20;
		int[] freq = {0,0,0,0,0,1,0};  // MON, TUE, etc. 
		int day = 5;  //Jan. 13, 1900 is actually a Saturday, but it's gotta fit the array index
		for (int i = 0 ; i < year-1 ; i++){
			for (int mth = 1 ; mth <=12; mth++ ){
				day = (day + numOfDays(1900+i,mth)-28)%7 ; 
				freq [day] ++; 
				//System.out.println("Month "+ (mth+1) + " is "+ (day+1)); // MONDAY = 1 WHEN PRINTED (in array it's 0)
			}
		}
		for (int mth = 1 ; mth <=11; mth++ ){
			day = (day + numOfDays(1900+year-1,mth)-28)%7 ; 
			freq [day] ++; 
			//System.out.println("Month "+ (mth+1) + " is "+ (day+1)); // MONDAY = 1 WHEN PRINTED (in array it's 0)
		}
		
		
		
		
		for (int i = 5 ; i < 5+6; i++){
			pw.print(freq[i%7] + " ");
		}
		pw.println(freq[4]);//just to satisfy the checker. They wouldn't want one extra space. Really.
		pw.close();
		br.close();
	}
	
	static int numOfDays (int year, int month){
		if (month == 2){
			if (isLeapYr (year))return 29;
			else return 28; 
		}else if (month <= 7){
			if (month %2 == 1) return 31;
			else return 30;
		}else if (month %2 == 0) return 31;
		else return 30;
	}
	
	static boolean isLeapYr (int year) {
		if (year%4 == 0 && year%100 != 0) return true;
		else if (year%400 == 0) return true; 
		else return false;
	}
	
	
}
