class Ap{
    public static void main(String args []){


        double tb1 = 128;
        double tb2 = 92;
        double h = 40;
        double w = 4;
        double Q1 = 0.5 * (tb1 + tb2);
        double Q2 = (h * w);
        double Q = (Q1 - Q2);
        System.out.println("Area: " + Q);
    }
}