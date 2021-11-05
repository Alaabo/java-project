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

}
