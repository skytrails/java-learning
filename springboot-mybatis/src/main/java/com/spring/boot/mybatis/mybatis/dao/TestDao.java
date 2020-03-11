package com.spring.boot.mybatis.mybatis.dao;

import com.spring.boot.mybatis.mybatis.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {

    TestEntity getById(Integer id);

}
