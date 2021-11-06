    package geometrie.project;

    final class Cylendre extends Cercle {
                float hauteur=12;
                //super(rayon);

                public Cylendre(float rayon,float hauteur,point p,String couleur){
                    //super(rayon);
                    this.rayon=rayon;
                    this.hauteur=hauteur;
                    setP(p);
                    setCouleur(couleur);
                }
                public  Cylendre(float rayon,float hauteur) {
                    super(rayon);
                    //how we can use super() exactly ??
                    //this.rayon=rayon;
                    this.hauteur=hauteur;
                }
                public  Cylendre(point p){
                    //super(p);
                    //why we cant use super(p) here since we use it to access parent methods ;
                     setP(p);
                }
                public  Cylendre(String couleur){
                   //super(couleur);
                     setCouleur(couleur);
                }
                float volume(){
                    return (float) (2*Math.PI*rayon*hauteur);
                }
                @Override
                public boolean equals(Object obj) {
                    Cylendre a = (Cylendre) obj;
                    return (this.hauteur == a.hauteur) && a.getCouleur().equals(this.getCouleur()) && (a.rayon == this.rayon) && this.getP().equals(a.getP());
                        }
                @Override
                public void afficher() {
                    System.out.println("je suis un Cylinder. Mes coordonnees sont: "+getP().abs+","+getP().ord);
                }
        @Override
        void afficher(form f) {
            System.out.println("je suis un Cylindre de couleure "+couleur+"  Mes coordonnees sont("+getP().abs+","+getP().ord+") - Mon rayon = "+super.rayon+" - MA hauteur = "+hauteur+" MA surface = "+surface()+" - Mon volume = "+volume());
        }
        @Override
        public String toString() {
            return ("Mes coordonnes sont ("+getP().abs+","+getP().ord+")"+" Couleur est: "+couleur+" rayon est: "+super.rayon+" hauteur est: "+hauteur);
        }
                        public static void main(String[] args){
                            point x= new point(1,2);
                            System.out.println(x);
                            System.out.println("--------------------------------------------------------------------------------");
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
                            Cylendre C3=new Cylendre(14f,8f, new point(7,25),"bleue");

                            /*
                            after creating those two objects i had an error saying :
                            'Cylendre(float, float)' in 'geometrie.project.Cylendre' cannot be applied to '(int, int, geometrie.project.point, java.lang.String)'
                            'Cylendre(float, float)' in 'geometrie.project.Cylendre' cannot be applied to '(int, int, geometrie.project.point, java.lang.String)'
                            why that ??
                            after research i figure out that in order to pass the parameter to the parent class i have to use super in every methode
                            so when i add super() it show this error message:Call to 'super()' must be first statement in constructor body
                            also why he accept parameters as int,int,point,String while i am passing float,float,point,String...

                             */
                            //---------------------------------------------------------
                            /*
                            to compare two objects we can use the method object.equals(obj) and not the operator ==
                           We can use == operators for reference comparison (address comparison) and .equals() method
                           for content comparison. In simple words, == checks if both objects point to the same memory
                            location whereas .equals() evaluates to the comparison of values in the objects.
                            they are different due to their different memory locations so in order to make this comparisation work correctly
                            we need to override the object.equals(obj) method to work properly
                            */



                            //System.out.println(C1 == C2);
                            System.out.println(C1.equals(C2));
                            //testing equals overridden method
                            System.out.println(C1.equals(C3));
                            System.out.println("--------------------------------------------------------------------------------");

                            Rectangle r1=new Rectangle(14f,20f,new point(17,30),"black");
                            Rectangle r2=new Rectangle(14f,20f,new point(17,30),"black");
                            Rectangle r3=new Rectangle(14f,20f,new point(17,30),"white");

                            System.out.println(r1.equals(r2));
                            System.out.println(r1.equals(r3));
                            System.out.println("--------------------------------------------------------------------------------");

                            Cercle c1=new Cercle(22f,new point(80,90),"grey");
                            Cercle c2=new Cercle(22f,new point(80,90),"grey");
                            Cercle c3=new Cercle(22f,new point(17,90),"grey");

                            System.out.println(c1.equals(c2));
                            System.out.println(c1.equals(c3));
                            System.out.println("--------------------------------------------------------------------------------");
                        // we can do declaration like this to form[] tabForme1 ; tabForme1= new form[5]; but it make me feel like we are in 2004 so it's better to use this istead
                            form[] tabForme; tabForme = new form[5];

                            tabForme[0] =new Rectangle(12f,15f,new point(2,3),"rouge");
                            tabForme[1] =new Rectangle(20f,10f,new point(5,10),"verte");
                            tabForme[2] =new Cercle(12f,new point(10,10),"jaune");
                            tabForme[3] =new Cylendre(5f,20f, new point(15,20),"blanche");
                            tabForme[4] =new Cylendre(8f,14f, new point(5,10),"maron");


                        // to print the form we can use the getClass.getName method or use afficher() but we need to override it on every class
                        System.out.println("--------------------------------------------------------------------------------");

                      for(int i= 0; i < tabForme.length; i++)
                             {
                            System.out.println("je suis un "+tabForme[i].getClass().getName()+". Mes coordonnees sont: "+tabForme[i].getP().abs+","+tabForme[i].getP().ord);

                             }
                            System.out.println("--------------------------------------------------------------------------------");
                       for (int a= 0; a < tabForme.length; a++) {
                            tabForme[a].afficher();
                        }
                            System.out.println("--------------------------------------------------------------------------------");
                            for (int k = 0;k < tabForme.length; k++) {
                                tabForme[k].afficher(null);
                            }
                            System.out.println("--------------------------------------------------------------------------------");

                            for (int j = 0; j < tabForme.length; j++) {
                                System.out.println(tabForme[j]);
                            }




    }
    }
