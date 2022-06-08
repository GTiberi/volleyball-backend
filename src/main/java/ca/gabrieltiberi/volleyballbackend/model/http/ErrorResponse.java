package ca.gabrieltiberi.volleyballbackend.model.http;

public class ErrorResponse extends Response {


    public ErrorResponse(String message, long timestamp, String status) {
        super(message, timestamp, status);
    }
}
