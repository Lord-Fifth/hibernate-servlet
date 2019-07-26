package hibernate;

import java.util.List;

import org.hibernate.*;

public class HibernateInsert {
    
    public static void main(String[] args)
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Session session2 = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        //Add new Employee object
        EmployeeEntity emp = new EmployeeEntity();
        emp.setNo(105);
        emp.setBdate("1997-09-21");
        emp.setFname("Loo");
        emp.setLname("Bla");
        emp.setGen("F");	
        emp.setHdate("2015-09-09");
         
        //Save the employee in database
        session.save(emp);
 
        //Commit the transaction
        session.getTransaction().commit();
        
        session1.beginTransaction();
        EmployeeEntity empres=new EmployeeEntity();
        empres=(EmployeeEntity) session1.load(EmployeeEntity.class, 101);
        System.out.println("Loading data");
        System.out.println(empres.getFname()+" "+empres.getLname());
        session2.beginTransaction();
        //EmployeeEntity empres2=new EmployeeEntity();
        Query query=session2.createQuery("from EmployeeEntity");
        List<EmployeeEntity> list=query.list();
        for(EmployeeEntity employeeEntity : list){
        	System.out.println(employeeEntity.getFname()+" "+employeeEntity.getLname());
        }
        //empres2=(EmployeeEntity) session2.get(EmployeeEntity.class, 101);
        session1.close();	
        
        HibernateUtil.shutdown();
    }
}