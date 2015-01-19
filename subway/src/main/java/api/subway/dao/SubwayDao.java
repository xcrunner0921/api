package api.subway.dao;

import java.util.List;

import api.subway.model.Station;

public interface SubwayDao {
	public Station getStationByLine(String lineId);
	
	public Station getStationByName(String stationName);
	
	public List<Station> getStationListByLine(String stationName);
	
	public List<Station> getStationListByName(String stationName);
}
