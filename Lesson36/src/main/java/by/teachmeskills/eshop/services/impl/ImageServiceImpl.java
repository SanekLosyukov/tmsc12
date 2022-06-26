package by.teachmeskills.eshop.services.impl;

import by.teachmeskills.eshop.entities.Image;
import by.teachmeskills.eshop.repositories.impl.ImageRepositoryImpl;
import by.teachmeskills.eshop.services.ImageService;

import java.util.List;

public class ImageServiceImpl implements ImageService {
    private ImageRepositoryImpl imageRepository = new ImageRepositoryImpl();

    @Override
    public Image create(Image entity) {
        return null;
    }

    @Override
    public List<Image> read() {
        return imageRepository.read();
    }

    @Override
    public Image update(Image entity) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    public List<Image> getAllSecondaryImages(int id) {
        return imageRepository.getAllSecondaryImages(id);
    }
}
