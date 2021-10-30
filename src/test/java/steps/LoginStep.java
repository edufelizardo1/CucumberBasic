package steps;

import Transformation.EmailTransform;
import base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author edufelizardo1@gmail.com
 * @version 1.0.0
 * Created by BRP...-PC on 30/10/2021
 */
public class LoginStep extends BaseUtil {

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Given("^Inavigate to the login page$")
    public void inavigateToTheLoginPage() {
        System.out.println("The driver is : " + base.StepInfo);

        System.out.println("Navigate Login Page");
    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) {
       List<List<String>> data = table.raw();
        /*System.out.println("The isvalue: " + data.get(0).get(0).toString());
        System.out.println("The isvalue: " + data.get(0).get(1).toString());
        System.out.println("The isvalue: " + data.get(1).get(0).toString());
        System.out.println("The isvalue: " + data.get(1).get(1).toString());*/

        List<User> users = new ArrayList<User>();
        users = table.asList(User.class);

        for (User user: users) {
            System.out.println("The UserName is " + user.username);
            System.out.println("The Password is " + user.password);
        }
    }

    @And("^I click login button$")
    public void iClickLoginButton() {
        System.out.println("Click Login button");
    }

    @Then("^I should see the userform paga$")
    public void iShouldSeeTheUserformPaga() {
        System.out.println("I should see userform page");
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String password) {
        System.out.println("The UserName is " + userName);
        System.out.println("The Password is " + password);
    }

    @And("^I enter the users email address as Email:([^\"]*)$")
    public void iEnterTheUsersEmailAddressAsEmailAdmin(@Transform(EmailTransform.class) String email) {
        System.out.println("The Email Address is " + email);
    }

    @And("^I verify the count of my address digits for R\\$ (\\d+)$")
    public void iVerifyTheCountOfMyAddressDigitsForR$(int salary) {
        System.out.println("My salary digits is " + salary);
    }

    public class User
    {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}
