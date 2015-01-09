package api.subway.rs.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.subway.dao.SubwayDao;
import api.subway.model.Station;

@Service
@Path("/subway")
//@Produces("text/plain")
public class SubwayService {
//	@Autowired(required=true)
	Station station;
	@Autowired
	SubwayDao dao;
	
//	@Autowired
//	private StationDao stationDao;
	
	@GET
	@Path("/id/{number}")
	@Produces("text/xml")
	public int printServiceNum(@PathParam("number") int number) {
		System.out.println(">>>>>>>>> test");
		return number*10;
	}
	
	@GET
	@Path("/key/{key}")
//	@Produces("text/plain")
	public String keyLogin(String key) {
		// 
		return key;
	}

//	@GET
//    @Path("/station/{key}/{stationid}/{search:.*}")
//    public Station findItem(@PathParam("id") Long customerId, 
//                         @PathParam("orderid") Long orderId,
//                         @PathParam("search") String searchString,
//                         @PathParam("search") List<PathSegment> searchList) {
//        return station;
//    }
	
	@GET
	@Path("/station/{key}/{stationName}")
	@Produces("text/xml")
	public Station getStation(@PathParam("key") String key
			,@PathParam("stationName") String stationName) {
		Station st = new Station();
		st.setStationName("서울역");
		st.setStationId("1호선");
		return st;
	}

	@GET
	@Path("/stationName/{key}/{stationName}")
	@Produces("text/xml")
	public String getAccount(@PathParam("key") String key
			,@PathParam("stationName") String stationName) {
		return dao.getStationByName(stationName);
	}

	@Transactional
	public void insertLog() {
		
	}

}