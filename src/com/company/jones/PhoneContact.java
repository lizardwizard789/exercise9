package com.company.jones;

public class PhoneContact extends Contact{
    String phone;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
public void contact(){
    System.out.println("calling "+this.getName()+ "at "+phone);
}



}
