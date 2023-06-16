import org.junit.jupiter.api.Test;
import responseModel.WeatherModel;

public class DemoTests extends TestBase{

    @Test
    public void sorbetTest(){
        openUrl();
        web.clickScheduleDemoButton();
        web.onCalendlyPage()
                .fillForm()
                .submit();
    }

    @Test
    public void weatherTest(){
        WeatherModel weatherInMinsk = api.getWeatherInMinsk();
        api.verifyCity(weatherInMinsk);
    }
}
