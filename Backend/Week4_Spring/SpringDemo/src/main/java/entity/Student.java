package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "new_student_details")
public class Student {
    @Id
    @Column(name = "student_id")
    private int id;
    @Column(name = "student_name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}