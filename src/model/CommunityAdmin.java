/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author evelynzu
 */
public class CommunityAdmin {
    
    private Person person;
    private Community community;
    
    public CommunityAdmin(Person person, Community community){
        this.person = person;
        this.community = community;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }
    
    @Override
    public String toString() {
        return person.getName();
    }
    
    
    
}
