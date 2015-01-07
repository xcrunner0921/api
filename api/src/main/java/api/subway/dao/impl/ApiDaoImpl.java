package api.subway.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import api.subway.dao.ApiDao;

public class ApiDaoImpl implements ApiDao {
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	public Object selectOne(String queryId, Object obj) {
		return (Object) sqlSession.selectOne(queryId, obj);
	}
	
	public List<Object> selectList(String queryId, Object obj) {
		return (List<Object>) sqlSession.selectList(queryId, obj);
	}
	
	public int delete(String queryId, Object obj) {
		return sqlSession.delete(queryId, obj);
	}
	
	public int update(String queryId, Object obj) {
		return sqlSession.update(queryId, obj);
	}
	
	public int insert(String queryId, Object obj) {
		return sqlSession.insert(queryId, obj);
	}

}