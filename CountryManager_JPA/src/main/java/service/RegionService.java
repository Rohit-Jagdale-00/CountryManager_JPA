package service;

import java.util.List;

import app.HibernateUtil;
import entity.RegionEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class RegionService {

	public void saveRegions(RegionEntity region) {
		EntityTransaction transaction=null;
		try(EntityManager entitymanager=HibernateUtil.getentityManagerFactory().createEntityManager();){
			transaction=entitymanager.getTransaction();
			transaction.begin();
			entitymanager.persist(region);
			transaction.commit();
		}catch(Exception e) {e.printStackTrace();}
	}
	
	public List<RegionEntity> getAllRegions(){
		try(EntityManager entitymanage=HibernateUtil.getentityManagerFactory().createEntityManager();){
			return entitymanage.createQuery("from RegionEntity",RegionEntity.class).getResultList();
		}
	}
	
	public void updateRegion(int region_id,String newregion_name) {
		EntityTransaction transaction=null;
		try(EntityManager entitymanager=HibernateUtil.getentityManagerFactory().createEntityManager();){
			transaction=entitymanager.getTransaction();
			transaction.begin();
			RegionEntity e=entitymanager.find(RegionEntity.class, region_id);
			if(e!=null) {
				e.setRegion_name(newregion_name);
				entitymanager.merge(e);
			}
			transaction.commit();
		}catch(Exception ee) {ee.printStackTrace();}
	}
	
	public void deleteRegion(int empId) {
		EntityTransaction transaction=null;
		try(EntityManager entitymanager=HibernateUtil.getentityManagerFactory().createEntityManager();){
			transaction=entitymanager.getTransaction();
			transaction.begin();
			RegionEntity emp=entitymanager.find(RegionEntity.class,empId);
			if(emp!=null) {
				entitymanager.remove(emp);
			}
			transaction.commit();
		}catch(Exception ee) {ee.printStackTrace();}
	}
	
	
}//EmployeeService
