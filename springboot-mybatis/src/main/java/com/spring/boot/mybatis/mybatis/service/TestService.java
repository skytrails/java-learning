package com.spring.boot.mybatis.mybatis.service;

import com.spring.boot.mybatis.mybatis.dao.TestDao;
import com.spring.boot.mybatis.mybatis.entity.TestEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TestDao testDao ;

    public TestEntity getById(Integer id){
        return testDao.getById(id);
    }
}
