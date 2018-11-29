import java.util.Scanner;

public class HelloWorld {
  // psvm + tab: viet nhanh ham m
  public static void main(String[] args) {
    // sout + tab: viet nhanh ham System.out.println
    System.out.println("Xin chào thế giới nhé! Hehe");
    /*
     * Scanner la kieu du lieu cu object scanner
     * System.in la lenh lay du lieu nhap tu ban phim
    */
    System.out.println("Nhập số nguyên:");
    Scanner input1 = new Scanner(System.in);
    int a = input1.nextInt();
    System.out.println("Bạn vừa nhập: " + a);

    System.out.println("Nhập số double:");
    double b = new Scanner(System.in).nextDouble();
    System.out.println("Bạn vừa nhập: " + b);

    System.out.println("Nhập số float:");
    float c = new Scanner(System.in).nextFloat();
    System.out.println("Bạn vừa nhập: " + c);

    System.out.println("Mời nhập tên:");
    String str = new Scanner(System.in).nextLine();
    System.out.println("Bạn vừa nhập: " + str);
  }
}