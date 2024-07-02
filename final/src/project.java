import java.util.Scanner;
import java.util.Random;
public class project {
    public static int hi;
    public static int t = 0;
    public static int t2 = 1;
    public static String[] diff(int a){
        String[] n = new String[10];
        switch(a){
            case(1):
                String[] n1 = {"war","cat","dog","tank","rich","bomb","fire","wind","eye","hair"};
                n = n1;
                hi = 1;
                break;
            case(2):
                String[] n2 = {"string","earth","among","atomic","plane","house","number","measure","store","stick"};
                n = n2;
                hi = 1;
                break;
            case(3):
                String[] n3 = {"environment","opportunity","experiment","axolotl","asteroid","earthquake","presentation"};
                n = n3;
                hi = 2;
                break;
        }
        return n;
    }
    public static char[] answer(int a,String[] b){
        String k = b[a];
        char[] answer = k.toCharArray();
        return answer;
    }
    public static char[] display(char[] z){ 
        int q = z.length;
        char[] display = new char[q];
        for(int i=0;i<q;i++){
            display[i] = '_';
            System.out.print(display[i]+" ");
        }
        System.out.println();
        System.out.println("press 0)for hint 1)to answer the word");
        return display;   
    }
    public static char[] check(char y,char[] a,char[] b){
        int w = 0;
        for(int i =0;i<a.length;i++){
            if(b[i]==y){
                a[i] = y;
                w = 1;
            }
            System.out.print(a[i]+" ");
        }  
        System.out.println();
        if(w==0){
           tries(); 
        }
        System.out.println();
        return a;
    }
    public static void tries(){
        t++;
        int t1 = 5-t;
        if(t1>0){
            System.out.println(t1+" lives left");
        }else{
            t2 = 0;
        }
    }
    public static char[] hint(char[] a,char[] b){
        Random ran = new Random();
        int n = b.length;
        int n1 = 0;
        if(hi>0){
        for(int i=0;i<n;i++){
            if(b[i]=='_'){
                n1++;
            }
        }
        int[] c = new int[n1];
        int n2 = 0;
        for(int i=0; i<n;i++){
            if(b[i]=='_'){
              c[n2] = i;
              n2++;
            }
        }
        n2--;
        int x = ran.nextInt(n2);
        int y = c[n2];
        b[y] = a[y];
        for(int i=0;i<n;i++){
            if(b[y] == a[i]){
               b[i] = a[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
        hi--;
        System.out.println("You have "+hi+" hint left");
        }else{
            System.out.println("Out of hint");
        }
        return b;
    }
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Choose the difficulty");
        System.out.println("1)Easy 2)Normal 3)Hard");
        int di = in.nextInt();
        while(di<1||di>3){
            System.out.println("Choose 1-3");
            di = in.nextInt();
        }
        String[] words =diff(di);
        
        int x = words.length;
        int a = ran.nextInt(x);
        char[] answers = answer(a,words);
        char[] displays = display(answers);
        System.out.println("Enter a letter");
        String a2 = String.valueOf(answers);
        int o = 0;
        do{
            char y = in.next().charAt(0);
            if(y=='0'){
                displays = hint(answers,displays);
            }
            if(y=='1'){
                System.out.println("Input the answer :");
                String an = in.next();
                if(an.equals(a2)){
                    o++;                 
                }else{
                    t2--;
                }
            }
            if(Character.isAlphabetic(y)){
                displays = check(y,displays,answers);
            }
            String a1 = String.valueOf(displays);           
            if(a2.equals(a1)){
                o++;
            }
        }while(o==0&&t2==1);
        if(t2>0){
            System.out.println("Congratulation");
        }else{
            System.out.println("You fail");
            System.out.println("The word is "+a2);
        }                
    }
}