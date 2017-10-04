package com.example.demo.data;

import com.example.demo.base.AccountTypeEnum;
import com.example.demo.base.StatusEnum;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2017/10/4.
 */
@Entity
@Table(
        name = "account_type_config"
)
public class AccountTypeConfig implements Serializable {
    private static final long serialVersionUID = 1L;




    @Id
    private String id;



    /**
     * 账户类型
     */
    private AccountTypeEnum  accountType;


    /**
     * 充值比例
     */
    private double rechargeRate;

    /**
     * 扣款比例
     */
    private double deductRate;


    /**
     * 状态
     */
    private StatusEnum status;



    /**
     * 入库时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
    }

    public double getRechargeRate() {
        return rechargeRate;
    }

    public void setRechargeRate(double rechargeRate) {
        this.rechargeRate = rechargeRate;
    }

    public double getDeductRate() {
        return deductRate;
    }

    public void setDeductRate(double deductRate) {
        this.deductRate = deductRate;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "AccountTypeConfig{" +
                "id='" + id + '\'' +
                ", accountType=" + accountType +
                ", rechargeRate=" + rechargeRate +
                ", deductRate=" + deductRate +
                ", status=" + status +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
