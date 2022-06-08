package ca.gabrieltiberi.volleyballbackend.repository;

import ca.gabrieltiberi.volleyballbackend.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface PlayerRepository extends MongoRepository<Player, String> {


        @Query("{name:'?0'}")
        Player findItemByFirstName(String firstName);

        @Query(value="{position:'?0'}")
        List<Player> findAll(String position);

        public long count();


}
