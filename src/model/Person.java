/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author evelynzu
 */
public class Person {
    public Person(String name, String DOB) {
//        this.id = id;
        this.name = name;
        this.DOB = DOB;
    }
    
    

    public Person(String account, String password, String type, String name, String DOB) {
        this.account = account;
        this.password = password;
        this.type = type;
        this.name = name;
        this.DOB = DOB;
    }
    
    public Person(){}
    
    public Person(String name){
        this.name = name;
    }
    
//    private String id;
    private String name;
    private String DOB;
    private String account;
    private String password;
    private String type;

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
    
    
    
}
