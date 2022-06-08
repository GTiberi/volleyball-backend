package ca.gabrieltiberi.volleyballbackend.model.http;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor

@Getter
public abstract class Response {
    private final String message;
    private final long timestamp;
    private final String status;
}
