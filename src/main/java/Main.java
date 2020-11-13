import java.io.IOException;
import edu.mills.cs180a.wordnik.client.ApiClientHelper;
import edu.mills.cs180a.wordnik.client.invoker.ApiClient;

public class Main {
    public static void main(String[] args) {
        try {
            @SuppressWarnings("unused")
            ApiClient client = ApiClientHelper.getApiClient();
            System.out.println("Created client.");
        } catch (IOException e) {
            System.out.println("Expected IOException occurred.");
        }
    }
}
