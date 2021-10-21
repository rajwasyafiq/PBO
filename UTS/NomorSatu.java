import java.util.Scanner;

public class NomorSatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pembayaran Jasa Telepon");
        System.out.print("Jam (mulai)   : ");
        int j1=sc.nextInt();
        System.out.print("Menit (mulai)  : ");
        int m1=sc.nextInt();
        System.out.print("detik (mulai)  : ");
        int s1=sc.nextInt();
        System.out.print("Jam (selesai)   : ");
        int j2=sc.nextInt();
        System.out.print("Menit (selesai) : ");
        int m2=sc.nextInt();
        System.out.print("detik (mulai) : ");
        int s2=sc.nextInt();
        int s=((j2-j1)*3600)+((m2-m1)*60)+(s2-s1);
        int p=s/5;
        int b=p*150;
        int j3=s/3600;
        int m3=s%3600/60;
        int s3=s%3600%60;
        System.out.println("Lama Percakapan "+j3+" jam "+m3+" menit "+s3+" detik.");
        System.out.println("Biaya yang : Rp. "+b);
    }
}