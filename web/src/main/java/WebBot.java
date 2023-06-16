import com.codeborne.selenide.Condition;
import elements.PageElements;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.visible;
import static elements.PageElements.*;

public class WebBot {

    public void clickScheduleDemoButton() {
        SCHEDULE_DEMO_BUTTON.should(visible).click();
    }

    public WebBot fillForm() {
        fillFirstName()
                .fillLastName()
                .fillBusinessEmail()
                .fillCompanyName()
                .selectDepartment()
                .selectNumberOfEmployers()
                .selectAnswer();
        return this;
    }

    private WebBot selectNumberOfEmployers() {
        NUMBER_OF_EMPLOYERS.click();
        SELECT_NUMBER.should(appear).click();
        return this;
    }

    public void submit() {
        SUBMIT_BUTTON.shouldBe(visible).click();
    }

    private WebBot selectAnswer() {
        QUESTION.click();
        SELECT_NO.should(appear).click();
        return this;
    }

    private WebBot selectDepartment() {
        DEPARTMENT.click();
        SELECT_OTHER.should(appear).click();
        return this;
    }

    private WebBot fillCompanyName() {
        COMPANY_NAME_FIELD.sendKeys("BB");
        return this;
    }

    private WebBot fillBusinessEmail() {
        BUSINESS_EMAIL_FIELD.sendKeys("bill_brown@mail.ru");
        return this;
    }

    private WebBot fillLastName() {
        LAST_NAME_FIELD.sendKeys("Brown");
        return this;
    }

    private WebBot fillFirstName() {
        FIRST_NAME_FIELD.shouldBe(visible).sendKeys("Bill");
        return this;
    }

    public void acceptCookies() {
        if (COOKIES_TAB.isDisplayed()) {
            PageElements.ACCEPT_COOKIES_BUTTON.click();
            COOKIES_TAB.should(Condition.disappear);
        }
    }

    public WebBot onCalendlyPage() {
        BrowserManager.toCalendlyPage();
        return this;
    }
}
