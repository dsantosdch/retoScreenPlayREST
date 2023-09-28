package interactions;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import interactions.WithPost;

public class ConsumeService {
    private ConsumeService() {
    }
    public static WithPost withPost(String body) {
        return Tasks.instrumented(WithPost.class, body);
    }
}
