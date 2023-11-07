package org.config;

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
                .buildMetadata()
                .buildSessionFactory();
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
