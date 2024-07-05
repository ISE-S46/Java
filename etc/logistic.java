public class logistic {
static double b1 = 0.0;
static double b2 = 0.0;
static double b0 = 0.0;
    public static void main(String[] args){
        System.out.println(b0 +" , "+b1 +" , "+ b2);
 
        int epoc =10;
 
    double input[][] = {{2.7810836,2.550537003},
            {1.465489372,2.362125076},
            {3.396561688,4.400293529},
            {1.38807019,1.850220317},
            {3.06407232,3.005305973},
            {7.627531214,2.759262235},
            {5.332441248,2.088626775},
            {6.922596716,1.77106367},
            {8.675418651,-0.2420686549},
            {7.673756466,3.508563011}};
    int target[] ={0,0,0,0,0,1,1,1,1,1};
    //System.out.println(input[1][0]+"    "+target[0]);
 
    double x = 1.0;
    double[] output = new double[10];
    double pred = 0;
    for(int i = 0;i<input.length;i++){
    for(int j=0;j<input[i].length-1;j++){
        System.out.println(input[i][j] +"   "+input[i][j+1]+"   "+target[i]);
 
    for(int m =0;m<=epoc;m++){
 
    System.out.println("--------------epoc-------------  "+m);
    System.out.println(b0 +" , "+b1 +" , "+ b2+"     b0,b1,b2");
 
    pred = prediction(b0,b1,b2,input[i][j],input[i][j+1]);
    System.out.println(input[i][j]+"   "+input[i][j+1]+"   inputs");
    System.out.println(pred+"  ----------Prediction"); 
    updatingCoefficients(pred,x,input[i][j],input[i][j+1],target[i]);
    System.out.println(b0 +" , "+b1 +" , "+ b2 +"\n");
 
    }
    System.out.println("Final Prediction     "+pred );
    output[i]=pred;
 
    System.out.println("\n\n------------------------------------------------------------------");
    }
 
    }
 
    for(int i =0;i<epoc;i++){
        //System.out.println(output[i]);
        if(output[i]<0.5){
        System.out.println("0");
        }else{
        System.out.println("1");
        }
 
 
    }
 
 
 
 }
 
 private static void updatingCoefficients(double pred, double x, double x1,
 double x2, int y) {
 // TODO Auto-generated method stub
 b0 = b0 + (0.3 * (y - pred) * pred * (1-pred) * x);
 b1 = b1 + (0.3 * (y - pred) * pred * (1-pred) * x1);
 b2 = b2 + (0.3 * (y - pred) * pred * (1-pred) * x2);
 
 
 
 }
 
 private static double prediction(double b0, double b1, double b2,
 double x1, double x2) {
 double pred = 1 / (1 + Math.exp(-(b0+(b1*x1)+(b2*x2))));
 
 return pred;
 }
}
 