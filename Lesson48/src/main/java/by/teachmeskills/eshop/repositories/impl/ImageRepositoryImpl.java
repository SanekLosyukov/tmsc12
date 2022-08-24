package by.teachmeskills.eshop.repositories.impl;

import by.teachmeskills.eshop.entities.ProductImage;
import by.teachmeskills.eshop.repositories.ImageRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ImageRepositoryImpl implements ImageRepository {
    private final SessionFactory sessionFactory;

    public ImageRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<ProductImage> getAllSecondaryImages(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<ProductImage> query = session.createQuery("select p from ProductImage p where p=:id ");
        query.setParameter("id", id);
        List<ProductImage> queryList = query.list();
        return queryList;
    }

}
