package tugas5b;
import java.util.Scanner;
//@author Gusde Biyan Ambarista

public class Tugas5b {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int jumlahderet = 0;
        System.out.print("Masukkan Jumlah Deret = ");
        jumlahderet = input.nextInt();
        int [] deretarray = new int [jumlahderet];

        for(int i =0; i < jumlahderet; i++){
            deretarray[i]=(int) (Math.random() * 10);
        }

        for(int j = 0; j < jumlahderet; j++){
            System.out.print(deretarray[j]+"\t");
        }
    
   }
    
}
