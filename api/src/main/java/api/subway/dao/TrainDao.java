package api.subway.dao;

public interface TrainDao {
	String getTrainByName(String trainName);
	String getTrainListByLine(String lineId);
}
