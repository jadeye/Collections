package inters;


import static inters.ClassUtils.getClassName;

/**
 * Created by IntelliJ IDEA.
 * User: jud
 * Date: 9/29/11
 * Time: 11:51 PM
 * To change this template use File | Settings | File Templates.
 */

public class woman extends superwoman {
    public woman(int age, String name) {
        super(age, name);
    }

    @Override
    public String getClsName() {
        clsName = getClassName(woman.class);
        return clsName;
    }

    @Override
    protected void setClsName() {
        this.clsName = getClassName(ClassUtils.class);
    }

}
