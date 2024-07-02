public class trial2 {
    public static void main(String[] args) {
        double d = -234520156;
        int a = (int) d;
        Object classIntVar = a;
        Object classdoubleVar = d;

        System.out.print(classIntVar.getClass()+"\t"); //return object type
        System.out.println(a);
        System.out.print(classdoubleVar.getClass()+"\t");
        System.out.println(d);
    }
}
