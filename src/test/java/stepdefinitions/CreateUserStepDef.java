package stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import models.ModelCreateUserRest;
import models.dataSet.SetModelCreateUserRest;
import net.serenitybdd.screenplay.actors.OnStage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import questions.LastResponseStatusCode;
import tasks.CreateUserRest;
import io.cucumber.datatable.DataTable;


import java.util.List;

    import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static utils.Constant.VALUE;
import static utils.enums.RestService.BASE_URL;

public class CreateUserStepDef {


 private final SetModelCreateUserRest setModelCreateUserRest = new SetModelCreateUserRest();


    /*
    @DataTableType
    public ModelCreateUserRest modelCreateUserRest (List<String> row) {
        return new ModelCreateUserRest(row.get(0), row.get(1));
    }

     */



    @When("you crate a user")
    public void you_crate_a_user(DataTable dataTable){
        //ModelCreateUserRest.setUser(dataTable);
        //List<ModelCreateUserRest> modelCreateUserRests = dt.asLists(String.class);
        OnStage.theActorInTheSpotlight().attemptsTo(CreateUserRest.with(setModelCreateUserRest.setData(dataTable).get(0)));
    }
    @Then("I should see a user created")
    public void i_should_see_a_user_created() {
        OnStage.theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE)));
    }

}
