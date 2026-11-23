public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int dif(int a, int b){
        return a-b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int times(int a, int b){
        return a * b;
    }
    public int solver(){
        int a = 20;
        int b = 10;
        int sum = add(a,b);
        return div(sum,2);
    }
}
