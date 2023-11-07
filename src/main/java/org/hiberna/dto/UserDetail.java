package org.hiberna.dto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;


@Entity
@Table(name = "USER_DETAILS")
public class UserDetail {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String username;
  //  @OneToOne
    @OneToMany
    @JoinColumn(name="Vehicle_ID")
    private Collection<Vehicle> vehicle =new ArrayList<>();

    public Collection<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(Collection<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }

    //    public Vehicle getVehicle() {
//        return vehicle;
//    }
//
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//    }

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


    //  @Basic ->static final object for all column
    //  @GeneratedValue(strategy = GenerationType.IDENTITY)


    //    @Temporal(TemporalType.TIME)
//    private Date joinedData;
//    //private String address;
//    //  @Transient ->ignore
//    //   @Lob -> big object
//    private String description;


//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "street", column = @Column(name = "HOME_STREET_NAME")),
//            @AttributeOverride(name = "city", column = @Column(name = "HOME_CITY_NAME")),
//            @AttributeOverride(name = "state", column = @Column(name = "HOME_STATE_NAME"))})
//    private Address homeAddress;
//    @Embedded
//    @AttributeOverrides({
//            @AttributeOverride(name = "street", column = @Column(name = "OFFICE_STREET_NAME")),
//            @AttributeOverride(name = "city", column = @Column(name = "OFFICE_CITY_NAME")),
//            @AttributeOverride(name = "state", column = @Column(name = "OFFICE_STATE_NAME"))})
//    private Address officeAddress;
//
//
//    @ElementCollection
//    @JoinTable(name = "USER_ADDRESS",
//            joinColumns = @JoinColumn(name = "USER_ID"))
//    private Set<Address> listofAddress = new HashSet<>(); //one to Many  one user have many address

//    @ElementCollection
//    @GenericGenerator(name = "hilo-gen", strategy = "hilo")
//   @CollectionId(columns =  @Column(name = "AddressID"),generator = "hilo-gen" , type = @Type(type = "int") )
//    private Collection<Address> collection =new ArrayList<>();
//
//    public Collection<Address> getCollection() {
//        return collection;
//    }
//
//    public void setCollection(Collection<Address> collection) {
//        this.collection = collection;
//    }
//


}
