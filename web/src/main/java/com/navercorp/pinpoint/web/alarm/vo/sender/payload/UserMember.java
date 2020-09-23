package com.navercorp.pinpoint.web.alarm.vo.sender.payload;

import com.navercorp.pinpoint.web.vo.User;

public class UserMember {

    private String memberId;
    private String name;
    private String email;
    private String department;
    private String phoneNumber;
    private int phoneCountryCode;
    
    public UserMember() {
    }
    
    public static UserMember from(User user) {
        UserMember userMember = new UserMember();
        userMember.memberId = user.getUserId();
        userMember.name = user.getName();
        userMember.email = user.getEmail();
        userMember.department = user.getDepartment();
        userMember.phoneNumber = user.getPhoneNumber();
        userMember.phoneCountryCode = user.getPhoneCountryCode();
        return userMember;
    }
    
    public String getMemberId() {
        return memberId;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public int getPhoneCountryCode() {
        return phoneCountryCode;
    }
}
