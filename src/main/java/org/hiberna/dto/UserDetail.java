package org.hiberna.dto;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "USER_DETAILS")
public class UserDetail {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
  //  @Basic ->static final object for all column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;
    @Temporal(TemporalType.TIME)
    private Date joinedData;
    private String address;
  //  @Transient ->ignore
 //   @Lob -> big object
    private String description;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
