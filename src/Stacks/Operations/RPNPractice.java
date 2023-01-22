package Stacks.Operations;
// postfix to infix
public class RPNPractice {
    public boolean isAnOperator(String s){
        return ( s.length()==1 && "ASMD".indexOf(s)>=0 );
    }
    public RPNPractice(String[] args){
        ArrayStack stack = new ArrayStack(args.length);
        for (int i = 0; i < args.length; i++) {
            String input = args[i];
            if(isAnOperator(input)){
                double y = Double.parseDouble( (String) stack.pop());
                double x = Double.parseDouble((String) stack.pop());
                double z = evaluate(x,y,input);
                stack.push(" "+z);
            }
            else {
                stack.push(input);
            }
        }
    }
    public static double evaluate(double x, double y, String op){
        double z;
        if (op.equals("A")) {
            z = x + y;
        } else if (op.equals("M")) {
            z = x * y;
        } else if (op.equals("S")) {
            z = x - y;
        } else if (op.equals("D")) {
            z = x / y;
        } else {
            z = 0;
        }
        System.out.println(x+" "+op+" "+y+" = "+z);
        return z;
    }

    public static void main(String[] args) {
        new RPNPractice(args);
    }
}
