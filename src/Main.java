import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        int j = 1;
        int tax = 0;
        int a;
        System.out.println("Tax Calculate App\n ------WELCOME-----");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter total person Count:");
        int count = scanner.nextInt();

        String name[] = new String[count];
        int income[] = new int[count];
        for (i = 0; i < count; i++) {
            System.out.println(" Enter name" + j);
            name[i] = scanner.nextLine();
            System.out.println(" Enter" + name[i] + "Annual Income:");
            income[i] = scanner.nextInt();
            j++;
        }
        System.out.println("Names with lible taxes\n ------------------");
        a=calculateTax(new int[]{income[i]},i);
        for (i = 0; i < count; i++) {
            System.out.println(a);
        }

    }
   public static int calculateTax(int[] income, int i) {

       int tax;
       if (income[i]>=300000){
      tax =(income[i]*20*1)/100;
     }
     else if (income[i]>=100000){
         tax =(income[i]*10*1)/100;
     }
     else if(income[i]<100000){
         tax =0;
     }
       return 0;


   }

}