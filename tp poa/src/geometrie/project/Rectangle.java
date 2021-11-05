package geometrie.project;

public class Rectangle extends form {

    protected float longeur=10,largeur=15;
    void rectangle(float longeur,float largeur){
        this.longeur=longeur;
        this.largeur=largeur;
    }
    public void rectangle( point p ){

        setP(p);
    }
    public void rectangle( String couleur){
        setCouleur(couleur);

    }
    public void rectangle(float largeur, float longeur, point p, String couleur){
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
}
