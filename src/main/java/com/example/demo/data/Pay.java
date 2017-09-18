package com.example.demo.data;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Administrator on 2017/9/9 0009.
 */

@Entity
@Table(
        name = "p_pay"
)
public class Pay implements Serializable{


        private static final long serialVersionUID = 1L;
        @Id
        private String id;
        private String tradeNo;
        private String institution;
        private String institutionVersion;
        private String apiVersion;
        private String requestId;
        private String requestNo;
        private String businessPayNo;
        private Date requestTime;
        private Date bespeakDate;
        private BigDecimal tradeAmount;
        private String use;
        private String businessType;
        private String subbusinessType;
        private String subMerchantNo;
        private String subMerchentName;
        private String orderNote;
        private String instOrderId;
        private String crmNo;
        private String payeeCardNo;
        private String payeeName;
        private String certNo;
        private String certNoBreviary;
        private String mobile;
        private String mobileBreviary;
        private String openingBank;
        private String openingBankCode;
        private String openingBankEgCode;
        private String openingBankInfo;
        private BigDecimal tradeExpenses;
        private String openingBankProvince;
        private String openingBankCity;
        private String openingBankBranch;
        private String bankUnionCode;
        @DateTimeFormat(
                pattern = "yyyy-MM-dd"
        )
        private Date validDate;
        private String cvv2;
        private String cardBreviary;
        private String interId;
        private String payIp;
        private String tradeFrontIp;
        private Date expectedExeTime;
        private Date createdTime;
        private Date updatedTime;
        private Date bankFinishTime;
        private String desVersion;
        private String bankOrderNo;
        private String bankBackNo;
        private Date tradeTime;
        private String acquirerMerchantNo;
        private String errorCode;
        private String errorDesc;
        private String batchId;
        private Date lastRepairTime;
        private Date nextRepairTime;
        private String repairErrorCode;
        private String repairErrorDesc;
        private String repairFrontIp;
        private String remark;
        private String checkId;
        private String checkTaskId;
        private BigDecimal origPrcp;
        private Date shouldTransTime;

        private String signProNo;
        private String launchActNo;
        private String launchActType;
        private String middleActNo;
        private String middleActType;
        private String bankActNo;
        private String bankActType;

        private String acTransNo;
        private String acRtnCode;
        private String acRtnDesc;
        private String subBizType;
        private String voucherType;
        private String assCheckCode;
        private String controlValue;

        public Pay() {
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTradeNo() {
            return tradeNo;
        }

        public void setTradeNo(String tradeNo) {
            this.tradeNo = tradeNo;
        }

        public String getInstitution() {
            return institution;
        }

        public void setInstitution(String institution) {
            this.institution = institution;
        }

        public String getInstitutionVersion() {
            return institutionVersion;
        }

        public void setInstitutionVersion(String institutionVersion) {
            this.institutionVersion = institutionVersion;
        }

        public String getApiVersion() {
            return apiVersion;
        }

        public void setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
        }

