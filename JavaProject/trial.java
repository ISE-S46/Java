public class trial{
    public static void main(String[] args) {
        int time = 0;
        while(time < 10){
            if(time==6){
                System.out.println("Exit the loop at "+ (time+1) + " times");
                break;
            }
            System.out.println("Exit the loop at "+ (time+1) + "times");
            time++;
        }
    }
}