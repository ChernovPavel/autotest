public class Triangle {

    public boolean isTriangle (int a, int b, int c){
        return (a+b)>c && (b+c)>a && (c+a)>b;
    }
}
