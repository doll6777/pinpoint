package com.navercorp.pinpoint.web.alarm.vo;

import java.util.List;

public class UserGroupMemberPayload {
    
    private String userGroupId;
    private List<UserMember> userMembers;
    
    public UserGroupMemberPayload(String userGroupId, List<UserMember> userMembers) {
        this.userGroupId = userGroupId;
        this.userMembers = userMembers;
    }
    
    public String getUserGroupId() {
        return userGroupId;
    }
    
    public List<UserMember> getUserGroupMembers() {
        return userMembers;
    }
    
    public void setUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
    }
    
    public void setUserGroupMembers(List<UserMember> userMembers) {
        this.userMembers = userMembers;
    }
}
