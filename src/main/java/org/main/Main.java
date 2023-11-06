package org.main;

import org.hiberna.dto.UserDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import java.util.Date;


public class Main {
    public static void main(String[] args) {
        UserDetail userDetail =new UserDetail();
        userDetail.setUserId(1);
        userDetail.setUsername("Hosein");
        userDetail.setJoinedData(new Date());
        userDetail.setAddress("kiyanshahr");
        userDetail.setDescription("first user ");

        userDetail.setUserId(2);
        userDetail.setUsername("Hassan");
        userDetail.setJoinedData(new Date());
        userDetail.setAddress("kiyanshahr");
        userDetail.setDescription("first user ");

        userDetail.setUserId(3);
        userDetail.setUsername("Hassan");
        userDetail.setJoinedData(new Date());
        userDetail.setAddress("kiyanshahr");
        userDetail.setDescription("first user ");

        SessionFactory sessionFactory =new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(userDetail);
        session.getTransaction().commit();



    }
}
