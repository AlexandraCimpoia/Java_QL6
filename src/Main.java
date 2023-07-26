import com.qa.BadCalc;

public class Main {
    public static void main(String[] args) {
        BadCalc bc = new BadCalc();
        System.out.println("Mult result: " + bc.mult(2, 3));
        System.out.println("Div result: " + bc.div(6, 0));


    }
}