package org.main;


import org.hiberna.dto.UserDetail;
import org.hiberna.dto.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
        UserDetail userDetail = new UserDetail();

        userDetail.setUsername("Hosein");
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("car");

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVehicleName("Truk");
        vehicle.setUserDetail(userDetail);
        vehicle1.setUserDetail(userDetail);


        userDetail.getVehicle().add(vehicle);
        userDetail.getVehicle().add(vehicle1);


        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(userDetail);
        session.save(vehicle);
        session.save(vehicle1);
        session.getTransaction().commit();
        session.close();


//        userDetail.setJoinedData(new Date());
//        userDetail.setDescription("first user ");
//
//        Address addressHome =new Address();
//        addressHome.setStreet("Ebrahimi");
//        addressHome.setCity("Tehran");
//       userDetail.setHomeAddress(addressHome);
//
//        Address addressOffice =new Address();
//        addressOffice.setStreet("Mashahdi");
//        addressOffice.setCity("Rey");
//       userDetail.setOfficeAddress(addressOffice);
//
//        userDetail.getListofAddress().add(addressHome);
//       userDetail.getListofAddress().add(addressOffice);

//      userDetail.getCollection().add(addressOffice);
//        userDetail.getCollection().add(addressHome);


//        userDetail=null;
//         session = sessionFactory.openSession();
//        session.beginTransaction();
//        userDetail =(UserDetail) session.get(UserDetail.class,1);
//        System.out.println("User Name Detail is :"+userDetail.getUsername());


    }
}
