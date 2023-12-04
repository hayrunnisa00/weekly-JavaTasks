package week_04.van_solution;
/*
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> AB
 */
public class RemoveDupplicate {
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println(removeDupplicate(str));
    }
    public static String removeDupplicate(String str){
        String result= "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

             if (result.contains(""+ch)) {
                 continue;
             }else {
                 result += "" + ch;
             }

        }
        return result;
    }
}
