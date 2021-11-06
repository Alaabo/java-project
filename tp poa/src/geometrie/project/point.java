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
    @Override
    public boolean equals(Object obj) {
        point a=(point) obj;
        return this.abs == a.abs && this.ord == a.ord;
    }

}
