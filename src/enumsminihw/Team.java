/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumsminihw;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernando 2022380
 */
public class Team {
    
        private String name;
    private List<Person> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public String getName() {
        return name;
    }

    public List<Person> getMembers() {
        return members;
    }
}
    
