import java.util.Scanner;
import java.io.*;
public class Example1202 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Section:");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);
 
	}
	public static void showListStudent(int section) throws IOException{
		//read data from file
		BufferedReader readFile = new BufferedReader (new FileReader("d://txtFile//List107.txt"));
		String tmp = "";
		while((tmp= readFile.readLine())!= null) {
			//read midtem and final
			double midtemScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			int sectionFile = Integer.parseInt(data[3]);
			
			if(sectionFile==sectionInput){
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtemScore+"\t"+finalScore+"\t"+findResult(midtemScore,finalScore));
			}
		}
		readFile.close();
		
	}
	public static String findResult(double midTermScore,double finalScore) {
		double totalScore = midtemScore+finalscore;
		/* id(totalScore<=40) return "Fail";
		   else return "Pass";*/
		 
		return "";
	}
	public static void Header(int sec) {
		System.out.print("**************************************************");
		System.out.print("\tLIst of Data for Section"+ sec);
		System.out.print("**************************************************");
	}
 
}//end classes