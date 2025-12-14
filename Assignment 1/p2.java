class MinMax {

    void byteMinMax() {
        System.out.println("Minimum value of byte: " + Byte.MIN_VALUE);
        System.out.println("Maximum value of byte: " + Byte.MAX_VALUE);
    }

    void shortMinMax() {
        System.out.println("Minimum value of short: " + Short.MIN_VALUE);
        System.out.println("Maximum value of short: " + Short.MAX_VALUE);
    }

    void intMinMax() {
        System.out.println("Minimum value of int: " + Integer.MIN_VALUE);
        System.out.println("Maximum value of int: " + Integer.MAX_VALUE);
    }

    void longMinMax() {
        System.out.println("Minimum value of long: " + Long.MIN_VALUE);
        System.out.println("Maximum value of long: " + Long.MAX_VALUE);
    }

    public static void main(String[] args) {
        MinMax obj = new MinMax();

        obj.byteMinMax();
        obj.shortMinMax();
        obj.intMinMax();
        obj.longMinMax();
    }
}
