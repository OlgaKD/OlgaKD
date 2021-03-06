import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaBasics {

    @Test
    public void javaBasic() {

        int a = 30000;//Total amount Taken
        int b = a/3;//Amount to be payed in first 10 years
        int c = b/100*10; //10% of the first payed Amount
        int d = a - b;//Amount to be payed in second 10 years
        int e = d/100*8;//8% of the first payed Amount
        int f = a - d; //Amount to be payed in last 10 years
        int g= f/100*6; //6% of the first payed Amount

        int h= (int) sumDigits(a, c, e, g);
        System.out.println("% in first 10 years:"+c);
        System.out.println("% in second 10 years:" + e);
        System.out.println("% in last 10 years:" + g);
        System.out.println("Total amount to be payed:" + h);
        Assertions.assertEquals(33200, h, "Sum is not correct!");
    }

    private double sumDigits(int a, int c, int e, int g) {
        return a + c + e + g;

    }
}
