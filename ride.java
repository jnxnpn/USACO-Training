import java.awt.Component;
import java.util.*;
import java.io.*;

//****************************************
//	Task: 1.1: Your Ride Is Here
//
//	Author: Jinxin Pan
//****************************************

public class ride{
	//------------
	//	USACO---
	//	1.1: Your Ride Is Here
	//------------

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("ride.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		String a = (br.readLine());
		String b = (br.readLine());
		//System.out.println(a+b);
		int aRmd = 1; 
		int bRmd = 1; 
		
		for (char ch : a.toCharArray()){
			aRmd *= ch-'A'+1; 
		}
		for (char ch : b.toCharArray()){	
			bRmd *= ch-'A'+1; 
		}
		
		if (aRmd%47 == bRmd%47) pw.println("GO");
		else pw.println("STAY");
		pw.close();
		
		
		
		
	}
}