package Stacks.Operations;
public class RPN {
    public boolean isAnOperator(String s){
        return (s.length()==1&& "ASMD".indexOf(s)>=0);


    }
    public RPN(String[] args){


        ArrayStack stack=new ArrayStack(args.length);

        for (int i=0;i<args.length;i++){//
            String input=args[i];
            if (isAnOperator(input)){

                double y=Double.parseDouble((String) stack.pop());
                double x=Double.parseDouble((String) stack.pop());
                double z= evaluate(x,y,input);
                stack.push(" "+z);

            }else
                stack.push(input);
        }
    }


    private static double evaluate(double x, double y, String op){
        double z=0;
        if (op.equals("A"))
            z=x+y;
        else if (op.equals("S"))
            z=x-y;
        else if (op.equals("M"))
            z=x*y;
        else if (op.equals("D"))
            z=x/y;
        System.out.println(x+" "+op+" "+y+"="+z);
        return z;
    }

    public static void main(String[] args) {

        new RPN(args);
        evaluate(1,10,"A");
        evaluate(10,20,"M");
        evaluate(20,10,"D");
        evaluate(20,10,"S");

    }
}
