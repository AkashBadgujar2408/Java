import java.util.Scanner;

public class SubstringsComparisonHackerRank {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        String[] arr= new String[s.length()+1-k];
        
        // Complete the function
        for (int i=0; i<arr.length;i++){
            arr[i] = s.substring(i,i+k);
        }
        
        String help;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i].compareTo(arr[j])>0){
                help = arr[i];
                arr[i] = arr[j];
                arr[j] = help;
            }
            }
        }
        
        smallest = arr[0];
        largest = arr[arr.length-1];
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}