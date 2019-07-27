package problem6;

public class power {
	public static void main(String[] args) {
        double base = 3.14, exponent1 = 3.14, exponent2 = 0.11;
        long result1 = 1, finalResult = 1;
        while (exponent2 != 0)
        {
        	result1 *= exponent1;
            --exponent2;
        }
        while (result1 != 0)
        {
        	finalResult *= base;
            --result1;
        }
        System.out.println("Answer = " + finalResult);
    }
}
