package tests;

import java.util.HashMap;
import java.util.Map;

public class Api013PutTestData {

    public Map<String, Object> expectedDataApi13(String name, String eMail, String password, String title,
                                               Integer birthDate, Integer birthMonth, Integer birthYear,
                                               String firstName, String lastName, String company, String address1,
                                               String address2,String country,Integer zipcode, String state,String city,
                                               Integer mobileNumber) {
        Map<String, Object> expectedData = new HashMap<>();

        if (name != null){
            expectedData.put("name",name);
        }
        if (eMail!= null){
            expectedData.put("eMail",eMail);
        }
        if (password != null ){
            expectedData.put("password", password);
        }
        if (title!= null) {
            expectedData.put("title", title);
        }
        if (birthDate != null){
            expectedData.put("birthDate",birthDate);
        }
        if (birthMonth!= null){
            expectedData.put("birthMonth",birthMonth);
        }
        if (birthYear != null ){
            expectedData.put("birthYear", birthYear);
        }
        if (firstName!= null) {
            expectedData.put("firstName", firstName);
        }
        if (lastName != null){
            expectedData.put("lastName",lastName);
        }
        if (company!= null){
            expectedData.put("company",company);
        }
        if (address1 != null ){
            expectedData.put("address1", address1);
        }
        if (address2 != null ) {
            expectedData.put("address2", address2);
        }
        if (country!= null) {
            expectedData.put("country", country);
        }
        if (zipcode != null){
            expectedData.put("zipcode",zipcode);
        }
        if (state!= null){
            expectedData.put("state",state);
        }
        if (city != null ){
            expectedData.put("city", city);
        }
        if (mobileNumber!= null) {
            expectedData.put("mobileNumber", mobileNumber);
        }

        return expectedData;

    }
}
