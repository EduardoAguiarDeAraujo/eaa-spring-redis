package eng.eaa.eaaspringredis.service;

import eng.eaa.eaaspringredis.model.Product;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProductService {
    Map<Long, Product> products = new HashMap<>(){
        {
            put(1L, new Product(1L , "Notebook", "Mackbook"));
            put(2L, new Product(2L , "Notebook", "Dell"));
            put(3L, new Product(3L , "Notebook", "Lenovo"));
            put(4L, new Product(4L , "Notebook", "IBM"));
            put(5L, new Product(5L , "Notebook", "Asus"));
        }
    };

    @Cacheable("products")
    public Product getById(Long id){
        System.out.println("Pesquisando produtos");
        simularEspera();
        return products.get(id);
    }

    private void simularEspera() {
        try {
            Long time = 1000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
