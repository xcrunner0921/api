package api.subway.dao.impl;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import api.subway.dao.SubwayDao;

@Component
public class SubwayDaoImpl implements SubwayDao {
	@Autowired
	private SqlSession sqlSession;

	public String getStationByName(String name) {
		String outputs = (String)sqlSession.selectOne("station.mapper.getStationByName", name);

		return outputs;
	}
	
//	public String getStationListByName() {
//		HashMap<String, String> input = new HashMap<String, String>();
//		input.put("code", "AIA");
//
//		List<HashMap<String, String>> outputs = sqlSession.selectList("SqlSampleMapper.selectSample", input);
//
//		return outputs.toString();
//	}
}
