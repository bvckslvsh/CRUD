package me.bvckslvsh.CRUD.contents;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Content {

    @Id
    @SequenceGenerator(name = "content_sequence", sequenceName = "content_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    private Long id;

    private String name;
    private String description;


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Content{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
