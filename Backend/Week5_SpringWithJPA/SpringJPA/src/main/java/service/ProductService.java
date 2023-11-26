package service;

import dao.ProductDao;
import entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    @Autowired
    ProductDao productDao;

    public void save(Product product){

    }
}
