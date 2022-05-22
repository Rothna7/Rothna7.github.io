import java.util.Scanner ;
     
      public class oasis {
        
        public static void main(String args[]) {

            Scanner scnr = new Scanner(System.in) 
              int numContainer = scnr.nextInt();
              
              int[] container = new int[numContainer] ;
              int water=0;

              for (int i=0;i<container.length;++i) {
                 
                System.out.println("Enter percentage of container filled") ;
                container[i] = scnr.nextInt();

              }
              for (int i = 0; i < container.length; ++i) {
                  water+=container[i];
              }
              
             int waterReq = numContainer*100 - water ;
              System.out.println("Water required: "+ waterReq);
            }
        }
      