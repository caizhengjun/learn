package com.shanghai.springbootsendmail.bean;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/18 9:56 下午
 */
public class UserC {
    private String userName;
    private Integer age;

    public UserC(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
