package by.teachmeskills.eshop.repositories.impl;

import by.teachmeskills.eshop.entities.Product;
import by.teachmeskills.eshop.repositories.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private final SessionFactory sessionFactory;

    public ProductRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Product findById(int id) throws Exception {
        log.info(String.format("Method UserServiceImpl#findById(%s) is called", id));
        Session session = sessionFactory.getCurrentSession();
        Product product = session.get(Product.class, id);
        return product;
    }

    @Override
    public List<Product> findByAllCategoryId(int categoryId) throws Exception {
        Session session = sessionFactory.getCurrentSession();
        Query<Product> query = session.createQuery("select p from Product p where p.category.id=:categoryId");
        query.setParameter("categoryId", categoryId);
        return query.list();
    }

    @Override
    public List<Product> getSearchFromDB(String search) {
        Session session = sessionFactory.getCurrentSession();
        Query<Product> query = session.createQuery("select p from Product p where p.name like :search or p.description like: search order by p.id desc");
        query.setParameter("search", search);
        List<Product> searchedProducts = query.list();
        return searchedProducts;
    }
}
