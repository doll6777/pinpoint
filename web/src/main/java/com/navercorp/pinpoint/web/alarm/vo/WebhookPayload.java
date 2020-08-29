package com.navercorp.pinpoint.web.alarm.vo;

import com.navercorp.pinpoint.web.alarm.checker.AlarmChecker;
import com.navercorp.pinpoint.web.batch.BatchConfiguration;
import com.navercorp.pinpoint.web.vo.UserGroupMember;

import java.util.List;

public class WebhookPayload {
    
    private String pinpointUrl;
    private String batchEnv;
    private Integer sequenceCount;
    private String applicationId;
    private String checkerName;
    private Integer threshold;
    private String notes;
    private String checkerType;
    private CheckerValue checkerValue;
    private List<UserGroupMember> userGroupMembers;
    
    public WebhookPayload(AlarmChecker checker, BatchConfiguration batchConfiguration, int sequenceCount) {
        this.pinpointUrl = batchConfiguration.getPinpointUrl();
        this.batchEnv = batchConfiguration.getBatchEnv();
        this.sequenceCount = sequenceCount;
        this.applicationId = checker.getRule().getApplicationId();
        this.checkerName = checker.getRule().getCheckerName();
        this.threshold = checker.getRule().getThreshold();
        this.notes = checker.getRule().getNotes();
        this.checkerType = checker.getCheckerType();
        this.checkerValue = checker.getCheckerValue();
    }
    
    public void setUserGroupMembers(List<UserGroupMember> userGroupMembers) {
        this.userGroupMembers = userGroupMembers;
    }
    
    public List<UserGroupMember> getUserGroupMembers() {
        return userGroupMembers;
    }
    
    public String getPinpointUrl() {
        return pinpointUrl;
    }
    
    public String getCheckerType() {
        return checkerType;
    }
    
    public String getBatchEnv() {
        return batchEnv;
    }
    
    public Integer getSequenceCount() {
        return sequenceCount;
    }
    
    public String getApplicationId() {
        return applicationId;
    }
    
    public String getCheckerName() {
        return checkerName;
    }
    
    public Integer getThreshold() {
        return threshold;
    }
    
    public String getNotes() {
        return notes;
    }
    
    public CheckerValue getCheckerValue() {
        return checkerValue;
    }
}
