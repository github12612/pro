package com.cgh.pro.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cgh.pro.dao.FactoryDao;
import com.cgh.pro.domain.Factory;
import com.cgh.pro.pagination.Page;
import com.cgh.pro.service.FactoryService;
@Service
public class FactoryServiceImpl implements FactoryService {
	
	@Resource
	private FactoryDao factoryDao;
	
	@Override
	public List<Factory> findPage(Page page) {
		return factoryDao.findPage(page);
	}

	@Override
	public List<Factory> find(Map paraMap) {
		return factoryDao.find(paraMap);
	}

	@Override
	public Factory get(Serializable id) {
		return factoryDao.get(id);
	}

	@Override
	public void insert(Factory entity) {
		entity.setId(UUID.randomUUID().toString());
		factoryDao.insert(entity);
	}

	@Override
	public void update(Factory entity) {
		factoryDao.update(entity);
	}

	@Override
	public void deleteById(Serializable id) {
		factoryDao.deleteById(id);
	}

	@Override
	public void delete(Serializable[] ids) {
		factoryDao.delete(ids);
	}

}
