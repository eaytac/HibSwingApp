
package com.vektorel.hibswingapp.service;

import com.vektorel.hibswingapp.entity.Bolum;
import com.vektorel.hibswingapp.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class BolumService implements IService<Bolum>{

    @Override
    public boolean save(Bolum entity) throws Exception {
        if (entity.getKod() == null || entity.getKod().trim().equals("")) {
            throw new Exception("Bölüm kodu alanı boş olamaz");
        }
        if (entity.getBolumAdi() == null || entity.getBolumAdi().trim().equals("")) {
            throw new Exception("Bölüm adı alanı boş olamaz");
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Bolum entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Bolum entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public List<Bolum> getAll(String query) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Bolum.class);
        return criteria.list();
    }

    @Override
    public Bolum getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Bolum.class);
        criteria.add(Restrictions.eq("id", id));
        return (Bolum) criteria.uniqueResult();
    }
    
}
