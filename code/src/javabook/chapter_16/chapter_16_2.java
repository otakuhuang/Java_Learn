package chapter_16;

import java.lang.reflect.Field;
import java.util.Scanner;

import static utils.Utils.output;

public class chapter_16_2 {
    public static void main(String[] args) throws IllegalAccessException {

        Scanner in = new Scanner(System.in);
        output("请输入姓名: ");
        String name = in.nextLine().trim();
        output("请输入性别: ");
        String sex = in.nextLine().trim();
        output("请输入年龄: ");
        int age = in.nextInt();

        User user = new User(name, sex, age);

        Class clazz = user.getClass();

        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            String str = field.get(user).toString();

            if (str.trim().length() == 0) {
                output("请输入: " + field.getName());
            }
        }
    }
}

class User {

    private String name;
    private String sex;
    private Integer age;

    public User() {
    }

    public User(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
