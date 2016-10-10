package com.feicuiedu.daily.pojo;

import java.util.Date;

/**
 * Created by chenyan on 2016/10/10.
 */
public class User {

    public User(String name,
                int sex,
                Date birthday,
                String passwd,
                long id) {
        this.name = name;
        this.sex = sex;
        this.birthday = birthday;
        this.passwd = passwd;
        this.id = id;
    }

    private String name;

    // 0:女  1:男
    private int sex;

    private Date birthday;

    private String passwd;

    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", passwd='" + passwd + '\'' +
                ", id=" + id +
                '}';
    }
}
