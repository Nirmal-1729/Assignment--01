class Ap{
    public static void main(String args []){
        int a,b,c,p,s,pa,area,
        a=10;
        b=9;
        p=36;
        c=(p-(a+b));
        s=p/2;
        pa=(s*(s-a)*(s-b)*(s-c));
        area=Math.sqrt(pa);

        System.out.println(area);
    }
}
