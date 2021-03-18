package com.company.jones;

public class EmailContact extends Contact{
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

public void contact(){
    System.out.println("emailing" +this.getName()+ "at "+email);
}


}
