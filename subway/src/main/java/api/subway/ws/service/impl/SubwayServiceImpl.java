package api.subway.ws.service.impl;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.PathSegment;

import api.subway.model.Station;
import api.subway.ws.service.SubwayService;

@WebService(endpointInterface = "api.subway.service.SubwayService", serviceName = "subwayService")
public class SubwayServiceImpl implements SubwayService {
	
//	@GET
//	@Path("/{number}")
//	@Produces("text/plain")
	public int printServiceNum(int num) {
		return num*10;
	}
	
//	@GET
//	@Path("/{key}")
//	@Produces("text/plain")
	public String keyLogin(String key) {
		// 
		return key;
	}

	public List trains(Long customerId, Long orderId, String searchString,
			List<PathSegment> searchList) {
		// TODO Auto-generated method stub
		return null;
	}

	public Station station(String stationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
