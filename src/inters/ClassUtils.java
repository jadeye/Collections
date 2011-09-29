package inters;

/**
 * Created by IntelliJ IDEA.
 * User: jud
 * Date: 9/30/11
 * Time: 12:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class ClassUtils {
// returns the class (without the package if any)
  public static String getClassName(Class c) {
    String FQClassName = c.getName();
    int firstChar;
    firstChar = FQClassName.lastIndexOf ('.') + 1;
    if ( firstChar > 0 ) {
      FQClassName = FQClassName.substring ( firstChar );
      }
    return FQClassName;
    }


  // returns package and class name
  public static String getFullClassName(Class c) {
    return  c.getName();
    }

  // returns the package without the classname, empty string if
  // there is no package
  public static String getPackageName(Class c) {
    String fullyQualifiedName = c.getName();
    int lastDot = fullyQualifiedName.lastIndexOf ('.');
    if (lastDot==-1){ return ""; }
    return fullyQualifiedName.substring (0, lastDot);
   }

 /*
  public static void main(String[] args) {
    System.out.println(ClassUtils.getClassName(java.awt.Frame.class));
    System.out.println(ClassUtils.getFullClassName(java.awt.Frame.class));
    System.out.println(ClassUtils.getPackageName(java.awt.Frame.class));
    System.out.println("----");
    System.out.println(ClassUtils.getClassName(ClassUtils.class));
    System.out.println(ClassUtils.getFullClassName(ClassUtils.class));
    System.out.println(ClassUtils.getPackageName(ClassUtils.class));
    System.out.println("----");
    java.util.Calendar cal = java.util.Calendar.getInstance();
    System.out.println(ClassUtils.getClassName(cal.getClass()));
    System.out.println(ClassUtils.getFullClassName(cal.getClass()));
    System.out.println(ClassUtils.getPackageName(cal.getClass()));
    }
    */
}
