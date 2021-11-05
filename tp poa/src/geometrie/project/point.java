package geometrie.project;

public class point {
    int abs,ord ;
    public point (int abs,int ord)
    {
    this.abs = abs ;
    this.ord = ord ;
    }
    @Override
    public String toString() {
        return ("Mes coordonnes sont ("+abs+","+ord+")");
    }


}
