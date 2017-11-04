package com.cui.jack.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


/*
* 这个类就好比是对与数据库表的字段描述一样，程序运行后如果没有这个表，会自动创建出来。
* 一定要有@Entity注释
* 可以加字段验证规则
* */
@Entity
@Table(name = "c_user")
public class User {

    @Id
    @GeneratedValue
    @Column(insertable = false, nullable = false, updatable = false)
    private Long id;

    private Long referrer_id; // 推荐人id

    @NotNull
    @Column(length = 11, unique = true, nullable = false, updatable = false)
    private String mobile;

    @Column(length = 50)
    private String userName;

    @Column(length = 60)
    private String wxOpenId;

    @Column(length = 20, columnDefinition = "tinyint",nullable=false)
    private String userType = "normal";

    private Integer storeId;

    @NotNull
    @Column(columnDefinition = "tinyint",nullable=false)
    private Integer state = 1;

    private String photo;

    @Column(length = 20, unique = true)
    private String email;
    private String password;
    @Column(length = 30)
    private String nickname;
    private Integer companyId;
    private Integer departmentId;
    private Date regTime;
    @Column(length = 20)
    private String regIp;
    private Integer loginNum;
    @Column(length = 20)
    private String lastLoginIp;
    private Date lastLoginTime;

    public User() {
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Long getReferrer_id() {
        return referrer_id;
    }

    public void setReferrer_id(Long referrer_id) {
        this.referrer_id = referrer_id;
    }

    public String getWxOpenId() {
        return wxOpenId;
    }

    public void setWxOpenId(String wxOpenId) {
        this.wxOpenId = wxOpenId;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    public Integer getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}
