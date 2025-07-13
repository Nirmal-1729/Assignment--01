seclass Ap{
    public static void main(String args []){

        // Q45
        // int a=-21;
        // int a2=-18;
        // int d= -12-(-18);
        // int n =28;
        // int s ;
        // // s=n/2*(2a+(n-1)d)
        // s=(28/2)*((2*a)+((n-1)*d));
        // System.out.println(s);


        // Q44
        // int a=-21;
        // int a2=-18;
        // int d= -12-(-18);
        // int n =28;
        // int l = (a+(n-1*d));
        // System.out.println(l);


        // //Q1
        // int a=96;
        // int w=8;
        // int l= (a/w);
        // int p= 2*(l+w);
        // System.out.println(l);
        // System.out.println(p);


        // Q3
        // int l1=13;
        // int w1= 7;
        // int l2=520;
        // int w2= 140;
        // int a1= (13*7);
        // int a2= (520*140);
        // int t = (a2/a1);

        // System.out.println(t);

        // Q4
        // int l,w,r,a,u,t;
        // r=6;
        // a=(300*150);
        // u=(a/100);
        // t=u*r;
        // System.out.println(t);

        // Q5 
        // double l,tc,r,a,w,p;
        // l=20.0;
        // tc=1600.0;
        // r=25.0;
        // a=(tc/r);
        // w=(a/l);
        // p=(2*(w+l));
        // System.out.print(p);

        // Q6
        // int a,b,c,p,s,pa,area,
        // a=10;
        // b=9;
        // p=36;
        // c=(p-(a+b));
        // s=p/2;
        // pa=(s*(s-a)*(s-b)*(s-c));
        // area=Math.sqrt(pa);

        // System.out.println(area)

        // Q7
        // int a,b,h;
        // a=500;
        // b=50;
        // h=(2*a)/b;
        // System.out.println(h);

        // Q8
        // double a,h1,h,b;
        //  a=0.8;
        //  h1=20.0;
        //  h=(h1/100);
        //  b=2*a/h;

        // System.out.println(b);

        // Q9
        // double l,z,a;
        // l=20.0;
        // z=1.37;
        // a=(1.37/4)*l*l;

        // System.out.println(a);
        
        // Q10
        // double s,a;
        // s=15.0;
        // a=0.5*s*s;

        // System.out.println(a);


        // Q11
        // int b=8, h=5, a=320;
        // int c=(320*2)*40;
        // int x=Math.sqrt (c);

        // System.out.println();

       // Q12
        // int a=-21;
        // int a2=-18;
        // int d= -12-(-18);
        // int n =28;
        // int s ;
        // s=(28/2)*((2*a)+((n-1)*d));

        // System.out.println(s);

        // //Q13
        // double h,os,b,a;
        // h=13;
        // os=12;
        // b=(h*h)-(os*os);
        // b=Math.sqrt(b);
        // a=(12/2)*5;

        // System.out.println(a);  
        
        // Q14

        // int a,l;
        // a=184;
        // l=16;
        // l=(184*2/16);
        // System.out.println(l);


        // Q15

        int st = 22;
        int sb = 15;
        int rl = 21;
        int as = st * sb;
        int ar = rl * rl;
        int big = ar - as;
        System.out.println("Big Area: " + big);

     
        // Q16

        int l = 7;
        int b = 5;
        int a = l * b;
        System.out.println("area of Room: " + a);

      
        // Q17

        int l = 3;
        int w = 2;
        int r = 2 * (l + w);
        System.out.println("ribbon:" + r);


        // Q18

        int l = 50;
        int b = 30;
        int P = 2 * (l + b);
        int tdm = P * 10;
        int tdkm = tdm / 1000;
        System.out.println("Total Distance in m: " + tdm);
        System.out.println("Total Distance in km: " + tdkm);
   
         
       
        // Q19

        int l = 25;
        int b = 10;
        int h = 8;
        int vol = l * b * h;
        System.out.println("The volume: " + vol);



        // Q20 
        
            
            int S = 7;
            int Cube = (S * S * S); 
            int l = 7;
            int h = 8; 
            int w = 4;
            int Cuboid =(l * h * w);

            System.out.println("Volume of Cube: " + Cube);
            System.out.println("Volume of Cuboid: " + Cuboid);
        
  

        // Q21

        int wl = 15 * 100;
        int wb = 10 * 100;
        int wh = 8 * 100; 
        int bl = 15; 
        int bb = 8;
        int bh = 5;  
      
        int totalbricks = (wl * wb * wh) / (bl * bb * bh);
        System.out.println("number of bricks: "+totalbricks);



        //Q22

        int l = 50;
        int b = 30;
        int d = 2;
        int vol= l*b*d;
        int mtoL = Vol / 1000;
        System.out.println("litter: "+mtoL);
        System.out.println("Volume:" +vol);


        //Q23

        int Cube a=15;
        int Cube b=3;
        int cube C=12;
        int alonga = a/3;
        int alongb = b/3;
        int alongC = C/3;
        int totalbox = alonga * alongb * alongC;
        System.out.print("total box: " + totalbox);



        //Q24
       
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
        


        // Q25
        
        
        double bl = 24;
        double bb = 15;
        double totalArea = bl * bb * 100;
        System.out.println(" total path: " + total Area);



        // Q26 
 

        double pl = 12*100;
        double Pb = 0.4*100;
        double b1 = 24;
        double bb = 15;
        double pa = Pl*Pb;
        double ba = b1*bb;
        double noofbricks = pa/ba;
        System.out.println("bricks required:" + noofbricks); 

 
        // Q 27
         

        int l = 20;
        int w = 15;
        int r = 5;
        int a = l * w;
        int cost = a * r;
        System.out.println("Cost of Room: " + cost);


       // Q 28 


        int l = 5;
        int w = 4;
        int a = l * w;
        int C = 20;
        int totalC = C * a;
        System.out.println("the total c: " + totalC);

    
        // Q 29

        int el = 800;
        int rw = 900;
        int tl = 10;
        int ra = tl * rw;
        int ta = tl * tl;
        int total = ra/ta ;
        System.out.println("Required total: " + total);

     
        // Q 30

        
        int l=200;
        int w = 400;
        int lt = 5;
        int wt = 8;
        int ar = l*w;
        int at = lt * wt;
        int tatalt = ar/at;
        System.out.println("heed of tile:" + tatalt);

        
        // Q 31 

        int a = 150;
        int b= 25;
        int ag = a*a;
        int ap = b*b;
        int at = (ag-ap);
        System.out.println ("Area:" + at);


        // Q 32 
        

        int w= 20; 
        int l=30;
        int P1 = 3;
        int P2 = 4; 
        int a = (w*l);
        int ag =(P1*P2);
        int aP1=(l*P1);
        int aP2=(w*P2);
        int ap = (P1*P2);
        int apath = (aP1 + aP2 -ag);
        int apt = (Ag-apath);
        System.out.println(" Area:" apt);


        // Q33
  
        int a = 200;
        int S = a/4;
        int area = S*S;
        System.out.println("Area:" + area);


        // Q34 

        double tb1 = 128;
        double tb2 = 92;
        double h = 40;
        double w = 4;
        double Q1 = 0.5 * (tb1 + tb2);
        double Q2 = (h * w);
        double Q = (Q1 - Q2);
        System.out.println("Area: " + Q);


        // Q35

        double r = 7.7;
        double h = 12;
        double pi = 3.14;
        double t = (7.7 + 12);
        double a = (2 * (pi) * (7.7) * (19.7));
        System.out.println("Area:" + a);


        // Q 36 
        
        double d=15 ;
        double h=7;
        double r = d*2;
        double a=(2)*(3.14)*(r)*(7+h);
        System.out.println ("areq:" + a);


        // Q37


        short tsa = 149;
        byte h = 6;
        double a = (double) (2 * 3.14);
        double b = (double) (2 * 3.14 * h);
        double c = (double) (tsa);
        double dis = Math.sqrt((b * b) - (4 * a * (-c)));
        double r1 = (-b + dis) / (2 * a);
        double r2 = (-b - dis) / (2 * a);
        double d1 = r1 + r1;
        double d2 = r2 + r2;
        if (d1 > d2) {System.out.println("diameter of Cylinder: " + d1); } 
        else {System.out.println("diameter of Cylinder: " + d2); }



        // Q38

        double d, h, r;
        d = 12;
        h = 9;
        double p = 3.14;
        r = d / 2;
        double a = (2 * p * r) * (h + r);
        System.out.println(r);
        System.out.println(a);



        // Q39 

 
        double h = 9;
        double r = 5;
        double P = 3.14;
        double V = (P * (r * r) * h);
        System.out.println(V);


        // Q40

        double r = d/2;
        double h = 50;
        double d = 30;
        double p = 3.14;
        double V = (p * (r * r) * h);
        System.out.println(V);



        // Q41 

        double r=d/2;
        double d= 2.25;
        double h= 2.25;
        double p = 3.14;
        double V = (p*r*r*h);
        System.out.println(r);
        System.out.println (V);



        // Q42 


       double r = (Math.sqrt(Math.pow(1, 2) - Math.pow(h,2)));
       double a = P * (Math.pow(r, 2));
       double C = Cost * area;
       double h = 4;
       double l = 5;
       System.out.println("r" + " " + "c" + " " + "a")