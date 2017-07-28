package tutorial

class BasicMathOperations {
    static void main(String[] args) {
        printSimpleMath()

        def age = 'Dog'
        age = 43 + 'aaa' -1
        println age

        floatingPoingOperations();
        incrementDecrement(40);
        largestValues();

        decimalAccuracy();

        mathFunctions();
    }

    private static mathFunctions() {
        def randNum = 2.0;
        println("Math.abs(-2.45) = " + (Math.abs(-2.45)));
        println("Math.round(2.45) = " + (Math.round(2.45)));
        println("randNum.pow(3) = " + (randNum.pow(3)));
        println("3.0.equals(2.0) = " + (3.0.equals(2.0)));
        println("randNum.equals(Float.NaN) = " + (randNum.equals(Float.NaN)));
        println("Math.sqrt(9) = " + (Math.sqrt(9)));
        println("Math.cbrt(27) = " + (Math.cbrt(27)));
        println("Math.ceil(2.45) = " + (Math.ceil(2.45)));
        println("Math.floor(2.45) = " + (Math.floor(2.45)));
        println("Math.min(2,3) = " + (Math.min(2,3)));
        println("Math.max(2,3) = " + (Math.max(2,3)))
    }

    private static decimalAccuracy() {
        println("1.1000000000000001 + 1.1000000000000001 "
                + (1.1000000000000001111111111111111111111111111111111111 + 1.1000000000000001111111111111111111111111111111111111))
    }

    private static largestValues() {
        println("Biggest Int " + Integer.MAX_VALUE);
        println("Smallest Int " + Integer.MIN_VALUE);

        println("Biggest Float " + Float.MAX_VALUE);
        println("Smallest Float " + Float.MIN_VALUE);

        println("Biggest Double " + Double.MAX_VALUE);
        println("Smallest Double " + Double.MIN_VALUE)
    }

    private static incrementDecrement(int age) {
        println("age++ = " + (age++));
        println("++age = " + (++age));
        println("age-- = " + (age--));
        println("--age = " + (--age))
    }

    private static floatingPoingOperations() {
        println("5.2 + 4.4 = " + (5.2.plus(4.4)));
        println("5.2 - 4.4 = " + (5.2.minus(4.4)));
        println("5.2 * 4.4 = " + (5.2.multiply(4.4)));
        println("5.2 / 4.4 = " + (5.2 / 4.4))
    }

    private static printSimpleMath() {
        println("Hello world!")
        println("5+6 = " + (5+6))
        println("5-6 = " + (5-6))
        println("5*6 = " + (5*6))
        println("5%6 = " + (5%6))
        println("5/6 = " + (5.intdiv(6)))
    }
}
