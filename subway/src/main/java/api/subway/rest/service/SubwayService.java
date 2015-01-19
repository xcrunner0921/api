package api.subway.rest.service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.subway.dao.SubwayDao;
import api.subway.exception.ApplicationException;
import api.subway.model.Station;
import api.subway.model.StationList;

@Service
@Path("/subway")
//@Produces(MediaType.APPLICATION_XML)
public class SubwayService {
	
//	protected final Logger log = LoggerFactory.getLogger(this.getClass());
	protected Logger log = Logger.getLogger(this.getClass());
	
	@Autowired//(required=true)
	private Station station;
	@Autowired
	private SubwayDao dao;
	
	@GET
	@Path("/id/{number}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,"application/x-www-form-urlencoded"})
	public int printServiceNum(@PathParam("number") int number) {
		System.out.println(">>>>>>>>> test");
		return number*10;
	}
	
	@GET
	@Path("/key/{key}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,"application/x-www-form-urlencoded"})
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
	
	
	/*	지하철 호선별 첫차와 막차 정보 검색	*/
	/*	역코드로 지하철 막차 시간표 검색	*/
	/*	역코드로 지하철 도착 정보 검색(역명포함)	*/
	/*	역코드로 지하철 열차 시간표 검색	*/
	/*	역코드로 지하철 도착 정보 검색	*/
	/*	역코드로 첫차와 막차 정보 검색	*/
	/*	지하철 도착정보 검색(열차별 경유)	*/
	/*	역외부코드로 첫차와 막차 정보 검색	*/
	/*	역외부코드로 지하철 도착 정보 검색	*/
	/*	역외부코드로 지하철 열차 시간표 검색	*/
	/*	역외부코드로 지하철 막차 시간표 검색	*/
	/*	역별 주소 및 전화번호 정보	*/
	/*	역코드로 역정보 검색	*/
	/*	역코드로 지하철역 위치 조회	*/
	/*	역별 지명유래 및 테마명	*/
	
	/* 노선별 지하철역 검색 */
	@GET
	@Path("/stationNames/Line/{key}/{lineId}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,"application/x-www-form-urlencoded"})
	public List<Station> getStationNamesByLine(@PathParam("key") String key
			,@PathParam("lineId") String lineId) {
		List<Station> stations = null;
		int stepNo = 500;
		try {
			log.debug(key+", "+lineId);
			stations = dao.getStationListByLine(lineId);
		} catch(Exception e) {
			throw new ApplicationException(stepNo, e);
		}
		return stations;
	}
	
	/* 역명 지하철역 검색 */
	@GET
	@Path("/stationNames/Name/{key}/{stationName}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,"application/x-www-form-urlencoded"})
	public StationList getStationNamesByName(@PathParam("key") String key
			,@PathParam("stationName") String stationName) {
		StationList stationList = new StationList();
		List<Station> stations = null;
		int stepNo = 500;
		try {
			log.debug(key+", "+stationName);
			stations = dao.getStationListByName(stationName);
			stationList.setStationList(stations);
			//ErrorMessage errorMessage = new ErrorMessage();
			
		} catch(Exception e) {
			throw new ApplicationException(stepNo, e);
		}
		return stationList;
	}
	@POST
	@Path("/stationNames/Name")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,"application/x-www-form-urlencoded"})
	public StationList getStationNamesByNamePOST(@FormParam("key") String key
			,@FormParam("stationName") String stationName) {
		StationList stationList = new StationList();
		List<Station> stations = null;
		int stepNo = 500;
		try {
			log.debug(key+", "+stationName);
			stations = dao.getStationListByName(stationName);
			stationList.setStationList(stations);
			//ErrorMessage errorMessage = new ErrorMessage();
			
		} catch(Exception e) {
			throw new ApplicationException(stepNo, e);
		}
		return stationList;
	}
	
	/*	역간 거리 및 소요시간	*/
	/*	역외부코드로 역정보 검색	*/
	/*	역외부코드로 지하철역 위치 조회	*/


	@Transactional(rollbackFor = Exception.class)
	public void insertLog() {
		
	}

}