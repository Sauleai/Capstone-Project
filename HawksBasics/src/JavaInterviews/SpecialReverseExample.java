package JavaInterviews;

public class SpecialReverseExample {

	public static void main(String[] args) {
		
		
		//you are giving a string
		//reverse the string based on words 
		//and reverse each word separately 
		//jamil is a tester
		//limaj si a retset
		//retset a si limaj
		
		String s = "jamil is a tester";
		
		System.out.println(revWords(s));
		//stringbuffer
		System.out.println(s);
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse ()); 
		
		System.out.println(revEachWord(s));
	
	}
	public static String revEachWord (String str) {
		String [] words = str.split(" ");
		String tempRev= "";
		
		String revWord= "";
		 for (int i = 0; i < words.length ; i++ ) {
			 revWord ="";
			 for (int j =words[i].length() -1; j>=0; j--) {
				 revWord += words[i].charAt(j);
			 }
			 
			 tempRev += revWord+ " ";
			
			 
}
	return tempRev;
	}
	public static String revWords(String str) {
	      String [] words =str.split(" "); // splitting my string to words
	     String rev = ""; // creating this temp string
	     for (int i =words.length -1; i>=0 ; i-- ) { // i go through all of my words in reverse order
	    	 rev+= words [i] + " "; // i add each word and a space to the temp string
	    	 
	     }
	     
	     
	    return rev; // i return the temp string
	      
	      }
		
	}
	