        public String getRequestId() {
            return requestId;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        public String getRequestNo() {
            return requestNo;
        }

        public void setRequestNo(String requestNo) {
            this.requestNo = requestNo;
        }

        public String getBusinessPayNo() {
            return businessPayNo;
        }

        public void setBusinessPayNo(String businessPayNo) {
            this.businessPayNo = businessPayNo;
        }

        public Date getRequestTime() {
            return requestTime;
        }

        public void setRequestTime(Date requestTime) {
            this.requestTime = requestTime;
        }

        public Date getBespeakDate() {
            return bespeakDate;
        }

        public void setBespeakDate(Date bespeakDate) {
            this.bespeakDate = bespeakDate;
        }

        public BigDecimal getTradeAmount() {
            return tradeAmount;
        }

        public void setTradeAmount(BigDecimal tradeAmount) {
            this.tradeAmount = tradeAmount;
        }

        public String getUse() {
            return use;
        }

        public void setUse(String use) {
            this.use = use;
        }

        public String getBusinessType() {
            return businessType;
        }

        public void setBusinessType(String businessType) {
            this.businessType = businessType;
        }

        public String getSubbusinessType() {
            return subbusinessType;
        }

        public void setSubbusinessType(String subbusinessType) {
            this.subbusinessType = subbusinessType;
        }

        public String getSubMerchantNo() {
            return subMerchantNo;
        }

        public void setSubMerchantNo(String subMerchantNo) {
            this.subMerchantNo = subMerchantNo;
        }

        public String getSubMerchentName() {
            return subMerchentName;
        }

        public void setSubMerchentName(String subMerchentName) {
            this.subMerchentName = subMerchentName;
        }

        public String getOrderNote() {
            return orderNote;
        }

        public void setOrderNote(String orderNote) {
            this.orderNote = orderNote;
        }

        public String getInstOrderId() {
            return instOrderId;
        }

        public void setInstOrderId(String instOrderId) {
            this.instOrderId = instOrderId;
        }

        public String getCrmNo() {
            return crmNo;
        }

        public void setCrmNo(String crmNo) {
            this.crmNo = crmNo;
        }

        public String getPayeeCardNo() {
            return payeeCardNo;
        }

        public void setPayeeCardNo(String payeeCardNo) {
            this.payeeCardNo = payeeCardNo;
        }

        public String getPayeeName() {
            return payeeName;
        }

        public void setPayeeName(String payeeName) {
            this.payeeName = payeeName;
        }

        public String getCertNo() {
            return certNo;
        }

        public void setCertNo(String certNo) {
            this.certNo = certNo;
        }

        public String getCertNoBreviary() {
            return certNoBreviary;
        }

        public void setCertNoBreviary(String certNoBreviary) {
            this.certNoBreviary = certNoBreviary;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getMobileBreviary() {
            return mobileBreviary;
        }

        public void setMobileBreviary(String mobileBreviary) {
            this.mobileBreviary = mobileBreviary;
        }

        public String getOpeningBank() {
            return openingBank;
        }

        public void setOpeningBank(String openingBank) {
            this.openingBank = openingBank;
        }

        public String getOpeningBankCode() {
            return openingBankCode;
        }

        public void setOpeningBankCode(String openingBankCode) {
            this.openingBankCode = openingBankCode;
        }

        public String getOpeningBankEgCode() {
            return openingBankEgCode;
        }

        public void setOpeningBankEgCode(String openingBankEgCode) {
            this.openingBankEgCode = openingBankEgCode;
        }

        public String getOpeningBankInfo() {
            return openingBankInfo;
        }

        public void setOpeningBankInfo(String openingBankInfo) {
            this.openingBankInfo = openingBankInfo;
        }

        public BigDecimal getTradeExpenses() {
            return tradeExpenses;
        }

        public void setTradeExpenses(BigDecimal tradeExpenses) {
            this.tradeExpenses = tradeExpenses;
        }

        public String getOpeningBankProvince() {
            return openingBankProvince;
        }

        public void setOpeningBankProvince(String openingBankProvince) {
            this.openingBankProvince = openingBankProvince;
        }

        public String getOpeningBankCity() {
            return openingBankCity;
        }

        public void setOpeningBankCity(String openingBankCity) {
            this.openingBankCity = openingBankCity;
        }

        public String getOpeningBankBranch() {
            return openingBankBranch;
        }

        public void setOpeningBankBranch(String openingBankBranch) {
            this.openingBankBranch = openingBankBranch;
        }

        public String getBankUnionCode() {
            return bankUnionCode;
        }

        public void setBankUnionCode(String bankUnionCode) {
            this.bankUnionCode = bankUnionCode;
        }

        public Date getValidDate() {
            return validDate;
        }

        public void setValidDate(Date validDate) {
            this.validDate = validDate;
        }

        public String getCvv2() {
            return cvv2;
        }

        public void setCvv2(String cvv2) {
            this.cvv2 = cvv2;
        }

        public String getCardBreviary() {
            return cardBreviary;
        }

        public void setCardBreviary(String cardBreviary) {
            this.cardBreviary = cardBreviary;
        }

        public String getInterId() {
            return interId;
        }

        public void setInterId(String interId) {
            this.interId = interId;
        }

        public String getPayIp() {
            return payIp;
        }

        public void setPayIp(String payIp) {
            this.payIp = payIp;
        }

        public String getTradeFrontIp() {
            return tradeFrontIp;
        }

        public void setTradeFrontIp(String tradeFrontIp) {
            this.tradeFrontIp = tradeFrontIp;
        }

        public Date getExpectedExeTime() {
            return expectedExeTime;
        }

        public void setExpectedExeTime(Date expectedExeTime) {
            this.expectedExeTime = expectedExeTime;
        }

        public Date getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(Date createdTime) {
            this.createdTime = createdTime;
        }

        public Date getUpdatedTime() {
            return updatedTime;
        }

        public void setUpdatedTime(Date updatedTime) {
            this.updatedTime = updatedTime;
        }

        public Date getBankFinishTime() {
            return bankFinishTime;
        }

        public void setBankFinishTime(Date bankFinishTime) {
            this.bankFinishTime = bankFinishTime;
        }

        public String getDesVersion() {
            return desVersion;
        }

        public void setDesVersion(String desVersion) {
            this.desVersion = desVersion;
        }

        public String getBankOrderNo() {
            return bankOrderNo;
        }

        public void setBankOrderNo(String bankOrderNo) {
            this.bankOrderNo = bankOrderNo;
        }

        public String getBankBackNo() {
            return bankBackNo;
        }

        public void setBankBackNo(String bankBackNo) {
            this.bankBackNo = bankBackNo;
        }

        public Date getTradeTime() {
            return tradeTime;
        }

        public void setTradeTime(Date tradeTime) {
            this.tradeTime = tradeTime;
        }

        public String getAcquirerMerchantNo() {
            return acquirerMerchantNo;
        }

        public void setAcquirerMerchantNo(String acquirerMerchantNo) {
            this.acquirerMerchantNo = acquirerMerchantNo;
        }

        public String getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(String errorCode) {
            this.errorCode = errorCode;
        }

        public String getErrorDesc() {
            return errorDesc;
        }

        public void setErrorDesc(String errorDesc) {
            this.errorDesc = errorDesc;
        }

        public String getBatchId() {
            return batchId;
        }

        public void setBatchId(String batchId) {
            this.batchId = batchId;
        }

        public Date getLastRepairTime() {
            return lastRepairTime;
        }

        public void setLastRepairTime(Date lastRepairTime) {
            this.lastRepairTime = lastRepairTime;
        }

        public Date getNextRepairTime() {
            return nextRepairTime;
        }

        public void setNextRepairTime(Date nextRepairTime) {
            this.nextRepairTime = nextRepairTime;
        }

        public String getRepairErrorCode() {
            return repairErrorCode;
        }

        public void setRepairErrorCode(String repairErrorCode) {
            this.repairErrorCode = repairErrorCode;
        }

        public String getRepairErrorDesc() {
            return repairErrorDesc;
        }

        public void setRepairErrorDesc(String repairErrorDesc) {
            this.repairErrorDesc = repairErrorDesc;
        }

        public String getRepairFrontIp() {
            return repairFrontIp;
        }

        public void setRepairFrontIp(String repairFrontIp) {
            this.repairFrontIp = repairFrontIp;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getCheckId() {
            return checkId;
        }

        public void setCheckId(String checkId) {
            this.checkId = checkId;
        }

        public String getCheckTaskId() {
            return checkTaskId;
        }

        public void setCheckTaskId(String checkTaskId) {
            this.checkTaskId = checkTaskId;
        }

        public BigDecimal getOrigPrcp() {
            return origPrcp;
        }

        public void setOrigPrcp(BigDecimal origPrcp) {
            this.origPrcp = origPrcp;
        }

        public Date getShouldTransTime() {
            return shouldTransTime;
        }

        public void setShouldTransTime(Date shouldTransTime) {
            this.shouldTransTime = shouldTransTime;
        }

        public String getSignProNo() {
            return signProNo;
        }

        public void setSignProNo(String signProNo) {
            this.signProNo = signProNo;
        }

        public String getLaunchActNo() {
            return launchActNo;
        }

        public void setLaunchActNo(String launchActNo) {
            this.launchActNo = launchActNo;
        }

        public String getLaunchActType() {
            return launchActType;
        }

        public void setLaunchActType(String launchActType) {
            this.launchActType = launchActType;
        }

        public String getMiddleActNo() {
            return middleActNo;
        }

        public void setMiddleActNo(String middleActNo) {
            this.middleActNo = middleActNo;
        }

        public String getMiddleActType() {
            return middleActType;
        }

        public void setMiddleActType(String middleActType) {
            this.middleActType = middleActType;
        }

        public String getBankActNo() {
            return bankActNo;
        }

        public void setBankActNo(String bankActNo) {
            this.bankActNo = bankActNo;
        }

        public String getBankActType() {
            return bankActType;
        }

        public void setBankActType(String bankActType) {
            this.bankActType = bankActType;
        }

        public String getAcTransNo() {
            return acTransNo;
        }

        public void setAcTransNo(String acTransNo) {
            this.acTransNo = acTransNo;
        }

        public String getAcRtnCode() {
            return acRtnCode;
        }

        public void setAcRtnCode(String acRtnCode) {
            this.acRtnCode = acRtnCode;
        }

        public String getAcRtnDesc() {
            return acRtnDesc;
        }

        public void setAcRtnDesc(String acRtnDesc) {
            this.acRtnDesc = acRtnDesc;
        }

        public String getSubBizType() {
            return subBizType;
        }

        public void setSubBizType(String subBizType) {
            this.subBizType = subBizType;
        }

        public String getVoucherType() {
            return voucherType;
        }

        public void setVoucherType(String voucherType) {
            this.voucherType = voucherType;
        }

        public String getAssCheckCode() {
            return assCheckCode;
        }

        public void setAssCheckCode(String assCheckCode) {
            this.assCheckCode = assCheckCode;
        }

        public String getControlValue() {
            return controlValue;
        }

        public void setControlValue(String controlValue) {
            this.controlValue = controlValue;
        }
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.JSON_STYLE);
    }
    }
