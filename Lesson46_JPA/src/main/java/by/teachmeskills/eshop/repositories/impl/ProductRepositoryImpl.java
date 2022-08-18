package by.teachmeskills.eshop.repositories.impl;

import by.teachmeskills.eshop.entities.Product;
import by.teachmeskills.eshop.repositories.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Transactional
@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Product findById(int id) throws Exception {
        log.info(String.format("Method UserServiceImpl#findById(%s) is called", id));

        return entityManager.find(Product.class, id);

    }

    @Override
    public List<Product> findByAllCategoryId(int categoryId) throws Exception {
        Query query = entityManager.createQuery("select p from Product p where p.category.id=:categoryId");
        query.setParameter("categoryId", categoryId);
        return query.getResultList();
    }

    @Override
    public List<Product> getSearchFromDB(String search) {
        Query query = entityManager.createQuery("select p from Product p where p.name like :search or p.description like: search order by p.id desc");
        query.setParameter("search", search);
        List<Product> searchedProducts = query.getResultList();
        return searchedProducts;
    }
}
