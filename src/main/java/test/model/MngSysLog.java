package test.model;

import java.util.Date;

public class MngSysLog {
    private Short logId;

    private String userName;

    private String operateType;

    private String method;

    private String methodCn;

    private String methodType;

    private String param;

    private String paramCn;

    private String status;

    private String result;

    private String uri;

    private Short costTime;

    private String ip;

    private Date createDate;

    public Short getLogId() {
        return logId;
    }

    public void setLogId(Short logId) {
        this.logId = logId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType == null ? null : operateType.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getMethodCn() {
        return methodCn;
    }

    public void setMethodCn(String methodCn) {
        this.methodCn = methodCn == null ? null : methodCn.trim();
    }

    public String getMethodType() {
        return methodType;
    }

    public void setMethodType(String methodType) {
        this.methodType = methodType == null ? null : methodType.trim();
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param == null ? null : param.trim();
    }

    public String getParamCn() {
        return paramCn;
    }

    public void setParamCn(String paramCn) {
        this.paramCn = paramCn == null ? null : paramCn.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    public Short getCostTime() {
        return costTime;
    }

    public void setCostTime(Short costTime) {
        this.costTime = costTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}