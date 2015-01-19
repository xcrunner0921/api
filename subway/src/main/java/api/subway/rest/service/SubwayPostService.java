package api.subway.rest.service;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import api.subway.dao.SubwayDao;
import api.subway.exception.ApplicationException;
import api.subway.model.Station;

@Service
@Path("/subway")
//@Produces(MediaType.APPLICATION_XML)
public class SubwayPostService {
	
//	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	protected Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired//(required=true)
	private Station station;
	@Autowired
	private SubwayDao dao;
	
	@POST
	@Path("/id/{number}")
	@Produces(MediaType.APPLICATION_XML)
	public int printServiceNum(@FormParam("number") int number) {
		System.out.println(">>>>>>>>> test");
		return number*10;
	}
	
	@POST
	@Path("/key/{key}")
	@Produces(MediaType.APPLICATION_XML)
	public String keyLogin(String key) {
		// 
		return key;
	}

//	@POST
//    @Path("/station/{key}/{stationid}/{search:.*}")
//    public Station findItem(@FormParam("id") Long customerId, 
//                         @FormParam("orderid") Long orderId,
//                         @FormParam("search") String searchString,
//                         @FormParam("search") List<PathSegment> searchList) {
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
	
	/*	노선별 지하철역 검색	*/
	@POST
	@Path("/stationNames/Line/{key}/{lineId}")
	@Produces(MediaType.APPLICATION_XML)
	public List<Station> getStationNamesByLine(@FormParam("key") String key
			,@FormParam("lineId") String lineId) {
		List<Station> stations = null;
		int stepNo = 500;
		try {
			logger.debug(key+", "+lineId);
			stations = dao.getStationListByLine(lineId);
		} catch(Exception e) {
			throw new ApplicationException(stepNo, e);
		}
		return stations;
	}
	
	/*	역명 지하철역 검색	*/
	@POST
	@Path("/stationNames/Name/{key}/{stationName}")
	@Produces(MediaType.APPLICATION_XML)
	public List<Station> getStationNamesByName(@FormParam("key") String key
			,@FormParam("stationName") String stationName) {
		List<Station> stations = null;
		int stepNo = 500;
		try {
			logger.debug(key+", "+stationName);
			stations = dao.getStationListByName(stationName);
		} catch(Exception e) {
			throw new ApplicationException(stepNo, e);
		}
		return stations;
	}
	
	/*	역간 거리 및 소요시간	*/
	/*	역외부코드로 역정보 검색	*/
	/*	역외부코드로 지하철역 위치 조회	*/


	@Transactional(rollbackFor = Exception.class)
	public void insertLog() {
		
	}

}