package by.teachmeskills.eshop.repositories.impl;

import by.teachmeskills.eshop.entities.ProductImage;
import by.teachmeskills.eshop.repositories.ImageRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ImageRepositoryImpl implements ImageRepository {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<ProductImage> getAllSecondaryImages(int id) {
        Query query = entityManager.createQuery("select p from ProductImage p where p=:id ");
        query.setParameter("id", id);
        List<ProductImage> queryList = query.getResultList();
        return queryList;
    }

}
