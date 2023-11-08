package org.hiberna.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student_table")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //serial
    private Integer id;

    @Transient
    private String firstname;
    @Transient
    private String lastname;
    @Column(name = "full_name", nullable = false)
    private String fullname;

    @Column(nullable = false, updatable = false, length = 12, unique = true, name = "student_number")
    private String studentNumber;

    @Temporal(TemporalType.DATE)
    private Date dob;

    @Enumerated(EnumType.STRING)
    private FieldName field;

    public Student(String firstname, String lastname, String studentNumber, Date dob, FieldName field) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentNumber = studentNumber;
        this.dob = dob;
        this.field = field;
        this.fullname=firstname+"_"+lastname;
    }


}
