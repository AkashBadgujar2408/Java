
public class WordsRepeatCounterApp {
	public static void main(String[] args) {
		String string = "Big black bug bit a big black dog on his big black nose";
		int count = 0;
		
		String words[] = string.toLowerCase().split(" ");
		
		for (int i=0;i<words.length;i++){
			count = 1;
			for (int j=i-1; j>0;j--) {
				if (words[i] == words[j]) {
					break;
				}
			}
			for (int k=i+1; k<words.length;k++) {
				if (words[i].equals(words[k])) {
					count++;
				}
			}
			System.out.println(words[i]+" - "+count);
		}
	}
}
