import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,75,30,64,92};

        Scanner scanner=new Scanner(System.in);
        System.out.print("Inserisci k: ");
        int k=scanner.nextInt();

        System.out.println("Gli elementi divisibli sono: "+ Arrays.toString(divisori(k, a)));
    }
    public static int[] divisori(int k, int[] a){
        int lungh=0;
        for (int i=0; i<a.length-1; i++){
            if (a[i]%k==0){
                lungh+=1;
            }
        }
        int[] b=new int[lungh];
        int i2=0;
        for (int i=0; i<a.length-1; i++){
            if (a[i]%k==0){
                b[i2]=a[i];
                i2+=1;
            }
        }
        return b;
    }
}