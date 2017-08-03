package inaction.ch2glance

import java.util.logging.Level;
import java.util.logging.Logger;

class JavaClassLoaderTests {

    /*
     Visibility Principle
     According to visibility principle, Child ClassLoader can see class loaded by Parent ClassLoader but vice-versa is not true. Which mean if class Abc is loaded by Application class loader than trying to load class ABC explicitly using extension ClassLoader will throw either java.lang.ClassNotFoundException. as shown in below Example
     Read more: http://javarevisited.blogspot.com/2012/12/how-classloader-works-in-java.html#ixzz4ogy2JsWv
     */
    public static void main(String[] args) {
        try {
            //printing ClassLoader of this class
            System.out.println("JavaClassLoaderTests.getClass().getClassLoader() : "
                    + JavaClassLoaderTests.class.getClassLoader());

            // printing parent ClassLoader
            println("Parent ClassLoader: ${JavaClassLoaderTests.class.getClassLoader().getParent()}")

            // printing TOP (Primordial - Bootstrap) ClassLoader
            println("Bootstrap ClassLoader: ${JavaClassLoaderTests.class.getClassLoader().getParent().getParent()}")

            //trying to explicitly load this class again using Extension class loader
            Class.forName("inaction.ch2glance.JavaClassLoaderTests", true
                    ,  JavaClassLoaderTests.class.getClassLoader().getParent());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JavaClassLoaderTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Read more: http://javarevisited.blogspot.com/2012/12/how-classloader-works-in-java.html#ixzz4ogvHEpOK
}
