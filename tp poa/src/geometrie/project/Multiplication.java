package geometrie.project;

public class Multiplication extends Operation {
    int res;
    @Override
    void afficher() {int b=getV();
        res=x*b;
        System.out.println("the multiplication result is "+res);
    }
    public Multiplication(int x,int y) {super(x,y);
        setV(y);
    }

}

