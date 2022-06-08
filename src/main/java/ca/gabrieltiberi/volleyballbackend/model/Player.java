package ca.gabrieltiberi.volleyballbackend.model;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("player")
@AllArgsConstructor
public class Player {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private Position position;
    private String team;

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position=" + position +
                ", team='" + team + '\'' +
                '}';
    }
}
