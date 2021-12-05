class Hello {
    public static void main(String[] args) {
        new Hello().run();
    }

    public void run() {
        System.out.println("Hello World!");

        System.out.println();

        System.out.println(3 + 2);
        System.out.println(3 - 2);
        System.out.println(3 * 2);
        System.out.println(3 / 2);

        // double
        System.out.println(3.0 / 2);

        System.out.println();

        // http://wtf.org/
        System.out.println(((Object)3.0).getClass());
        System.out.println(((Object)3.0f).getClass());
        System.out.println(Double.class.isInstance(3.0));
        System.out.println(Float.class.isInstance(3.0f));

        System.out.println();

        int a = 3;
        int b = 2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(a + ", " + b);

        System.out.println();

        // Wrong!
        System.out.println(a + " + " + b + " = " + a + b);

        // Fix
        System.out.println(a + " + " + b + " = " + (a + b));

        System.out.println();

        System.out.println(a + " + " + b + " = " + add(a, b));

        System.out.println("-".repeat(80));
    }

    // method & parameters(variables)
    private int add(int a, int b) {
        return a + b;
    }
}
