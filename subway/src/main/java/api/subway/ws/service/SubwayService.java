package api.subway.ws.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.ws.rs.core.PathSegment;

import api.subway.model.Station;


@WebService
public interface SubwayService {
	
	@WebMethod
	public int printServiceNum(int num);
	
	@WebMethod
	public String keyLogin(String key);
	
	@WebMethod
    public List trains(Long customerId, 
                         Long orderId,
                         String searchString,
                         List<PathSegment> searchList);
	@WebMethod
    public Station station(String stationId); 
}