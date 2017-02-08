
package com.vektorel.hibswingapp.service;

import java.util.List;

public interface IService<T> {
    
    boolean save(T entity) throws Exception;
    
    boolean update(T entity);
    
    boolean delete(T entity);
    
    List<T> getAll(String query);
    
    T getById(Long id);
    
}
