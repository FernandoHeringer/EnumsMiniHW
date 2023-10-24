/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumsminihw;

/**
 *
 * @author fernando 2022380
 */
public class Person {
    private int id;
    private String firstName;
    private String lastName;
//    private String email;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
//        this.email = email;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

//    public String getEmail() {
//        return email;
//    }
//    
}
