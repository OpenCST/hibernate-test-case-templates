package org.hibernate.bugs.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "TBL_PERSONS")
@SequenceGenerator(allocationSize = 1, name = "SEQ_STORE", sequenceName = "SEQ_PERSONS")
public class Person
{
    @Id
    @Column(name = "PERSON_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id = null;

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "DOB", nullable = true)
    private Date dateOfBirth;

    //No OneToMany in this example
    //    private final List<Cat> cats = new LinkedList<Cat>();

}
