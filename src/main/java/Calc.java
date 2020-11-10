public class Calc{

    public static void main(String []args){
        System.out.println(doCalc(3 , 8 , "sum"));
    }

    public static String doCalc(double a, double b, String operationType){
        String result;
        switch(operationType) {
            case "sum" :
                result = (a+"+"+b+"="+(a+b));
                break;
            case "sub" :
                result = (a+"-"+b+"="+(a-b));
                break;
            case "div" :
                result = (a+"/"+b+"="+(a/b));
                break;
            case "mult" :
                result = (a+"*"+b+"="+(a*b));
                break;
            default :
                result = "Error, no function";
                break;
        }
        return result;
    }
}


