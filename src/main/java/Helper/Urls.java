package Helper;

public enum Urls {

    BASIC_URL("http://localhost/opencart/");

    private final String url;

    Urls(String urlValue){
        this.url = urlValue;
    }

    public String getUrlValue(){
        return url;
    }

}