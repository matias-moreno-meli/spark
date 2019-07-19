import com.google.gson.JsonElement;

public class StandardResponse {

    private StatusResponse statusResponse;
    private String message;
    private JsonElement data;

    public StandardResponse() {
    }

    public StandardResponse(StatusResponse statusResponse, String message, JsonElement data) {
        this.statusResponse = statusResponse;
        this.message = message;
        this.data = data;
    }

    public StandardResponse(StatusResponse statusResponse) {
        this.statusResponse = statusResponse;
    }

    public StatusResponse getStatusResponse() {
        return statusResponse;
    }

    public void setStatusResponse(StatusResponse statusResponse) {
        this.statusResponse = statusResponse;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JsonElement getData() {
        return data;
    }

    public void setData(JsonElement data) {
        this.data = data;
    }
}
