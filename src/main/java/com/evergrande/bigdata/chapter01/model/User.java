package com.evergrande.bigdata.chapter01.model;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: CuiCan
 * @Date: 2017/6/1
 * @Time: 18:19
 * @Description:
 */
public class User {

    private Long id;
    private String name;
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
