import java.util.Scanner;
    public class town {
        public static void main(String args[]) {
                
            Scanner scnr = new Scanner(System.in)
                int mass ;
                double height;
                double weight; 
                double volume; 

                System.out.println("Enter Height in metres:  ");
                height = scnr.nextDouble();
         
                       System.out.println("Enter Mass in Kg:  ");
                       mass = scnr.nextInt();
                    
                           weight = mass *8.06;

                           volume = weight*height;
                
                   

                     System.out.println("Volume: "+ volume+ "Kg");

                     if (volume<2000) {
                         System.out.println("Accepted");

                     }
                     else { 
                         System.out.println("Reject");
                     }
            }
        
        }
    