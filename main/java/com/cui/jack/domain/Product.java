package com.cui.jack.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="c_product")
public class Product {

    @Id
    @GeneratedValue
    @Column(insertable=false,nullable=false,updatable=false)
    private Long id;

    @NotNull
    @Column(name="name",length = 100,nullable=false)
    private String name;

    @NotNull
    @Column(precision = 10,scale = 2,nullable=false)
    private BigDecimal price;

    @NotNull
    @Column(nullable=false)
    private Long userId;

    @Column(nullable=false)
    private Integer storeId;

    @Column(nullable=false)
    private Integer category; // 分类

    @Column(precision = 10,scale = 2)
    private BigDecimal integral; // 积分

    @Column(precision = 10,scale = 2)
    private BigDecimal commission; // 提成佣金

    private Integer companyId;

    private Integer soldNum = 0; // 历史销量
    private Integer clickNum = 0; // 点击数

    @Column(nullable = false, columnDefinition = "tinyint")
    private Integer state = 1;
    private Date insertTime;
    private Date updateTime;
    private Date deleteTime;

    public Product(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getIntegral() {
        return integral;
    }

    public void setIntegral(BigDecimal integral) {
        this.integral = integral;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(Integer soldNum) {
        this.soldNum = soldNum;
    }

    public Integer getClickNum() {
        return clickNum;
    }

    public void setClickNum(Integer clickNum) {
        this.clickNum = clickNum;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }
}
