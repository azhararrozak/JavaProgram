import java.util.*;

public class Main
{
	public static void main(String[] args) {
        try {
        	LinkedList<Integer> dataAngka = new LinkedList<Integer>();
        	Scanner input = new Scanner(System.in);
            System.out.println("Masukkan jumlah: ");
            int n = input.nextInt();
            for(int i=1; i<=n; i++){
                int angka = input.nextInt();;
                if(angka % 2 == 1){
                    dataAngka.add(angka);
                }
            }
            System.out.println(dataAngka);
        } catch (Exception e) {
            System.out.println("Masukkan Angka");
        }
	}
}
