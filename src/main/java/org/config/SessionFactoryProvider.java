package org.config;

import org.hiberna.dto.Student;
import org.hiberna.dto.UserDetail;
import org.hiberna.dto.Vehicle;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;



public class SessionFactoryProvider {

    private final static SessionFactory sessionFactory;

    static {
        StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder()
                .configure()
                .build();
        sessionFactory =new MetadataSources(standardServiceRegistry)
                .addAnnotatedClass(Student.class)
//                .addAnnotatedClass(Vehicle.class)//or add to cfg.xml
//                .addAnnotatedClass(UserDetail.class)
                .buildMetadata()
                .buildSessionFactory();
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
