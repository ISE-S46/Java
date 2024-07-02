public class trial5 {
    public static void main(String[] args) {
        String s = "Where is the word 'apple' within this text";
        String ss = "apple";
        int index = s.indexOf(ss);
        System.out.println(s);
        System.out.print(index + " to ");
        System.out.println(index + ss.length()-1);
    }
}
