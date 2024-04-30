package cascadeexample;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

public class Main 
{
	public static void main(String[] args) 
	{
		EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
		entityManager.getTransaction().begin();
			
			// Example for Persistant -->to insert record
			
			/*Mobile m = new Mobile();
			m.setMid(246);
			m.setMno("8978909091");
			//entityManager.persist(m);-->not required
			
			Learner l = new Learner();
			l.setlId(25);
			l.setlName("Sakthi");
			 m.setLr(l);
			List<Mobile> ml = new ArrayList<Mobile>();
			ml.add(m);
			l.setLi(ml);
			entityManager.persist(l);*/
		
		
		
		
		
		// to find
		//cascadetype.MERGE to update record
		
		/*Mobile m=entityManager.find(Mobile.class, 245);
		Learner l=m.getLr();
		l.setlName("Rohini");
		m.setMno("9824380734");
		List<Mobile> mlist=new ArrayList<Mobile>();
		mlist.add(m);
		l.setLi(mlist);
		entityManager.clear();
		entityManager.merge(l);*/
		
		
		
		
		//cascadetype.REMOVE to delete record
		
		Learner l1 = entityManager.find( Learner.class,24 );
		entityManager.remove(l1); 
		
		
		
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}
		
	}


