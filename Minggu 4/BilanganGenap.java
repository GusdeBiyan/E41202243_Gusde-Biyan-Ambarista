package bilangangenap;
import java.util.Scanner ;
//@author Gusde Biyan Ambarista

public class BilanganGenap {

    
    public static void main(String[] args) {
        int bil_genap ;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Masukkan Batas Angka Bilangan Genap = ");
        bil_genap= keyboard.nextInt();

        for(int i=2; i<=bil_genap; i+=2){
            System.out.print(i + "  ");
        }
    }
    
}
