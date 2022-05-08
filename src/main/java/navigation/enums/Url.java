package navigation.enums;

public enum Url {

    BASIC_URL("http://localhost/opencart/upload/index.php");

    private final String urlValue;

    Url(String urlValue){

        this.urlValue = urlValue;
    }

    public String getUrlValue(){

        return urlValue;
    }

}