public class OperatorExample{  
    public static void main(String args[]){  
    int x=10;  
    System.out.println(x++);//10 (11)
    // after post incrementing
    System.out.println(" after post incrementing " + x);  
    System.out.println(++x);//12  
     // after pre incrementing
    System.out.println("after pre incrementing " + x);
    System.out.println(x--);//12 (11) 
     // after post decrementing
    System.out.println("after post decrementing" + x); 
    System.out.println(--x);//10  
    // after pre decrementing
    System.out.println("after pre decrementing" + x); 
    }
} 
