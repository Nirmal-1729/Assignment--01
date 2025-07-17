
  class Ap{
    public static void main(String args []){

       
        double w1 = 20 * 100;
        double wh = 2 * 100;
        double wt = 0.75 * 100;
        double bl = 25;
        double bh = 10;
        double bt = 2.5;
        double wval = w1 * wh * wt;
        double bWal = bl * bh * bt;
        double noofbricks = (wval / bWal);
        double Cost = (noofbricks / 1000) * 900;
        System.out.println("no of bricks:" + noofbricks);
        System.out.println("total cost :" + Cost);
        
    }
}