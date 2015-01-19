package api.subway.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

@Component(value = "station")
@XmlRootElement(name = "Station")
public class Station implements Serializable {
	
	private String statnNm;	// 역명
	private String subwayId;
	private String subwayNm;
	private String statnNmEng;
	private String statnFid;
	private String statnTid;
	private String operPblinstt;
	private String zipNo;
	private String adresBass;
	private String adresDetail;
	private String telno;
	private String fxnum;
	private String pltfomSe;
	private String gffDoor;
	private String crosngAt;
	private String toiletAt;
	private String dspsnCvntlAt;
	private String trttprkAt;
	private String bcyclCstdyAt;
	private String directAt;
	private String subwayXcnts;
	private String subwayYcnts;
	private String trnsitCo;

	
	/**
	 * @return the statnNm
	 */
	public String getStatnNm() {
		return statnNm;
	}
	/**
	 * @param statnNm the statnNm to set
	 */
	public void setStatnNm(String statnNm) {
		this.statnNm = statnNm;
	}
	/**
	 * @return the subwayId
	 */
	public String getSubwayId() {
		return subwayId;
	}
	/**
	 * @param subwayId the subwayId to set
	 */
	public void setSubwayId(String subwayId) {
		this.subwayId = subwayId;
	}
	/**
	 * @return the statnNmEng
	 */
	public String getStatnNmEng() {
		return statnNmEng;
	}
	/**
	 * @param statnNmEng the statnNmEng to set
	 */
	public void setStatnNmEng(String statnNmEng) {
		this.statnNmEng = statnNmEng;
	}
	/**
	 * @return the statnFid
	 */
	public String getStatnFid() {
		return statnFid;
	}
	/**
	 * @param statnFid the statnFid to set
	 */
	public void setStatnFid(String statnFid) {
		this.statnFid = statnFid;
	}
	/**
	 * @return the statnTid
	 */
	public String getStatnTid() {
		return statnTid;
	}
	/**
	 * @param statnTid the statnTid to set
	 */
	public void setStatnTid(String statnTid) {
		this.statnTid = statnTid;
	}
	/**
	 * @return the operPblinstt
	 */
	public String getOperPblinstt() {
		return operPblinstt;
	}
	/**
	 * @param operPblinstt the operPblinstt to set
	 */
	public void setOperPblinstt(String operPblinstt) {
		this.operPblinstt = operPblinstt;
	}
	/**
	 * @return the zipNo
	 */
	public String getZipNo() {
		return zipNo;
	}
	/**
	 * @param zipNo the zipNo to set
	 */
	public void setZipNo(String zipNo) {
		this.zipNo = zipNo;
	}
	/**
	 * @return the adresBass
	 */
	public String getAdresBass() {
		return adresBass;
	}
	/**
	 * @param adresBass the adresBass to set
	 */
	public void setAdresBass(String adresBass) {
		this.adresBass = adresBass;
	}
	/**
	 * @return the adresDetail
	 */
	public String getAdresDetail() {
		return adresDetail;
	}
	/**
	 * @param adresDetail the adresDetail to set
	 */
	public void setAdresDetail(String adresDetail) {
		this.adresDetail = adresDetail;
	}
	/**
	 * @return the telno
	 */
	public String getTelno() {
		return telno;
	}
	/**
	 * @param telno the telno to set
	 */
	public void setTelno(String telno) {
		this.telno = telno;
	}
	/**
	 * @return the fxnum
	 */
	public String getFxnum() {
		return fxnum;
	}
	/**
	 * @param fxnum the fxnum to set
	 */
	public void setFxnum(String fxnum) {
		this.fxnum = fxnum;
	}
	/**
	 * @return the pltfomSe
	 */
	public String getPltfomSe() {
		return pltfomSe;
	}
	/**
	 * @param pltfomSe the pltfomSe to set
	 */
	public void setPltfomSe(String pltfomSe) {
		this.pltfomSe = pltfomSe;
	}
	/**
	 * @return the gffDoor
	 */
	public String getGffDoor() {
		return gffDoor;
	}
	/**
	 * @param gffDoor the gffDoor to set
	 */
	public void setGffDoor(String gffDoor) {
		this.gffDoor = gffDoor;
	}
	/**
	 * @return the crosngAt
	 */
	public String getCrosngAt() {
		return crosngAt;
	}
	/**
	 * @param crosngAt the crosngAt to set
	 */
	public void setCrosngAt(String crosngAt) {
		this.crosngAt = crosngAt;
	}
	/**
	 * @return the toiletAt
	 */
	public String getToiletAt() {
		return toiletAt;
	}
	/**
	 * @param toiletAt the toiletAt to set
	 */
	public void setToiletAt(String toiletAt) {
		this.toiletAt = toiletAt;
	}
	/**
	 * @return the dspsnCvntlAt
	 */
	public String getDspsnCvntlAt() {
		return dspsnCvntlAt;
	}
	/**
	 * @param dspsnCvntlAt the dspsnCvntlAt to set
	 */
	public void setDspsnCvntlAt(String dspsnCvntlAt) {
		this.dspsnCvntlAt = dspsnCvntlAt;
	}
	/**
	 * @return the trttprkAt
	 */
	public String getTrttprkAt() {
		return trttprkAt;
	}
	/**
	 * @param trttprkAt the trttprkAt to set
	 */
	public void setTrttprkAt(String trttprkAt) {
		this.trttprkAt = trttprkAt;
	}
	/**
	 * @return the bcyclCstdyAt
	 */
	public String getBcyclCstdyAt() {
		return bcyclCstdyAt;
	}
	/**
	 * @param bcyclCstdyAt the bcyclCstdyAt to set
	 */
	public void setBcyclCstdyAt(String bcyclCstdyAt) {
		this.bcyclCstdyAt = bcyclCstdyAt;
	}
	/**
	 * @return the directAt
	 */
	public String getDirectAt() {
		return directAt;
	}
	/**
	 * @param directAt the directAt to set
	 */
	public void setDirectAt(String directAt) {
		this.directAt = directAt;
	}
	/**
	 * @return the subwayXcnts
	 */
	public String getSubwayXcnts() {
		return subwayXcnts;
	}
	/**
	 * @param subwayXcnts the subwayXcnts to set
	 */
	public void setSubwayXcnts(String subwayXcnts) {
		this.subwayXcnts = subwayXcnts;
	}
	/**
	 * @return the subwayYcnts
	 */
	public String getSubwayYcnts() {
		return subwayYcnts;
	}
	/**
	 * @param subwayYcnts the subwayYcnts to set
	 */
	public void setSubwayYcnts(String subwayYcnts) {
		this.subwayYcnts = subwayYcnts;
	}
	/**
	 * @return the trnsitCo
	 */
	public String getTrnsitCo() {
		return trnsitCo;
	}
	/**
	 * @param trnsitCo the trnsitCo to set
	 */
	public void setTrnsitCo(String trnsitCo) {
		this.trnsitCo = trnsitCo;
	}
	/**
	 * @return the subwayNm
	 */
	public String getSubwayNm() {
		return subwayNm;
	}
	/**
	 * @param subwayNm the subwayNm to set
	 */
	public void setSubwayNm(String subwayNm) {
		this.subwayNm = subwayNm;
	}
	
	

}
