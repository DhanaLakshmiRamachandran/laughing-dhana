
import java.io.*;
import java.util.*;



public class ReverseAndCaseChange {
	

		public static String output1;

		public static void main(String[] args) {
			ReverseAndCaseChange.reverseWords_andCase("WiprO TechNologies bangaLore", 1);
			System.out.println(output1);
		}

		public static void reverseWords_andCase(String input1, int input2) {

			if (input2 == 0) {
				String[] arr = input1.split(" ");
				int no_OfWords = arr.length;
				StringBuffer[] sb = new StringBuffer[no_OfWords];
				for (int i = 0; i < no_OfWords; i++) {
					sb[i] = new StringBuffer(arr[i]);
				}
				for (int i = 0; i < no_OfWords; i++) {
					sb[i].reverse();
				}

				String output = "";
				for (int i = 0; i < no_OfWords; i++) {
					output += " " + sb[i];
				}
				output1 = output.substring(1,output.length());
				output1.trim();
			} else if (input2 == 1) {
				int no_OfChar = input1.length();
				int[] flag = new int[no_OfChar];
				for(int i=0;i<no_OfChar;i++){
					if(input1.charAt(i)<91){
						flag[i]=1;
					}
					else{
						flag[i]=0;
					}
				}
				String[] arr = input1.split(" ");
				int no_OfWords = arr.length;
				StringBuffer[] sb = new StringBuffer[no_OfWords];
				for (int i = 0; i < no_OfWords; i++) {
					sb[i] = new StringBuffer(arr[i]);
				}
				for (int i = 0; i < no_OfWords; i++) {
					sb[i].reverse();
				}

				output1 = "";
				for (int i = 0; i < no_OfWords; i++) {
					output1 += " " + sb[i];
				}
				String ans = output1.toLowerCase();
				int j=0;
				for(int i=1;i<ans.length();i++){
					if(flag[j]==1){
						char ch = ans.charAt(i);
						char ch1 = ch;
						ch -= 32;
						String ans1 = ans.substring(0,i);
						String ans2 = ans.substring(i+1, ans.length());
						ans = ans1+ch+ans2;
					}
					j++;
				}
				output1 = ans.substring(1, ans.length());
				output1.trim();
			}
		}
	}

