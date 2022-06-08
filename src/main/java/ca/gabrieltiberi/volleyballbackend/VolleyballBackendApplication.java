package ca.gabrieltiberi.volleyballbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class VolleyballBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(VolleyballBackendApplication.class, args);
    }

}
