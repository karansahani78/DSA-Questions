public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "hi how are you ";
        System.out.println(removeD(str));
    }
    public static String removeD(String str){
        boolean [] seen = new boolean[256];
        StringBuilder unique =  new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!seen[ch] && Character.isLetter(ch)){
                seen[ch]=true;
                unique.append(ch);
            }
        }
        return unique.toString();
    }
}