package com.cgh.pro.dao.impl;

import org.springframework.stereotype.Repository;

import com.cgh.pro.dao.FactoryDao;
import com.cgh.pro.domain.Factory;
@Repository
public class FactoryDaoImpl extends BaseDaoImpl<Factory> implements FactoryDao {
//构造方法初始化ns属性
	public FactoryDaoImpl() {
		super.setNs("com.cgh.pro.mapper.FactoryMapper");
	}
	
}
