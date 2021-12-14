package com.knoldus.learning.entity;
public class Employee {
    /**
     *
     */
    int id;
    String name;
    /**
     * @param i
     * @param num
     */
    public Employee(int i, String num) {
        this.id = i;
        this.name = num;
    }
    /**
     * @return
     */
    public int getId() {
        return id;
    }
    /**
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }
    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
