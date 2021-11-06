package geometrie.project;
import java.lang.Math;

public class Cercle extends form{


    protected float rayon=15;
    protected float surface(){
        return (float)  (Math.PI*rayon*rayon);
    }
    //------------------------------------------

    public Cercle() {}
    public Cercle (float rayon)
    {
        this.rayon=rayon;
    }
    public Cercle (point p){
     setP(p);
    }
    public Cercle (String couleur){
        setCouleur(couleur);
    }
    public Cercle (float rayon,point p,String couleur){
        this.rayon=rayon;
      setP(p);
      setCouleur(couleur);
    }
    @Override
    public boolean equals(Object obj){
        Cercle a=(Cercle) obj;
        return this.rayon == a.rayon && a.getCouleur().equals(this.getCouleur()) && this.getP().equals(a.getP());

    }
    @Override
    public void afficher() {
        System.out.println("je suis un Cercle. Mes coordonnees sont: "+getP().abs+","+getP().ord);
    }
    @Override
    void afficher(form f) {
        System.out.println("je suis un Cercle de couleure "+couleur+" Mes coordonnees sont("+getP().abs+","+getP().ord+") - Mon rayon = "+rayon+" MA surface = "+surface());
    }
    @Override
    public String toString() {
        return ("Mes coordonnes sont ("+getP().abs+","+getP().ord+")"+" Couleur est: "+couleur+
                " rayon est: "+rayon);
    }

}
