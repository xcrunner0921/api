package api.subway.dao;

import org.apache.ibatis.session.SqlSession;

public interface ApiDao {
	public void setSqlSession(SqlSession sqlSession);

	//public User getUser(String userId);
}
