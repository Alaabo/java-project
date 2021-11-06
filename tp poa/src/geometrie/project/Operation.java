package geometrie.project;

public class Operation {
    protected  int x;
    private  int y; //atribut not visible for Multiplication and addition
    void afficher() {
        System.out.println(" value of x is "+ x +"and value of y is"+ y);}

    int getV() { return (y);}
    void setV(int y) {this.y=y;}
    public Operation(int x,int y) {this.x=x;
        setV(y);
    }
    public static void main(String[] args) {
        Operation a1 =new addition(1,2);
        Operation a2=new addition(2,2);
        Operation m1=new Multiplication(2,3);
        Operation m2=new Multiplication(4,2);



        Operation[] tab;  tab= new Operation[4];

        tab[0] =a1;
        tab[1] =a2;
        tab[2] =m1;
        tab[3] =m2;
        for (Operation operation : tab) operation.afficher();


    }
}

