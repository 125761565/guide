package com.guide.entity;

public class Goods {
    private Integer id;

    private String type;

    private String name;

    private String picurl;

    private String desc;

    private String url;

    private Double pice;

    private Double discountpice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl == null ? null : picurl.trim();
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Double getPice() {
        return pice;
    }

    public void setPice(Double pice) {
        this.pice = pice;
    }

    public Double getDiscountpice() {
        return discountpice;
    }

    public void setDiscountpice(Double discountpice) {
        this.discountpice = discountpice;
    }
}