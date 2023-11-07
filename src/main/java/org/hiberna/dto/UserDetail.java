package org.hiberna.dto;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "USER_DETAILS")
public class UserDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    //  @Basic ->static final object for all column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;
    @Temporal(TemporalType.TIME)
    private Date joinedData;
    //private String address;
    //  @Transient ->ignore
    //   @Lob -> big object
    private String description;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "HOME_STREET_NAME")),
            @AttributeOverride(name = "city", column = @Column(name = "HOME_CITY_NAME")),
            @AttributeOverride(name = "state", column = @Column(name = "HOME_STATE_NAME"))})
    private Address homeAddress;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "OFFICE_STREET_NAME")),
            @AttributeOverride(name = "city", column = @Column(name = "OFFICE_CITY_NAME")),
            @AttributeOverride(name = "state", column = @Column(name = "OFFICE_STATE_NAME"))})
    private Address officeAddress;
    @ElementCollection
    private Set<Address> listofAddress =new HashSet<>(); //one to Many  one user have many address

    public Set<Address> getListofAddress() {
        return listofAddress;
    }

    public void setListofAddress(Set<Address> listofAddress) {
        this.listofAddress = listofAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getJoinedData() {
        return joinedData;
    }

    public void setJoinedData(Date joinedData) {
        this.joinedData = joinedData;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
