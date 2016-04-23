package com.cgh.pro.domain;

import java.util.Date;

/**
 * 生产厂家
 * @author chenguanhua
 *
 */
public class Factory {
	
	private String id;//主键映射为id与数据库表不同FACTORY_ID
//	全称
	private String fullName;
//	简称
	private String factoryName;
//	联系人
	private String contacts;
//	电话
	private String phone;
//	手机
	private String mobile;
//	传真
	private String fax;
//	验货员
	private String inspector;
//	排序号
	private Integer orderNo;
//	备注 感觉它可能和关键字冲突，给它加个C前缀
	private String cnote;
//	创建人
	private String createBy;
//	创建部门
	private String createDept;
//	创建时间
	private Date createTime;
	
	public Factory() {}

	public Factory(String id, String fullName, String factoryName, String contacts, String phone, String mobile,
			String fax, String inspector, Integer orderNo, String cnote, String createBy, String createDept,
			Date createTime) {
		this.id = id;
		this.fullName = fullName;
		this.factoryName = factoryName;
		this.contacts = contacts;
		this.phone = phone;
		this.mobile = mobile;
		this.fax = fax;
		this.inspector = inspector;
		this.orderNo = orderNo;
		this.cnote = cnote;
		this.createBy = createBy;
		this.createDept = createDept;
		this.createTime = createTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getFactoryName() {
		return factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}

	public String getContacts() {
		return contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getInspector() {
		return inspector;
	}

	public void setInspector(String inspector) {
		this.inspector = inspector;
	}

	public Integer getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(Integer orderNo) {
		this.orderNo = orderNo;
	}

	public String getCnote() {
		return cnote;
	}

	public void setCnote(String cnote) {
		this.cnote = cnote;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateDept() {
		return createDept;
	}

	public void setCreateDept(String createDept) {
		this.createDept = createDept;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Factory [id=" + id + ", fullName=" + fullName + ", factoryName=" + factoryName + ", contacts="
				+ contacts + ", phone=" + phone + ", mobile=" + mobile + ", fax=" + fax + ", inspector=" + inspector
				+ ", orderNo=" + orderNo + ", cnote=" + cnote + ", createBy=" + createBy + ", createDept=" + createDept
				+ ", createTime=" + createTime + "]";
	}
	
}
