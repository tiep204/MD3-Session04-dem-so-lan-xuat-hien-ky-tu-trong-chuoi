import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap 1 ky tu bat ky");
        char kyTu = sc.next().charAt(0);
        String str = "motconvit";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (kyTu == str.charAt(i)){
                count++;
            }
        }
        System.out.printf("ky tu %c xuat hien %d lan trong chuoi %s",kyTu,count,str);
    }
}