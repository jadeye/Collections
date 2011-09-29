package inters;


import static inters.ClassUtils.getClassName;

/**
 * Created by IntelliJ IDEA.
 * User: jud
 * Date: 9/29/11
 * Time: 11:51 PM
 * To change this template use File | Settings | File Templates.
 */

public class woman extends human {
    public woman(int age, String name) {
        super(age, name);
    }

    String clsName ="";
    //Class<Integer> c = int.class;
    //char mySex = super.getSex((char)c);
    public String getClsName() {
        clsName = getClassName(woman.class);
                //ClassUtils.class);
        return clsName;
    }

    private void setClsName() {
        this.clsName = getClassName(ClassUtils.class);
    }


    //System.out.println("decl class = " + m.getDeclaringClass());

    /*
    Class c = Class.forName("java.lang.String");
    Method m[] = c.getDeclaredMethods();
    System.out.println(m[0].

    */

}
