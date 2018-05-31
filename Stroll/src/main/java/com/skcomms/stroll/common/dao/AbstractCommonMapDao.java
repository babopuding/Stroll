package com.skcomms.stroll.common.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class AbstractCommonMapDao {

	@Autowired
	@Qualifier("sqlSession_map")
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
    
    public Object selectList(String queryId) {
		return sqlSession.selectList(queryId);
	}
    
    public Object selectOne(String queryId, Object parameterObject) {
		return sqlSession.selectOne(queryId, parameterObject);
	}
    
    public Object selectOne(String queryId) {
		return sqlSession.selectOne(queryId);
	}
    
    @SuppressWarnings("unused")
	private long countByParam(String queryId, Object parameterObject) throws Exception {
		Object resultObj = sqlSession.selectOne(queryId, parameterObject);
		if(resultObj instanceof Number){
			Number number = (Number) resultObj;
			return number.longValue();
		}else{
			throw new IllegalArgumentException(
					String.format("Wrong resultClass type(%s) with queryId:%s, resultClass must be subclass of java.lang.Number",
							resultObj.getClass().getName(),
							queryId));
		}
	}
	
}
