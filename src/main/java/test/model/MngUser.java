package test.model;

import java.util.Date;

public class MngUser {
    private String userName;

    private String password;

    private String roleType;

    private String realName;

    private String mobile;

    private String email;

    private String status;

    private String comments;

    private Long lastFailCount;

    private Date lastFailDt;

    private String lastFailIp;

    private Date lastSuccDt;

    private String lastSuccIp;

    private String lastUpdatedUserName;

    private String createdUserName;

    private Date lastUpdatedStamp;

    private Date createdStamp;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? null : roleType.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public Long getLastFailCount() {
        return lastFailCount;
    }

    public void setLastFailCount(Long lastFailCount) {
        this.lastFailCount = lastFailCount;
    }

    public Date getLastFailDt() {
        return lastFailDt;
    }

    public void setLastFailDt(Date lastFailDt) {
        this.lastFailDt = lastFailDt;
    }

    public String getLastFailIp() {
        return lastFailIp;
    }

    public void setLastFailIp(String lastFailIp) {
        this.lastFailIp = lastFailIp == null ? null : lastFailIp.trim();
    }

    public Date getLastSuccDt() {
        return lastSuccDt;
    }

    public void setLastSuccDt(Date lastSuccDt) {
        this.lastSuccDt = lastSuccDt;
    }

    public String getLastSuccIp() {
        return lastSuccIp;
    }

    public void setLastSuccIp(String lastSuccIp) {
        this.lastSuccIp = lastSuccIp == null ? null : lastSuccIp.trim();
    }

    public String getLastUpdatedUserName() {
        return lastUpdatedUserName;
    }

    public void setLastUpdatedUserName(String lastUpdatedUserName) {
        this.lastUpdatedUserName = lastUpdatedUserName == null ? null : lastUpdatedUserName.trim();
    }

    public String getCreatedUserName() {
        return createdUserName;
    }

    public void setCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName == null ? null : createdUserName.trim();
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }
}