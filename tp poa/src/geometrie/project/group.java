package geometrie.project;


    class Groupe { int a; Groupe(int a) { this.a=a;} }
    class Test { static void permuter (Groupe x, Groupe y) {Groupe t = x; x=y; y=t; }

        public static void main(String[] args) {
            Groupe g1 = new Groupe(5), g2 = new Groupe(7);
            System.out.println("value before permitation: "+g1.a+" "+g2.a);
            permuter(g1, g2);
            System.out.println("value after permitation: "+g1.a+" "+g2.a); } }

class Exemple {
    static int x=1; int y=0;
    public Exemple () {x= x *2; y=x;}
    public static void main(String[] args) {
        Exemple a =new Exemple ();
        Exemple b=new Exemple ();
        Exemple c= a;
        System.out.println (c.x + "et" + c.y);
    }
}
// this program wwill show : 4et2 because object x declared with a.x=2 and a.y=1 so c.x= a.x*2 and y=a.x
class A {
        int i=0; public A() {i=i+2;}
    }
class B extends A {
    public B() {i=i+5;}
    public B(int x) {i=i+x;}
    public B(int x, int y) {i=i+x*y;}
    public static void main(String[] args) {
        B b1= new B();
        B b2= new B(2);
        B b3= new B(2,3);
        System.out.println(b1.i+"*"+b2.i +"*"+b3.i); } }
//this program will show 7*4*8 i think that's because wew have default constructor of A() changed the value
//of i to 2 then i went i=2+5 then i=2+2 then i=2x2x2