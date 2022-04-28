package Helper;

public enum Url {

    BASIC_URL("http://localhost/opencart/");

    private final String urlValue;

    Url(String urlValue){
        this.urlValue = urlValue;
    }

    public String getUrlValue(){
        return urlValue;
    }

}