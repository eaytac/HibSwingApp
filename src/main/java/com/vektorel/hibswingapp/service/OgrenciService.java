package com.vektorel.hibswingapp.service;

import com.vektorel.hibswingapp.entity.Ogrenci;
import com.vektorel.hibswingapp.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class OgrenciService implements IService<Ogrenci> {

    @Override
    public boolean save(Ogrenci entity) throws Exception {
        if (entity == null || entity.getBolum() == null) {
            throw new Exception("Öğrencinin Bölümü boş olamaz");
        }
        if (entity.getTcKimlikNo() == null) {
            throw new Exception("Öğrencinin TC Kimlik No'su boş olamaz");
        }
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(entity);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(Ogrenci entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(entity);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(Ogrenci entity) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
        session.close();
        return true;
    }

    @Override
    public List<Ogrenci> getAll(String query) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Ogrenci.class);
        if (query != null){
        criteria.add(Restrictions.or(Restrictions.ilike("ad", query, MatchMode.ANYWHERE), 
                Restrictions.ilike("soyad", query, MatchMode.ANYWHERE),
                Restrictions.ilike("adres", query, MatchMode.ANYWHERE),
                Restrictions.ilike("okul_no", query, MatchMode.ANYWHERE),
                Restrictions.ilike("dogum_tarihi", query, MatchMode.ANYWHERE),
                Restrictions.ilike("okula_baslama_tarihi", query, MatchMode.ANYWHERE),
                Restrictions.ilike("tc_no", query, MatchMode.ANYWHERE)));
        }
        criteria.addOrder(Order.asc("id"));
        return criteria.list();
    }

    @Override
    public Ogrenci getById(Long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(Ogrenci.class);
        criteria.add(Restrictions.eq("id", id));
        return (Ogrenci) criteria.uniqueResult();
    }

}
