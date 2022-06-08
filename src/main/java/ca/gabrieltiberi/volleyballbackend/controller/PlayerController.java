package ca.gabrieltiberi.volleyballbackend.controller;

import ca.gabrieltiberi.volleyballbackend.model.Player;
import ca.gabrieltiberi.volleyballbackend.model.http.Response;
import ca.gabrieltiberi.volleyballbackend.model.http.SuccessResponse;
import ca.gabrieltiberi.volleyballbackend.repository.PlayerRepository;
import ca.gabrieltiberi.volleyballbackend.utils.Constants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@Slf4j
@RestController
@RequestMapping(path = Constants.BASE_PREFIX + Constants.API_VERSION)
public class PlayerController {

    PlayerRepository playerRepository;

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<Response> produceTopicMessage(@RequestBody Player player)  {

        System.out.println(player.toString());


        var successResponse = new SuccessResponse("Success",System.currentTimeMillis(),HttpStatus.CREATED.toString());


        return new ResponseEntity<>(successResponse, HttpStatus.CREATED);
    }

    @Autowired
    public PlayerController(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
}
