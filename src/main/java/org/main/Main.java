package org.main;


import org.config.SessionFactoryProvider;
import org.hiberna.dto.FieldName;
import org.hiberna.dto.Student;
import org.hiberna.dto.UserDetail;
import org.hiberna.dto.Vehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;


public class Main {
    public static void main(String[] args) {

        final Session session = SessionFactoryProvider.getSessionFactory().openSession();

        Student student1 =new Student("Abs","hwosh","41265563",new Date(2023), FieldName.MATH);
        Student student2 =new Student("nmbs","zadssh","51445563",new Date(2021), FieldName.CHEMISTRY);


        try {
            session.beginTransaction();
//            final Student student = session.get(Student.class, 1);
//            session.delete(student);
//            System.out.println(student);
            //  session.delete(student1);
            session.save(student1);
            session.save(student2);
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();

        }











//        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
//        Session session1 = sessionFactory.openSession();
//        session1.beginTransaction();
//        session1.getTransaction().commit();
//        session1.close();



        UserDetail userDetail = new UserDetail();

        userDetail.setUsername("Hosein");
        UserDetail userDetail1 =new UserDetail();
        userDetail1.setUsername("Hassan");
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("car");

        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVehicleName("Truk");

        userDetail.getVehicle().add(vehicle);
        userDetail.getVehicle().add(vehicle1);
        userDetail1.getVehicle().add(vehicle1);
        vehicle.getUserDetail().add(userDetail);
        vehicle1.getUserDetail().add(userDetail);
        vehicle.getUserDetail().add(userDetail1);
//        vehicle.setUserDetail(userDetail);
//        vehicle1.setUserDetail(userDetail);



    }
}
