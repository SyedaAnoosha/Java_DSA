package Stacks.Operations;
// postfix to infix
public class RPNPractice {
    public boolean isAnOperator(String s ){
        return(s.length()==1 && "ASMD".contains(s));
    }
    public RPNPractice(String[] args){
        ArrayStack stack = new ArrayStack(args.length);

        for (String input : args) {
            if (isAnOperator(input)) {
                double y = Double.parseDouble((String) stack.pop());
                double x = Double.parseDouble((String) stack.pop());
                double z = evaluate(x, y, input);
                stack.push(" " + z);
            } else {
                stack.push(input);
            }
        }
    }
    public static double evaluate(double x, double y, String op){
        double z = switch (op) {
            case "A" -> x + y;
            case "S" -> x - y;
            case "M" -> x * y;
            case "D" -> x / y;
            default -> 0;
        };
        System.out.println(x+" "+op+" "+y+" = "+z);
        return z;
    }

    public static void main(String[] args) {
        evaluate(8,9,"A");
    }
}
