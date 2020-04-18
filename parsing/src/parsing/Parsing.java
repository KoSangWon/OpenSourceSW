package parsing;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Parsing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input file : ");
		String inputFileName = scan.next();
		System.out.print("Output file : ");
		String outputFileName = scan.next();
		
		int numCnt = 0;
		int wordCnt = 0;
		int sentenceCnt = 0;
		
		try {
			FileReader in = new FileReader(inputFileName);
			FileWriter out = new FileWriter(outputFileName);
			//=================글자수======================
			boolean done = false;
			while(!done) {
				int next = in.read();
				if(next == -1) done = true;
				else {
					numCnt++;
				}
			}
			String numCntStr = "글자수 : " + String.valueOf(numCnt) + '\n';
			out.write(numCntStr);
			
			//=================단어수======================
			FileReader in2 = new FileReader(inputFileName);
			FileWriter out2 = new FileWriter(outputFileName);
			done  = false;
			while(!done) {
				int next = in2.read();
				if(next == -1) done = true;
				else {
					if((char)next == ' ' || (char)next == '\n')
						wordCnt++;
				}
			}
			String wordCntStr = "단어수 : " + String.valueOf(wordCnt + 1) + '\n';
			out.write(wordCntStr);
			
			//=================문장수======================
			FileReader in3 = new FileReader(inputFileName);
			FileWriter out3 = new FileWriter(outputFileName);
			done  = false;
			while(!done) {
				int next = in3.read();
				if(next == -1) done = true;
				else {
					if((char)next == '.' || (char)next == '?' || (char)next == '!')
						sentenceCnt++;
				}
			}
			String sentenceCntStr = "문장수 : " + String.valueOf(sentenceCnt) + '\n';
			out.write(sentenceCntStr);
			
			in.close();
			out.close();
			in2.close();
			out2.close();
			in3.close();
			out3.close();
			
			scan.close();
		}
		catch(IOException exception) {
			System.out.println("Error Processing file: " + exception);
		}
		
	}
}
