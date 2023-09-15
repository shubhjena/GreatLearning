package Week2_Core_Java.Exception_Handling;

import java.io.IOException;

public class Subclass extends Superclass{
    @Override
    void method() throws IOException { //this method must only throw a child of the exception thrown by superclass
        System.out.println("Sub Class");
    }
}
