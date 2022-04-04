package JavaInterviews;

public class SplitWordsExample {
	
	public static void main (String [] args) {
		
		// you are given a string
		//reverse the string based on words
		// and reverse each words separately
		//jamil is a tester
		//limaj si a retset
		//tester a is jamil
	
		String s ="Jamil is a tester";
		System.out.println(revWords(s));
		//stringbuffer
		StringBuffer sb =new StringBuffer(s);
		System.out.println(sb.reverse());
		
	}
	public static String revWords(String str) {
		   String[]words = str.split(" ");
		   String rev =" ";
		   
	for( int i =words.length-1; i >=0; i--) {
			rev += words[i] + " ";
			}
			return rev;
		}
		
	}
	
	


 