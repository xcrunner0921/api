package api.subway.dao;

public interface StationDao {
	String getStationByName(String stationName);
	String getStationListByLine(String stationId);
}
