import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;

public class App {

	public static void main(String[] args)
    {
        User user1 = new User(); //first user
        User user2 = new User(); // second user
             
        user1.setUserName("Abdeali Tinwala");
        user2.setUserName("Rose Mendes");
       
        Address address1 = new Address(); //create first value type object for  entity type object user1
        address1.setStreet("830");
        address1.setCity("Khatiwala Tank");
        address1.setState("Indore");
        address1.setPincode("452014");
        user1.setAddress(address1);
       
        Address address2 = new Address();//create second value type object for  entity type object user2
        address2.setStreet("Wilson Street");
        address2.setCity("New Jersey");
        address2.setState("USA");
        address2.setPincode("07002");
        user2.setAddress(address2);
       
        user1.setDob(new Date());
        user1.setPhone("+91-9953423462");
       
        user2.setDob(new Date());
        user2.setPhone("+91-9973423462");
        
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate_config.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
        //SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory(); //create a session factory object
        Session session = factory.openSession(); // create session object from session factory
        session.beginTransaction(); //begin transaction for this session
       
        session.save(user1); //save the first user
        session.save(user2); //save the second user
       
        session.getTransaction().commit(); //commit the transaction the session
        session.close(); //close the session
    }

}