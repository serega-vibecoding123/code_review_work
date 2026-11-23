public class Calculator {
    public int add(int a, int b){
        return a + b;
    }
    public int dif(int a, int b){
        return a - b;
    }
    public int div(int a, int b){
        return a / b;
    }
    public int times(int a, int b){
       return a * b;
    }
    public int solver(){
        int a = 10;
        int b = 4;
        // (a + b) * (a - b) = a² - b²
        int sum = add(a, b);      // 14
        int diff = dif(a, b);     // 6
        return times(sum, diff);  // 84
    }
}
