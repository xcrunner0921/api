package api.subway.rs.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.PathSegment;

import org.springframework.beans.factory.annotation.Autowired;

import api.subway.model.Station;

@Path("/subway")
@Produces("text/xml")
public class SubwayService {
	@Autowired
	Station station; 
	
	@GET
	@Path("/{number}")
//	@Produces("text/plain")
	public int printServiceNum(int num) {
		return num*10;
	}
	
	@GET
	@Path("/{key}")
//	@Produces("text/plain")
	public String keyLogin(String key) {
		// 
		return key;
	}

	@GET
    @Path("/station/{key}/{stationid}/{search:.*}")
    public Station findItem(@PathParam("id") Long customerId, 
                         @PathParam("orderid") Long orderId,
                         @PathParam("search") String searchString,
                         @PathParam("search") List<PathSegment> searchList) {
        return station;
    }

}