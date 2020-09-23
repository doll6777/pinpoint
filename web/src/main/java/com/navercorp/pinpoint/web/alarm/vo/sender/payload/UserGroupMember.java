package com.navercorp.pinpoint.web.alarm.vo.sender.payload;

import java.util.List;

public class UserGroupMember {
    
    private String userGroupId;
    private List<UserMember> userGroupMembers;
    
    public UserGroupMember(String userGroupId, List<UserMember> userGroupMembers) {
        this.userGroupId = userGroupId;
        this.userGroupMembers = userGroupMembers;
    }
    
    public String getUserGroupId() {
        return userGroupId;
    }
    
    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }
    
    public List<UserMember> getUserGroupMembers() {
        return userGroupMembers;
    }
    
    public void setUserGroupMembers(List<UserMember> userGroupMembers) {
        this.userGroupMembers = userGroupMembers;
    }
}
