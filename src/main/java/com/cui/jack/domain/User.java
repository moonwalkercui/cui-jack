package com.cui.jack.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

/*
* 这个类就好比是对与数据库表的字段描述一样，程序运行后如果没有这个表，会自动创建出来。
* 一定要有@Entity注释
* 可以加字段验证规则
* */
@Entity
@Table(name="c_user")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @Column(length = 50)
    private String userName;

    @NotNull
    @Column(length = 20 , unique = true)
    private Long mobile;

    @Column(length = 20 , unique = true)
    private String email;

    @NotNull
    @Column(columnDefinition="tinyint")
    private Integer status;

    private String password;
    private String nickname;
    private Integer companyId;
    private Integer departmentId;
    private Date regTime;
    private String regIp;
    private Integer loginNum;

    public User(){}


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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getMobile() {
        return mobile;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
