package hibernate;

import org.hibernate.*;

public class HibernateInsert {
    
    public static void main(String[] args)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        //Add new Employee object
        EmployeeEntity emp = new EmployeeEntity();
        emp.setNo(101);
        emp.setBdate("1997-09-21");
        emp.setFname("Bla");
        emp.setLname("Bla");
        emp.setGen("F");	
        emp.setHdate("2015-09-09");
         
        //Save the employee in database
        session.save(emp);
 
        //Commit the transaction
        session.getTransaction().commit();
        
        HibernateUtil.shutdown();
    }
}