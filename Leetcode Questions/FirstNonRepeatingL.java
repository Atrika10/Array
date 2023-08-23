public class FirstNonRepeatingL {


    // Time complexity = O(n) , n = size of given string
    // space complexity = O(1). [ space complexity of this array is O(26), which can be simplified to O(1) since the size is a constant.]

    public static int firstLetter(String str){
        //Step -1  Array of 26 size to store the count of each letters
        int arr[] = new int[26];   

        //Step - 2 running loop to store the count of each letter present in string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';
            arr[idx] += 1;  //
        }
        // step -3 running a loop to check the first non repeating letter
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (arr[ch -'a'] == 1) {
                return i;
            }
        }
        // "no non repeating letter is available ;
        return -1;
    }
    public static void main(String[] args) {
        String str = "aabccxb";
        System.out.println(firstLetter(str));
    }
}
