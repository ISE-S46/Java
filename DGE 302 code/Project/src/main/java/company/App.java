package Project.src.main.java.company;

import Project.src.main.java.company.functions.method;

public class App 
{
    public static void main( String[] args ){
        int i = 0;
        int delay = 2;
        method a = new method();
        while(i >= 0){
            i++;
            System.out.println("Execution Sequence " + i);
            System.out.println("Delay Sequence for " + delay + " Seconds");

            if(i%3==0){
                a.step1();;
            }else if (i%2==0) {
                a.step2();
            }else{
                //pass
            }
            try{
                Thread.sleep(delay * 1000);
            }catch(Exception e){
                Thread.currentThread().interrupt();
            }
        }
    }
}
