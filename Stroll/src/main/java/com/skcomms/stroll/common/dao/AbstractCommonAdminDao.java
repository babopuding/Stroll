package com.skcomms.stroll.common.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class AbstractCommonAdminDao {

	@Autowired
	@Qualifier("sqlSession_admin")
	private SqlSession sqlSession;
	
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
