package eng.eaa.eaaspringredis;

import eng.eaa.eaaspringredis.service.ProductService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class EaaSpringRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(EaaSpringRedisApplication.class, args);
	}

	@Bean
	ApplicationRunner runner (ProductService service){
		return args -> {
			System.out.println("ID1: "+ service.getById(1L));
			System.out.println("ID2: "+ service.getById(2L));
			System.out.println("ID1: "+ service.getById(1L));
			System.out.println("ID1: "+ service.getById(1L));
			System.out.println("ID1: "+ service.getById(1L));
		};
	}


}
