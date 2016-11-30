/*
ID: jpan1
LANG: JAVA
TASK: gift1
*/
//Author: Jinxin Pan
//Date: 11/29/16
//Note: This is Training 1.1
import java.util.*;
import java.io.*;
public class gift1 {
	static Person[] list ; 
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("gift1.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gift1.out")));
		int headCount = Integer.parseInt(br.readLine());
		list = new Person[headCount];  
		for(int i = 0 ; i < headCount ; i ++ ){
			//Scanner scan = new Scanner (br.readLine()); 
			/*while (scan.hasNext()){
				System.out.println(scan.next());
			}*/
			list [i] = new Person (br.readLine());
		}
		//Scanner scan = new Scanner (br); 
		for(int i = 0 ; i < headCount ; i ++ ){
			Person thisPerson = drawPerson (br.readLine());
			Scanner scan = new Scanner (br.readLine()); 
			int moneyToGive = Integer.parseInt(scan.next()); 
			int numReceiver = Integer.parseInt(scan.next()); 
			int eachGets = 0 ; 
			if (numReceiver != 0 ) eachGets=moneyToGive/numReceiver; 
			scan.close(); 
			
			for (int u = 0; u < numReceiver; u++){
				drawPerson (br.readLine()).receives +=(eachGets);
				thisPerson.gives+=((eachGets)); 
				System.out.println(thisPerson.name+ " gives " + eachGets + " to "+ numReceiver + " PPL");
			}
		}
		for (Person pr : list){
			pw.println(pr.toString());
		}
		pw.close();
	}
	
	static Person drawPerson (String name){
		for (Person pr : list){
			if (pr.is(name)) return pr;
		}
		return null;
	}
}

class Person {
	String name ; 
	int account; 
	int gives; 
	int receives;
	Person (String name){
		this.name = name; 
		
	}

	boolean is (String nm){
		return name.equals(nm);
	}
	public String toString (){
		return (name + " " + (receives-gives)); 
	}
}
