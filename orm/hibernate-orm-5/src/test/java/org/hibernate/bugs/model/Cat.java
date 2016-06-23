package org.hibernate.bugs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Formula;


@Entity
@Table(name = "TBL_CATS")
@SequenceGenerator(allocationSize = 1, name = "SEQ_STORE", sequenceName = "SEQ_CATS")
public class Cat
{

    @Id
    @Column(name = "CAT_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Long id = null;

    @Column(name = "CAT_NAME", nullable = false)
    private String name;

    @JoinColumn(name = "CAT_OWNER_ID", nullable = false)
    @ManyToOne(fetch = FetchType.EAGER, optional = false, targetEntity = Person.class)
    private Person owner;

    @Formula("CAT_OWNER_ID")
    private final Long ownerId = null;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Person getOwner()
    {
        return owner;
    }

    public void setOwner(Person owner)
    {
        this.owner = owner;
    }

    public Long getOwnerId()
    {
        return ownerId;
    }

}
