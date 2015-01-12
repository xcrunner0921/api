package api.subway.model;

import javax.xml.bind.annotation.*;


@XmlRootElement(name = "Station")
public class Station {
	
	String stationId;
	String stationName;
	String stationAddr;
	String stationTel;
	String stationGps;
	String stationExit;
	String sysdate;
	
	/**
	 * @return the stationId
	 */
	public String getStationId() {
		return stationId;
	}
	/**
	 * @param stationId the stationId to set
	 */
	public void setStationId(String stationId) {
		this.stationId = stationId;
	}
	/**
	 * @return the stationName
	 */
	public String getStationName() {
		return stationName;
	}
	/**
	 * @param stationName the stationName to set
	 */
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	/**
	 * @return the stationAddr
	 */
	public String getStationAddr() {
		return stationAddr;
	}
	/**
	 * @param stationAddr the stationAddr to set
	 */
	public void setStationAddr(String stationAddr) {
		this.stationAddr = stationAddr;
	}
	/**
	 * @return the stationTel
	 */
	public String getStationTel() {
		return stationTel;
	}
	/**
	 * @param stationTel the stationTel to set
	 */
	public void setStationTel(String stationTel) {
		this.stationTel = stationTel;
	}
	/**
	 * @return the stationGps
	 */
	public String getStationGps() {
		return stationGps;
	}
	/**
	 * @param stationGps the stationGps to set
	 */
	public void setStationGps(String stationGps) {
		this.stationGps = stationGps;
	}
	/**
	 * @return the stationExit
	 */
	public String getStationExit() {
		return stationExit;
	}
	/**
	 * @param stationExit the stationExit to set
	 */
	public void setStationExit(String stationExit) {
		this.stationExit = stationExit;
	}
	/**
	 * @return the sysdate
	 */
	public String getSysdate() {
		return sysdate;
	}
	/**
	 * @param sysdate the sysdate to set
	 */
	public void setSysdate(String sysdate) {
		this.sysdate = sysdate;
	}
	
	

}
