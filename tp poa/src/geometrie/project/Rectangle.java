package geometrie.project;

public class Rectangle extends form {

    protected float longeur=10,largeur=15;
    public Rectangle(){}
    public Rectangle(float longeur,float largeur){
        this.longeur=longeur;
        this.largeur=largeur;
    }
    public Rectangle( point p ){

        setP(p);
    }
    public  Rectangle( String couleur){
        setCouleur(couleur);

    }
    public Rectangle(float largeur, float longeur, point p, String couleur){
        this.longeur=longeur;
        this.largeur=largeur;
        setP(p);
        setCouleur(couleur);
    }
    void deplacer(int x , int y){
        point a = getP();
        a.abs +=x;
        a.ord +=y;
        setP(a);
    }
    protected float surface() {
        return (longeur*largeur);
    }
    @Override
    public boolean equals(Object obj){
        Rectangle a=(Rectangle)obj;
        if ( this.largeur!=a.largeur || !a.getCouleur().equals(this.getCouleur()) || !this.getP().equals(a.getP()) ) {
            return false;
        }
        else
            return true;

    }
    @Override
    public void afficher() {
        System.out.println("je suis un Rectangle. Mes coordonnees sont: "+getP().abs+","+getP().ord);
    }
    void afficher(form f) {
        System.out.println("je suis un rectangle de couleure "+couleur+" Mes coordonnees sont("+getP().abs+","+getP().ord+") - Ma Longeur = "+longeur+" - MA largeur = "+largeur+" MA surface = "+surface());
    }
    @Override
    public String toString() {
        return ("Mes coordonnes sont ("+getP().abs+","+getP().ord+")"+" Couleur est: "+couleur+" Longueur est: "+longeur+" largeur est: "+largeur);
    }

}
