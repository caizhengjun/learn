package com.shanghai.springbootasync.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author caizhengjun
 * @version 1.0
 * @date 2020/6/22 2:58 下午
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private String name;
    private String blog;

    public User(String name, String blog) {
        this.name = name;
        this.blog = blog;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", blog='" + blog + '\'' +
                '}';
    }
}
