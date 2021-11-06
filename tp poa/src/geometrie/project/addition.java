package geometrie.project;

public class addition extends Operation {
    int res;

    @Override
    void afficher()

    {
        int a=getV();
        res=x+a;
        System.out.println(" the addition result is "+ res);
    }
    public   addition (int x, int y){
        super(x,y);
        setV(y);
    }
}
