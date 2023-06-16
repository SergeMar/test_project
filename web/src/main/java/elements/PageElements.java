package elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import javax.xml.xpath.XPath;

import static org.openqa.selenium.By.cssSelector;
import static org.openqa.selenium.By.xpath;

public class PageElements {
    public static final SelenideElement COOKIES_TAB = new UiElement(cssSelector("#hs-eu-cookie-confirmation")).get();
    public static final SelenideElement ACCEPT_COOKIES_BUTTON = new UiElement(cssSelector("#hs-eu-cookie-confirmation-button-group")).get();
    public static final SelenideElement SCHEDULE_DEMO_BUTTON = new UiElement(xpath("//span[contains(text(), 'Schedule a demo')]")).get();
    public static final SelenideElement FIRST_NAME_FIELD = new UiElement(cssSelector("input[aria-label='First name']")).get();
    public static final SelenideElement LAST_NAME_FIELD = new UiElement(cssSelector("input[aria-label='Last name']")).get();
    public static final SelenideElement BUSINESS_EMAIL_FIELD = new UiElement(cssSelector("input[kind=email]")).get();
    public static final SelenideElement COMPANY_NAME_FIELD = new UiElement(cssSelector("[data-component='923e77c1-155e-4803-aad9-61a17cc8bac2'] input")).get();
    public static final SelenideElement DEPARTMENT = new UiElement(cssSelector("[aria-label='Department']")).get();
    public static final SelenideElement SELECT_OTHER = new UiElement(cssSelector("[id*=Other]")).get();
    public static final SelenideElement QUESTION = new UiElement(cssSelector("[aria-label='Does your company pay out unused PTO at termination?']")).get();
    public static final SelenideElement NUMBER_OF_EMPLOYERS = new UiElement(cssSelector("[aria-label='Number of Employees']")).get();
    public static final SelenideElement SELECT_NUMBER = new UiElement(cssSelector("[id$='1-100']")).get();
    public static final SelenideElement SELECT_NO = new UiElement(cssSelector("[id*=No]")).get();
    public static final SelenideElement SUBMIT_BUTTON = new UiElement(cssSelector("[type=submit]")).get();
}
