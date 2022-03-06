package Q3;

public class CalcT implements Runnable{
    double firstOperable;
    double secondOperable;
    char operator;

    public CalcT(double firstOperable,char operator, double secondOperable){
        this.firstOperable = firstOperable;
        this.secondOperable = secondOperable;
        this.operator = operator;
    }
    @Override
    public void run() {
        switch (operator) {
            case '+':
                System.out.println(firstOperable+" "+operator+" "+secondOperable+" = "+(firstOperable + secondOperable));
                break;
            case '-':
                System.out.println(firstOperable+" "+operator+" "+secondOperable+" = "+(firstOperable - secondOperable));
                break;
            case '*':
                System.out.println(firstOperable+" "+operator+" "+secondOperable+" = "+(firstOperable * secondOperable));
                break;
            case '/':
                if(secondOperable==0){
                    System.out.println("cant divide by zero");
                    break;
                }
                System.out.println(firstOperable+" "+operator+" "+secondOperable+" = "+(firstOperable / secondOperable));
                break;
        }
    }
}
