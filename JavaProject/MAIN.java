import dependencies.functions;

public class MAIN {
    public static void main(String[] args) {
        functions f = new functions();
        for(int i = 0; i < 10; i++){
            System.out.println("Loop at iteration : "+ i);
            if(i%2==0){
                f.method1();
            } else if(i%3==0){
                int x = f.method2();
            }else{
                //pass
            }
        }
    }
}
