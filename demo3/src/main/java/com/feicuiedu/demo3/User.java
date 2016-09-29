package com.feicuiedu.demo3;

/**
 * Created by chenyan on 2016/9/28.
 */
public class User implements Comparable{
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {

        User u = (User)o;
        int res = 0;
        if (age > u.age) {
            res = 2;
        }
        else if (age == u.age) {
            res =0;
        }
        else {
            res = -12;
        }
        return res;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        /*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        if (age != user.age) return false;
        return name != null ? name.equals(user.name) : user.name == null;*/

        return true;

    }

    @Override
    public int hashCode() {
       /* int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;*/
        return 1;
    }
}
