import java.util.Scanner;

class FactorialTest2selfmade {
    static long factoriol(int n){
        if(n<=0 || n>20) return -1;
        if(n<=1) return 1;
         return n * factoriol(n-1);
    }

    public static void main(String[] args) {
        System.out.println("원하시는 값을 입력하세요 (0부터20사이의 값)");
        Scanner n = new Scanner(System.in);
        int number = n.nextInt();
        long result = 0;

        for(int i=1; i<=number; i++){
            result = factoriol(i);

            if(result == -1){
                System.out.printf("유효하지 않은 값입니다.(0<n<=20):%d%n", number);
            }

            System.out.printf("%2d!=%20d%n", i, result);
        }
    }
}
