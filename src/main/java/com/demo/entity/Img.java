package com.demo.entity;

public class Img {
    private Integer id;

    private Integer topicid;

    private String imgurl;

    private Integer seq;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTopicid() {
        return topicid;
    }

    public void setTopicid(Integer topicid) {
        this.topicid = topicid;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    @Override
    public String toString() {
        return "Img{" +
                "id=" + id +
                ", topicid=" + topicid +
                ", imgurl='" + imgurl + '\'' +
                ", seq=" + seq +
                '}';
    }
}