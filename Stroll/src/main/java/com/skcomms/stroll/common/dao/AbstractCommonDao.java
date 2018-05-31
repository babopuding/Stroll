package com.skcomms.stroll.common.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractCommonDao {

	@Autowired
	@Resource
	private SqlSessionTemplate sqlSession;
	
	public Object insert(String queryId, Object parameterObject) {
        return sqlSession.insert(queryId, parameterObject);
    }
	
	public int update(String queryId, Object parameterObject) {
        return sqlSession.update(queryId, parameterObject);
    }
	
	public int delete(String queryId, Object parameterObject) {
        return sqlSession.delete(queryId, parameterObject);
    }
	
    public Object selectList(String queryId, Object parameterObject) {
		return sqlSession.selectList(queryId, parameterObject);
	}
    
    public Object selectOne(String queryId, Object parameterObject) {
		return sqlSession.selectOne(queryId, parameterObject);
	}
	
	
}
