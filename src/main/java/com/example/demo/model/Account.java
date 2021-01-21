package com.example.demo.model;

import java.sql.Date;

public class Account {
    private Integer id;

    private String accout;

    private String name;

    private String inOrOut;

    private Date date;

    private String category;

    private String type;

    private String money;

    private String note;

    public Account() {
    }

    public Account(Integer id, String accout, String name, String inOrOut, Date date, String category, String type, String money, String note) {
        this.id = id;
        this.accout = accout;
        this.name = name;
        this.inOrOut = inOrOut;
        this.date = date;
        this.category = category;
        this.type = type;
        this.money = money;
        this.note = note;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccout() {
        return accout;
    }

    public void setAccout(String accout) {
        this.accout = accout == null ? null : accout.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getInOrOut() {
        return inOrOut;
    }

    public void setInOrOut(String inOrOut) {
        this.inOrOut = inOrOut == null ? null : inOrOut.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money == null ? null : money.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}