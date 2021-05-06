public class Exception1 {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            int i=9/2;
            System.out.println(i);
            return;
        } catch (Exception e) {
            System.out.println("exception caught");
            return;
        }
       // System.out.println("task completed");
 
    }
 
}
