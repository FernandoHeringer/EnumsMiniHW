/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumsminihw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author fernando 2022380
 */
public class EnumsMiniHW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // Read data from a file, generate team names, create teams, and display team information
    List<Person> people = readDataFromFile("MOCK_DATA.csv");
    List<String> teamNames = getAnimalTeamNames();
    List<Team> teams = createTeams(people, teamNames);

    for (Team team : teams) {
        System.out.println("Team: " + team.getName());
        for (Person person : team.getMembers()) {
            System.out.println("  " + person.getFullName());
        }
        System.out.println();
    }
}

// Read data from a file and convert it into a list of Person objects
private static List<Person> readDataFromFile(String filePath) {
    List<Person> people = new ArrayList<>();
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 4) {
                int id = Integer.parseInt(parts[0]);
                String firstName = parts[1];
                String lastName = parts[2];
                people.add(new Person(id, firstName, lastName));
            }
        }
    } catch (IOException e) {
        e.printStackTrace(); // Print an error message if an exception occurs
    }
    return people;
}

// Generate a list of team names using an enum
private static List<String> getAnimalTeamNames() {
    List<String> animalNames = new ArrayList<>();
    for (AnimalNames name : AnimalNames.values()) {
        animalNames.add(name.name());
    }
    return animalNames;
}

// Create teams by shuffling the list of people and assigning them to teams
private static List<Team> createTeams(List<Person> people, List<String> teamNames) {
    Collections.shuffle(people); // Shuffle the list of people randomly
    List<Team> teams = new ArrayList<>();
    for (String teamName : teamNames) {
        Team team = new Team(teamName);
        for (int j = 0; j < 5 && !people.isEmpty(); j++) {
            team.addMember(people.remove(0));
        }
        teams.add(team);
    }
    return teams;
}
    }
    

