
public class Main {
    public static void main(String[] args) {
        int sum = 1;
        int con = 1;
        System.out.println("Suma con While");
        while(sum <= 10)   {
            System.out.println(con);
            sum = sum + 1;
            con = con + sum;

        }
        sum = 1;
        con = 1;
        System.out.println("\n Suma con for");
        for(int i = 1; i <= 10; i++) {
            System.out.println(con);
            sum = sum + 1;
            con = con + sum;
        }
    }
}