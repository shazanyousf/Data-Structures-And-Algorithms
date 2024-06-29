public class Findsubset {
    public static void main(String[] args) {
        String str = "abc";
        findSubSet(str, "", 0);
    }
    public static void findSubSet(String str, String ans, int i){
        if(i == str.length()){
            if(ans.length() == 0){  // Base Case
                System.out.println("Null");
            }
            else{
                System.out.println(ans); 
                
            }
            return ;
        }
        findSubSet(str, ans+str.charAt(i), i+1); //Yes Choice
        findSubSet(str, ans, i+1);   //No Choice
    }
}
