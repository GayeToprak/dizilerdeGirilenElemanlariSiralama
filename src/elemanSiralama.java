import java.util.Scanner;
import java.util.Arrays;

public class elemanSiralama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int boyut , eleman;

        System.out.println("dizinin boyutunu giriniz:");
        boyut = inp.nextInt();
        System.out.println("dizinin eleman sayısını giriniz:");
        eleman = inp.nextInt();

        int[] list = new int[boyut];
        for(int i = 1; i <= boyut ; i++){
            System.out.println(i + "." + " elemanı: ");
            list[i-1] = inp.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
