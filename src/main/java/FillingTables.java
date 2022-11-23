
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.springframework.security.core.userdetails.User;
//
//import javax.management.relation.Role;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;

public class FillingTables {
//    public static void main(String[] args) {
//        SessionFactory factory = new Configuration()
//                .configure("hibernate.cfg.xml")
//                .addAnnotatedClass(User.class)
//                .addAnnotatedClass(Role.class)
//                .addAnnotatedClass(Record.class)
//                .addAnnotatedClass(Master.class)
//                .addAnnotatedClass(Services.class)
//                .buildSessionFactory();
//        Session session = null;
//        try{
//            session = factory.getCurrentSession();
//
//            Role role1 = new Role(1,"ROLE_ADMIN");
//            Role role2 = new Role(2, "ROLE_USER");
//            List<Role> adminList = new ArrayList<>();
//            adminList.add(role1);
//            User admin = new User("admin", "admin", "admin", adminList);
//            List<Role> userList = new ArrayList<>();
//            userList.add(role2);
//            User user = new User("user", "user", "user", userList);
//            Services service1 = new Services(Service.Manicure, 1.5, 30);
//            Services service2 = new Services(Service.Pedicure, 2., 40);
//            Services service3 = new Services(Service.EyebrowColoring, 0.5, 10);
//            Services service4 = new Services(Service.LaminationOfEyebrows, 0.5, 10);
//            Services service5 = new Services(Service.EyebrowCorrection, 0.5, 10);
//            Master master1 = new Master("Marina");
//            Master master2 = new Master("Ekaterina");
//            master1.addServiceToMaster(service1);
//            master1.addServiceToMaster(service2);
//            master2.addServiceToMaster(service3);
//            master2.addServiceToMaster(service4);
//            master2.addServiceToMaster(service5);
//            Record record1 = new Record(service1, master1, "2022-11-26", "10:00:00");
//            Record record2 = new Record(service2, master1, "2022-11-26", "11:30:00");
//            Record record3 = new Record(service3, master2, "2022-11-26", "10:00:00");
//            Record record4 = new Record(service4, master2, "2022-11-26", "10:30:00");
//            Record record5 = new Record(service5, master2, "2022-11-26", "11:00:00");
//
//            session.beginTransaction();
//
//            List<Role> roles = new ArrayList<>();
//            roles.add(role1); roles.add(role2);
//            Iterator iterator = roles.iterator();
//            while (iterator.hasNext()) {
//                session.save(iterator.next());
//            }
//
//
//            List<User> users = new ArrayList<>();
//            users.add(admin); users.add(user);
//            iterator = users.iterator();
//            while (iterator.hasNext()) {
//                session.save(iterator.next());
//            }
//
//            List<Services> services = new ArrayList<>();
//            services.add(service1);
//            services.add(service2);
//            services.add(service3);
//            services.add(service4);
//            services.add(service5);
//            iterator = services.iterator();
//            while (iterator.hasNext()) {
//                session.persist(iterator.next());
//            }
//
//
//            List<Master> masters = new ArrayList<>();
//            masters.add(master1);
//            masters.add(master2);
//            iterator = masters.iterator();
//            while (iterator.hasNext()) {
//                session.persist(iterator.next());
//            }
//
//            List<Record> records = new ArrayList<>();
//            records.add(record1);
//            records.add(record2);
//            records.add(record3);
//            records.add(record4);
//            records.add(record5);
//            iterator = records.iterator();
//            while (iterator.hasNext()) {
//                session.persist(iterator.next());
//            }
//
//            session.getTransaction().commit();
//            System.out.println("DONE");
//
//
//        } finally {
//            session.close();
//            factory.close();
//        }
//    }
}
