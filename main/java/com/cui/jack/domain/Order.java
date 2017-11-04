package com.cui.jack.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="c_order")
public class Order {

    @Id
    @Column(insertable = false, nullable = false, updatable = false)
    @GeneratedValue
    private Long id;

    @Column(length = 30, unique = true, nullable = false)
    private String sn;

    @Column(nullable = false)
    private Integer storeId;

    private String payment;

    @Column(nullable = false)
    private Long customerId; // 顾客id

    @Column(precision = 10, scale = 2,nullable = false)
    private BigDecimal totalMoney; // 总价

    @Column(precision = 10, scale = 2,nullable = false)
    private BigDecimal productMoney; // 商品价格

    @Column(precision = 10, scale = 2)
    private BigDecimal expressMoney; // 快递费用

    private BigDecimal totalIntegral; // 订单积分

    private Integer state;

    private Date insertTime;

    private Date payTime;

    private Date cancelTime;

    private String cancelReason;

    private Date expressTime;

    private Date finishTime;
    private Date deleteTime;

    @Column(nullable = false, columnDefinition = "tinyint")
    private Integer isRefund = 0; // 是否退

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public BigDecimal getProductMoney() {
        return productMoney;
    }

    public void setProductMoney(BigDecimal productMoney) {
        this.productMoney = productMoney;
    }

    public BigDecimal getExpressMoney() {
        return expressMoney;
    }

    public void setExpressMoney(BigDecimal expressMoney) {
        this.expressMoney = expressMoney;
    }

    public BigDecimal getTotalIntegral() {
        return totalIntegral;
    }

    public void setTotalIntegral(BigDecimal totalIntegral) {
        this.totalIntegral = totalIntegral;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getCancelReason() {
        return cancelReason;
    }

    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    public Date getExpressTime() {
        return expressTime;
    }

    public void setExpressTime(Date expressTime) {
        this.expressTime = expressTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Integer getIsRefund() {
        return isRefund;
    }

    public void setIsRefund(Integer isRefund) {
        this.isRefund = isRefund;
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}
