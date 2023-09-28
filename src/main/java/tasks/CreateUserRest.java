package tasks;

import interactions.ConsumeService;
import models.ModelCreateUserRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class CreateUserRest implements Task {

    private final ModelCreateUserRest modelCreateUserRestList;

    public CreateUserRest(ModelCreateUserRest modelCreateUserRestList) {
        this.modelCreateUserRestList = modelCreateUserRestList;
    }

    public static CreateUserRest with(ModelCreateUserRest modelCreateUserRestList) {
        return Tasks.instrumented(CreateUserRest.class, modelCreateUserRestList);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo((ConsumeService.withPost(modelCreateUserRestList.toString())));
    }
}
