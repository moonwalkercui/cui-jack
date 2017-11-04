package com.cui.jack.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "c_cusomer")
public class Customer {

    @Id
    @GeneratedValue
    @Column(insertable = false, nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false,unique = true)
    private String phone;

    @Column(nullable = false)
    private String name;

    private String address;

    @Column(nullable = false)
    private Integer storeId;

    @Column(nullable = false)
    private Long editor;

    private Date insertTime;

    private Date updateTime;

    private Date deleteTime;

    public Customer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Long getEditor() {
        return editor;
    }

    public void setEditor(Long editor) {
        this.editor = editor;
    }
}
