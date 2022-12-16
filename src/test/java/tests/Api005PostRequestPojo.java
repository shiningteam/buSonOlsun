package tests;


public class Api005PostRequestPojo {
    private String ResponseJSON;
    private int ResponseCode;

    public String getResponseJSON() {
        return ResponseJSON;
    }

    public void setResponseJSON(String responseJSON) {
        ResponseJSON = responseJSON;
    }

    public int getResponseCode() {
        return ResponseCode;
    }

    public void setResponseCode(int responseCode) {
        ResponseCode = responseCode;
    }

    public Api005PostRequestPojo() {

    }

    public Api005PostRequestPojo(String responseJSON, int responseCode) {
        ResponseJSON = responseJSON;
        ResponseCode = responseCode;
    }

    @Override
    public String toString() {
        return "Pojo_05{" +
                "ResponseJSON='" + ResponseJSON + '\'' +
                ", ResponseCode=" + ResponseCode +
                '}';
    }
}
