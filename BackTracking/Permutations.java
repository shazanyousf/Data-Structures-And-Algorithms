public class Permutations {
    public static void main(String[] args) {
        String str = "abc";
        permutaitons(str, "");
    }
    public static void permutaitons(String str, String ans){
        //Base Case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //Recursion
        for(int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);
            String Newstr = str.substring(0,i) + str.substring(i+1);
            permutaitons(Newstr, ans+curr);
        }
    }
}
