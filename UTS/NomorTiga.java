import java.util.Scanner;
public class NomorTiga {
    public static void main(String args[])
    {
        Scanner masuk = new Scanner(System.in);
        int i, n;
        float jum, x, rata;
        System.out.print ("Banyaknya Bilangan: ");
        n = masuk.nextInt();
        jum=0;
        i=1;
        while (i<=n){
                System.out.print ("ke-"+i+": ");
                x=masuk.nextFloat ();
                jum += x;
                i++;
        }
        rata = jum + n;
        
        System.out.println ("Jumlah: "+jum);
   }
}