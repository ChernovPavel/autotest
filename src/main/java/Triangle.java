public class Triangle {

    public Triangle (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int a;
    int b;
    int c;

    public boolean isTriangle (){
        return (a+b)>c && (b+c)>a && (c+a)>b;
    }
}
