// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
 class GoodPairs {
    public int Solution(int[] arr , int b){
        int arrLength = arr.length;
        int i=0;
        int j=arrLength-1;
        int count =0;
        while(i<j){
            if (arr[i]+arr[j] == b){
                count = count+1;
            }
            if(j==i+1)
            {
                i++;
                j=arrLength;
            }
            j--;
        }
        return count;
    }
}
public class goodPair {
    public static void main(String[] args) {

            GoodPairs answer = new GoodPairs();
            System.out.println(answer.Solution(new int[]{1, 2, 4},4));
        }
    }
