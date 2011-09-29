package inters;

/**
 * Created by IntelliJ IDEA.
 * User: jud
 * Date: 9/29/11
 * Time: 11:44 PM
 * To change this template use File | Settings | File Templates.
 */

public class human {

    int age = 0;
    String name = "";
    String[] sex = new String[2];
    String mySex = "";

    public human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getSex(String cName) {
        this.setSex();
        if (cName == "woman"){
                mySex = sex[0];
        }
        else if (cName == "man") {
            return mySex;
        }mySex =  sex[1];
        return mySex;
    }

    public void setSex() {
        sex[0] = "Female";
        sex[1] = "Male";
        //this.sex = sex;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
