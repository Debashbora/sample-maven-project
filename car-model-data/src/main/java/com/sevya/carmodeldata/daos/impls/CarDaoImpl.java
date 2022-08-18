package com.sevya.carmodeldata.daos.impls;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.sevya.carmodeldata.daos.CarDao;
import com.sevya.carmodeldata.entities.Car;
import com.sevya.carmodeldata.util.DaoUtil;

@Repository
public class CarDaoImpl implements CarDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Autowired
	private DaoUtil daoUtil;

	@Override
	public List<Car> fetchAll() {
		Session session = daoUtil.getSession();
		Query<Car> query = session.createQuery("from Car", Car.class);
		List<Car> resultList = query.getResultList();
		return resultList;
	}

	@Override
	public void saveOne(Car car) {
		hibernateTemplate.save(car);
		System.out.println("CarModelDaoImpl.saveOne()");
	}
	
	@Override
	public Car fetch(Integer id) {
		return hibernateTemplate.get(Car.class, id);
	}
	
	@Override
	public void update(Car car) {
		//hibernateTemplate.update(car); 
		Session session = daoUtil.getSession(); 
		Transaction transaction = daoUtil.getTransaction(session);
		session.update(car);
		transaction.commit();
	}

	
	@Override
	public void delete(Integer id) {
		Session session = daoUtil.getSession(); 
		Transaction transaction = daoUtil.getTransaction(session);
		session.delete(fetch(id));
		transaction.commit();
	}

}
