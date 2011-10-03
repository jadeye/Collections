package inters;

import static inters.ClassUtils.getClassName;

/**
 * Created by IntelliJ IDEA.
 * User: jud
 * Date: 9/29/11
 * Time: 11:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class man extends human {
    private String clsName;

    public man(int age, String name) {
        super(age, name);
    }

    public String getClsName() {
        clsName = getClassName(man.class);
        return clsName;
    }

    protected void setClsName() {
        this.clsName = getClassName(ClassUtils.class);
    }
}
