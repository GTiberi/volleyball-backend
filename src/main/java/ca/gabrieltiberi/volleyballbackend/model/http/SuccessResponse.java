package ca.gabrieltiberi.volleyballbackend.model.http;


import lombok.Getter;

@Getter
public class SuccessResponse extends Response {


    public SuccessResponse(String message, long timestamp, String status) {
        super(message, timestamp, status);

    }
}
