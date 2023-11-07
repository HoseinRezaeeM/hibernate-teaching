package org.hiberna.dto;

import javax.persistence.*;

@Entity
public class Vehicle {
@Id @GeneratedValue
    private int VehicleId;
    private String VehicleName;
    @ManyToOne
    @JoinTable(name = "USER_VEHICLE",joinColumns = @JoinColumn(name = "VEHICLE_ID")
            ,inverseJoinColumns = @JoinColumn(name = "USER_ID"))
    private UserDetail userDetail;

    public UserDetail getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(UserDetail userDetail) {
        this.userDetail = userDetail;
    }

    public int getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(int vehicleId) {
        VehicleId = vehicleId;
    }

    public String getVehicleName() {
        return VehicleName;
    }

    public void setVehicleName(String vehicleName) {
        VehicleName = vehicleName;
    }
}
