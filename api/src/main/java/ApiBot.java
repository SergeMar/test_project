import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import responseModel.WeatherModel;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiBot {

    public WeatherModel getWeatherInMinsk() {
        Response response = given()
                .param("lat",ApiParams.lat)
                .param("lon", ApiParams.lon)
                .param("appid", ApiParams.apiKey)
                .baseUri(ApiParams.apiUrl)
                .contentType(ContentType.JSON)
                .when()
                .get();

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.SC_OK);
        return response.then()
                .extract().as(WeatherModel.class);
    }

    public void verifyCity(WeatherModel weatherInCity) {
        assertThat(weatherInCity.getName()).isEqualTo(ApiParams.MINSK_CITY);
    }
}
