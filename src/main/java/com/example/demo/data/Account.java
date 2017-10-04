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
        name = "account"
)
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 会员号
     */
    @Id
    private String id;

    /**
     * 手机号
     */
    private String phone;


    /**
     * 账户类型
     */
    private AccountTypeEnum  accountType;

    /**
     * 总金额
     */

    private BigDecimal totalAmt;

    /**
     * 可用金额
     */
    private BigDecimal viableAmt;

    /**
     * 冻结金额
     */
    private BigDecimal freezedAmt;


    /**
     * 状态
     */
    private StatusEnum status;


    /**
     * 账户安全校验值
     */

    private String safeValue;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
    }

    public BigDecimal getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(BigDecimal totalAmt) {
        this.totalAmt = totalAmt;
    }

    public BigDecimal getViableAmt() {
        return viableAmt;
    }

    public void setViableAmt(BigDecimal viableAmt) {
        this.viableAmt = viableAmt;
    }

    public BigDecimal getFreezedAmt() {
        return freezedAmt;
    }

    public void setFreezedAmt(BigDecimal freezedAmt) {
        this.freezedAmt = freezedAmt;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getSafeValue() {
        return safeValue;
    }

    public void setSafeValue(String safeValue) {
        this.safeValue = safeValue;
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
        return "Account{" +
                "id='" + id + '\'' +
                ", accountType=" + accountType +
                ", totalAmt=" + totalAmt +
                ", viableAmt=" + viableAmt +
                ", freezedAmt=" + freezedAmt +
                ", status=" + status +
                ", safeValue='" + safeValue + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", remark='" + remark + '\'' +
                '}';
    }
}
