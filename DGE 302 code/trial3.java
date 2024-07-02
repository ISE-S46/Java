public class trial3 {
    public static void main(String[] args) {
        double d = -234520156;
        int a = (int) d;
        Object classIntVar = a;
        Object classdoubleVar = d;
        String sd = String.valueOf(d);
        String si = String.valueOf(a);

        System.out.print(classIntVar.getClass()+"\t"); //return object type
        System.out.println(a);
        System.out.print(classdoubleVar.getClass()+"\t");
        System.out.println(d);
        System.out.print(sd.getClass()+"\t"); //return object type
        System.out.println(sd);
        System.out.print(si.getClass()+"\t");
        System.out.println(si);
    }
}
