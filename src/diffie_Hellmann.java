import java.util.Scanner;

public class diffie_Hellmann {
    private static long power(long a, long b, long p){
        if (b == 1)
            return a;
        else
            return (((long)Math.pow(a, b)) % p);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long P, G, x, a, y, b, ka, kb;
        System.out.println("The value of P:");
        P = sc.nextInt();
        System.out.println("The value of G:");
        G = sc.nextInt();
        System.out.println("The private key a for Alice:");
        a = sc.nextInt();
        x = power(G, a, P);
        System.out.println("The private key b for Bob:");
        b = sc.nextInt();
        y = power(G, b, P);
        ka = power(y, a, P);
        kb = power(x, b, P);
        System.out.println("Secret key for the Alice is:" + ka);
        System.out.println("Secret key for the Bob is:" + kb);
        if (ka == kb){
            System.out.println("Key exchange successfull");
        }
        else {
            System.out.println("Key Exchange unsuccessfull");
        }
    }
}
