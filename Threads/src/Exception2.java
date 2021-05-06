public class Exception2 {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        String returnVal = method1();
        System.out.println(returnVal);
    }
 
    public static String method1() {
        try {
            int i = 9/2;
            System.out.println(i);
            return "a" ;
        } catch (Exception e) {
            System.out.println("exception caught");
            
        } finally {
            System.out.println("finally block executing");
        }
        System.out.println("end");
        return "from end";
    }
 
}