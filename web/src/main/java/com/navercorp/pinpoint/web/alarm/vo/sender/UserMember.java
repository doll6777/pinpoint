package com.navercorp.pinpoint.web.alarm.vo.sender;

public class UserMember {

    private String memberId;
    private String name;
    private String email;
    private String department;
    private String phoneNumber;
    private int phoneCountryCode;
    
    public String getMemberId() {
        return memberId;
    }
    
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public int getPhoneCountryCode() {
        return phoneCountryCode;
    }
    
    public void setPhoneCountryCode(int phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }
}
