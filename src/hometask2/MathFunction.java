package hometask2;

public class MathFunction {
    public static void main(String[] args) {
        System.out.println(calculate10());
        System.out.println(calculate11());
        System.out.println(calculate12());
        System.out.println(calculate16());
        System.out.println(calculate17());
    }

    // формула номер 10
    public static  double calculate10(){
        int x=10;
        double y= (1.0/3.0)*Math.sqrt(Math.abs(Math.sin(x)))*Math.cbrt(Math.exp(0.12*x));
        return y;
    }
    // формула номер 11
    public static  double calculate11(){
        int x1=10;
        double y1= 2*Math.PI*x1-((Math.sin(Math.sqrt(10.5*x1)))*(1/(Math.cbrt(Math.pow(x1,2)))+(1.0/7.0)));
        return y1;
    }
    // формула номер 12
    public static  double calculate12(){
        int x2=10;
        double y2= (Math.log(Math.sqrt(Math.abs(2-x2))+1.2))*((1/(2+Math.exp(-x2))))+Math.cbrt(2/x2);
        return y2;
    }

    // формула номер 16
    public static  double calculate16(){
        int x4=10;
        double y4=Math.cbrt((Math.exp(2*x4*Math.sqrt(x4)))-((x4+1/3)/(x4)))*(Math.abs(Math.cos(2.5*x4)));
        return y4;
    }

    // формула номер 17
    public static  double calculate17(){
        int x5=10;
        double y5=((Math.pow(x5,3))/3)-Math.exp(x5)*Math.log(Math.abs((Math.pow(1.3,3))+(Math.pow(x5,3))))+4.0/3.0;
        return y5;
    }
}

