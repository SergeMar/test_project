public class TestBase {
    WebBot web = new WebBot();
    ApiBot api = new ApiBot();

    public void openUrl() {
        BrowserManager.navigateTo(WebParams.URL);
        web.acceptCookies();
    }
}
