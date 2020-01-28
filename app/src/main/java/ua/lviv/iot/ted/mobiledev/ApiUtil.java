package ua.lviv.iot.ted.mobiledev;

public class ApiUtil {
    private static final String BASE_URL = "https://us-central1-mobile-69d73.cloudfunctions.net/app/api/";

    public static JSONPlaceHolder getServiceClass(){
        return RetrofitAPI.getRetrofit(BASE_URL).create(JSONPlaceHolder.class);
    }
}
