package by.teachmeskills.eshop.services;

import by.teachmeskills.eshop.entities.BaseEntity;

import java.util.List;

public interface BaseService<T extends BaseEntity> {
    List<T> read() throws Exception;
}
