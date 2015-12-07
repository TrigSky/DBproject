package main.java.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class BaseDao<T>
{
    private Class<T> entityClass;
    @Autowired
    private HibernateTemplate hibernateTemplate;

    private HibernateTemplate getHibernateTemplate()
    {
        return hibernateTemplate;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public BaseDao()
    {
        Type genType = getClass().getGenericSuperclass();
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
        entityClass = (Class) params[0];
    }

    protected T load(Serializable id)
    {
        return (T) getHibernateTemplate().load(entityClass, id);
    }

    protected T get(Serializable id)
    {
        return (T) getHibernateTemplate().get(entityClass, id);
    }

    protected List<T> loadAll()
    {
        return getHibernateTemplate().loadAll(entityClass);
    }

    protected void save(T entity)
    {
        getHibernateTemplate().save(entity);
    }

    protected void remove(T entity)
    {
        getHibernateTemplate().delete(entity);
    }

    protected void update(T entity)
    {
        getHibernateTemplate().update(entity);
    }

    @SuppressWarnings("rawtypes")
    protected List find(String hql)
    {
        return getHibernateTemplate().find(hql);
    }
    
    @SuppressWarnings("rawtypes")
    protected List find(String hql, Object... params)
    {
        return getHibernateTemplate().find(hql, params);
    }

    protected void initialize(Object entity)
    {
        getHibernateTemplate().initialize(entity);
    }
}
