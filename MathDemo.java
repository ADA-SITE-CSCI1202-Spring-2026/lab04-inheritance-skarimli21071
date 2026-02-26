public class MathDemo {
    public static int min(int a, int b){
        if(a<b){
            return a;
        }
        return b;
    }

    public static int max(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }

    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }
    
    public static void main(String[] args){
        System.out.println(MathDemo.sum(5, 3));
    }

}
