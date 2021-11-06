package geometrie.project;
import static java.lang.Math.*;

abstract class form {
    public String couleur = "blanc";
    private point p =new point(20,20);

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public final  void changecouleur(String c){
        couleur=c;
    }
    abstract  protected float surface();
     public void afficher() {
         /*
         after overriding the toString method we can directly use the object itself without
         accessing to the variable one by one
          */
         System.out.println(p);}
    abstract void afficher(form f);

    public point getP() {
        return p;
    }

    public void setP(point p) {
        this.p = p;
    }
}
