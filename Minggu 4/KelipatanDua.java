package KelipatanDua;

//@author Gusde Biyan Ambarista

public class KelipatanDua {

   
    public static void main(String[] args) {
        
        System.out.println("          DO__WHILE         ");
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");
        int i = 1;
        do{
            System.out.print(i + "   ");
            i += i;
        }while(i<=100);
       
   
    }
    
}
