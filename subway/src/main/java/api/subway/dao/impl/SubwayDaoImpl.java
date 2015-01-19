package api.subway.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import api.subway.dao.SubwayDao;
import api.subway.model.Station;

@Component(value="subwayDao")
public class SubwayDaoImpl implements SubwayDao {
	
	//protected Logger logger = LoggerFactory.getLogger(this.getClass());
	protected Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private SqlSession sqlSession;
	
	public Station getStationByLine(String queryString) {
		Station outputs = (Station)sqlSession.selectOne("station.mapper.getStationByName", queryString);

		return outputs;
	}

	public Station getStationByName(String queryString) {
		Station outputs = (Station)sqlSession.selectOne("station.mapper.getStationByName", queryString);

		return outputs;
	}
	
	public List<Station> getStationListByName(String stationName) {
		List<Station> outputs = sqlSession.selectList("station.mapper.getStationListByName", stationName);

		return outputs;
	}

	public List<Station> getStationListByLine(String lineName) {
		// TODO Auto-generated method stub
		List<Station> outputs = sqlSession.selectList("station.mapper.getStationListByLine", lineName);

		return outputs;
	}
	
}
