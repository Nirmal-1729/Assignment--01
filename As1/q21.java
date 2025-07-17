class Ap{
    public static void main(String args []){

        int wl = 15 * 100;
        int wb = 10 * 100;
        int wh = 8 * 100; 
        int bl = 15; 
        int bb = 8;
        int bh = 5;  
      
        int totalbricks = (wl * wb * wh) / (bl * bb * bh);
        System.out.println("number of bricks: "+totalbricks);
    }
}