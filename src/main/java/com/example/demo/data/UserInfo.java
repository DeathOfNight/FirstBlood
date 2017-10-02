package com.example.demo.data;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(
        name = "user_info"
)
public class UserInfo  {

    /**
     * 会员ID
     */
    @Id
   private String id;
    /**
     * 会员姓名
     */

    private String name ;
    /**
     * 会员手机号
     */

    private String phone;


    /**
     * 会员年龄
     */
    private int age;


    /**
     * 会员性别
     */
    private String sex;


    /**
     * 会员注册时间
     * @return
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;


    /**
     * 备注
     * @return
     */

    private String remark;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", createTime=" + createTime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
