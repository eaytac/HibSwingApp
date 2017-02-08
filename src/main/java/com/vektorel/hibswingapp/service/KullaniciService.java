package com.vektorel.hibswingapp.service;

import com.vektorel.hibswingapp.entity.Kullanici;
import com.vektorel.hibswingapp.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class KullaniciService implements IService<Kullanici> {

    @Override
    public boolean save(Kullanici entity) throws Exception {
        if (entity.getUsername() == null || entity.getUsername().trim().equals("")) {
            throw new Exception("Kullanıcı adı alanı boş olamaz");
        }
        if (entity.getPassword() == null || entity.getPassword().trim().equals("")) {
            throw new Exception("Kullanıcı şifresi alanı boş olamaz");
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
        return true;

    }

    @Override
    public boolean update(Kullanici entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Kullanici entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public List<Kullanici> getAll(String query) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Kullanici.class);
        if (query != null){
    //  select * from kullanici where ad_soyad like '%KARA%' or username like '%KARA%'
        criteria.add(Restrictions.or(Restrictions.ilike("username", query, MatchMode.ANYWHERE), 
                Restrictions.ilike("adSoyad", query, MatchMode.ANYWHERE)));
        }
        criteria.addOrder(Order.asc("id"));
        return criteria.list();
    }

    @Override
    public Kullanici getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Kullanici.class);
        criteria.add(Restrictions.eq("id", id));
        return (Kullanici) criteria.uniqueResult();
    }

    public Kullanici getUsernameAndPassword(String username, String password) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Kullanici.class);
        criteria.add(Restrictions.eq("username", username));
        criteria.add(Restrictions.eq("password", password));
        return (Kullanici) criteria.uniqueResult();
    }

}
