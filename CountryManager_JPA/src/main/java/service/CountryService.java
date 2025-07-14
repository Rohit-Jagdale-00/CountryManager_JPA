package service;

import java.util.List;

import app.HibernateUtil;
import entity.CountryEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CountryService {

	public void saveCountry(CountryEntity country) {
		EntityTransaction transaction=null;
		try(EntityManager entitymanager=HibernateUtil.getentityManagerFactory().createEntityManager();){
			transaction=entitymanager.getTransaction();
			transaction.begin();
			entitymanager.persist(country);
			transaction.commit();
		}catch(Exception e) {e.printStackTrace();}
	}
	
	public List<CountryEntity> getAllCountries(){
		try(EntityManager entitymanager=HibernateUtil.getentityManagerFactory().createEntityManager();){
			return entitymanager.createQuery("from CountryEntity",CountryEntity.class).getResultList();
		}
	}
	
	public void updateCountry(String country_id, String country_name) {
		EntityTransaction transaction=null;
		try(EntityManager entitymanager=HibernateUtil.getentityManagerFactory().createEntityManager();){
			transaction=entitymanager.getTransaction();
			CountryEntity con=entitymanager.find(CountryEntity.class, country_id);
			if(con!=null) {
				con.setCountry_name(country_name);
				entitymanager.merge(con);
			}
			transaction.commit();
		}catch(Exception ee) {ee.printStackTrace();}
	}
	
	public void deleteCountry(String country_id) {
		EntityTransaction transaction=null;
		try(EntityManager entitymanager=HibernateUtil.getentityManagerFactory().createEntityManager();){
			transaction=entitymanager.getTransaction();
			CountryEntity c=entitymanager.find(CountryEntity.class,country_id);
			if(c!=null) {
				entitymanager.remove(c);
			}
			transaction.commit();
		}catch(Exception ee) {ee.printStackTrace();}
	}
	
	
}//EmployeeService
