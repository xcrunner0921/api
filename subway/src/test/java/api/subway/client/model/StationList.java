package api.subway.client.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

import api.subway.exception.ErrorMessage;

@Component(value = "stationList")
@XmlRootElement(name = "StationList")
public class StationList {
	
	private List<Station> stationList;
	private ErrorMessage errorMessage;
	
	/**
	 * @return the stationList
	 */
	public List<Station> getStationList() {
		if (stationList == null)
			stationList = new ArrayList<Station>();
		return stationList;
	}
	/**
	 * @param stationList the stationList to set
	 */
	public void setStationList(List<Station> stationList) {
		this.stationList = stationList;
	}
	/**
	 * @return the errorMessage
	 */
	public ErrorMessage getErrorMessage() {
		if (errorMessage == null) {
			errorMessage.setCode(0);
			errorMessage.setStatus(0);
			errorMessage.setMessage("");
			errorMessage.setDeveloperMessage("");
			errorMessage.setLink("");
		}
			
		return errorMessage;
	}
	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(ErrorMessage errorMessage) {
		this.errorMessage = errorMessage;
	}


	
	

}
