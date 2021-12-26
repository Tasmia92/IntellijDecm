package month;

import org.testng.annotations.Test;

public class Practice {
    @Test(priority = 3)
   void setup() {
       System.out.println("i m sara");
   }
   @Test(priority = 1)
   void teststeps(){
       System.out.println("I am best");
   }
    @Test(priority = 2)
    void tearDown() {
        System.out.println("I am Tall");
    }
}
