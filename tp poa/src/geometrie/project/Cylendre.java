    package geometrie.project;
    final class Cylendre extends Cercle {
        float hauteur=12;
        //super(rayon);

        public void Cylendre(float rayon,float hauteur,point p,String couleur){
            //super(rayon);
            this.rayon=rayon;
            this.hauteur=hauteur;
            setP(p);
            setCouleur(couleur);
        }
        public Cylendre(float rayon,float hauteur) {
            super(rayon);
            //how we can use super() exactly ??
            //this.rayon=rayon;
            this.hauteur=hauteur;
        }
        public void Cylendre(point p){
            //super(p);
            //why we cant use super(p) here since we use it to access parent methods ;
             setP(p);
        }
        public void Cylendre(String couleur){
           //super(couleur);
             setCouleur(couleur);
        }
        float volume(){
            return (float) (2*Math.PI*rayon*hauteur);
        }
        public static void main(String[] args){
            point x= new point(1,2);
            System.out.println(x);
            /*
            1-first thing first we have a problem with object in the next section because
            we changed the methode and there is no default constructor anymore so the program will not run
            2-second thing i tried to put the next section on commented section and run the program i found this
            java.awt.Point[x=1,y=2] what is this java.awt.point mean ??
            3-after trying to run the program as it is i had an error saying that constructors have no argument
            so we need to pass the right parameter to the constructors in order to run the program without any
            issue
            3-while creating the object x i had an error saying that i have to megrate x type to point while
            i am literally creating the object X type point ??
            after choosing the megrate option he change the declaration of the object from
            point x= new point(1,2);
            to
            Point x= new Point(1,2);
            that's kinda suspicious to be honest since i have class point not class Point
            sorry its my bad that happened because i already have the x created on the class form accidentally after
            removing x from class form the error message gone
            after fixing the program and commenting the next section i run the code and i had this as result
            geometrie.project.point@eed1f14
            and i guess its the memory address for the object X
            after research i found out that i am trying to print a referance of an object epecting to print the value
            of abs and ord
            basically i found out that every class extend class called object and when you try to access an object he call
            a method called toString() that return you the package name and class name and the hash code of the object
            so in order to access directly to ord and abs we can overide the toString method to return what we want
            */
    /*


            Cylendre y=new Cylendre();
            System.out.println(y.getCouleur()+y.hauteur+y.rayon);

            //this is part 5 of the exercice
            Rectangle r=new Rectangle();
            Cercle c=new Cercle();
            Cylendre cy=new Cylendre();
            r.afficher();c.afficher();cy.afficher();
            System.out.println("la surface fe la rectangle est "+r.surface());
            System.out.println("la surface fe la cercle est "+c.surface());
            System.out.println("la surface fe la cylender est "+cy.surface());
        */
             Cylendre C1=new Cylendre(14f,8f, new point(4,12),"bleue");

            Cylendre C2=new Cylendre(14f,8f, new point(4,12),"bleue");
           // Cylendre C1=new Cylendre(new point(4,12),8,14,"bleue");
            //Cylendre C2=new Cylendre(14,8, new point(4,12),"bleue");
            /*
            after creating those two objects i had an error saying :
            'Cylendre(float, float)' in 'geometrie.project.Cylendre' cannot be applied to '(int, int, geometrie.project.point, java.lang.String)'
            'Cylendre(float, float)' in 'geometrie.project.Cylendre' cannot be applied to '(int, int, geometrie.project.point, java.lang.String)'
            why that ??
            after research i figure out that in order to pass the parameter to the parent class i have to use super in every methode
            so when i add super() it show this error message:Call to 'super()' must be first statement in constructor body
            also why he accept parameters as int,int,point,String while i am passing float,float,point,String...

             */
        }

    }
