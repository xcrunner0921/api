package api.subway.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import api.subway.client.model.Station;

/**
 * package	: api.subway.client
 * file		: ClientTest.java
 * TODO	: 
 * date		: 2015. 1. 19.
 * user		: Administrator
 */
public class ClientTest {
	public static void main(String[] args){
		ClientTest restClient = new ClientTest();
        try {
            //restClient.getStationListPOST("100", "서울");
            restClient.getStationList("100", "서울");
        } catch (Exception e) {
            e.printStackTrace(); //To change body of catch statement use File | Settings | File Templates.
        }
 
    }
	

	/**
	 * getStationList
	 * TODO	:
	 * date		: 2015. 1. 19.
	 * user		: Administrator
	 * @param stationName
	 * @return
	 * @throws Exception
	 * return type : Station
	 */
	public Station getStationListPOST(String key, String stationName) throws Exception {
		String output = null;
        try {
        	String url = "http://localhost:8080/api/subway/stationNames/Name/";
 
//            url = url + URLEncoder.encode(stationName, "UTF-8");
 
            /*HttpClient client = new HttpClient();
            PostMethod mPost = new PostMethod(url);
            //client.executeMethod( mPost );
            Header mtHeader = new Header();
            mtHeader.setName("content-type");
            mtHeader.setValue("application/x-www-form-urlencoded; charset=UTF-8");
            mtHeader.setName("accept");
            mtHeader.setValue("application/xml");
            mPost.addRequestHeader(mtHeader);
            
            mPost.addParameter("key", key);
            mPost.addParameter("stationName", stationName);
            mPost.set.setEntity(new UrlEncodedFormEntity(nvps, "euc-kr"));
            
            client.executeMethod(mPost);
            output = mPost.getResponseBodyAsString( );
            mPost.releaseConnection( );
            */
        	HttpPost httpost = new HttpPost(url); 
        	List nvps = new ArrayList();
        	nvps.add(new BasicNameValuePair("key", key));
        	nvps.add(new BasicNameValuePair("stationName", stationName));
        	httpost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
        	httpost.setHeader("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
        	HttpClient httpClient = new DefaultHttpClient();
        	HttpResponse response = httpClient.execute(httpost);
        	
//        	output = EntityUtils.toString(response.getEntity());
//        	output = URLDecoder.decode(EntityUtils.toString(response.getEntity()), "UTF-8");
//        	URLEncoder.encode(stationName, "UTF-8");
        	
        	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"));
        	output = bufferedReader.readLine();

            
            System.out.println("out : " + output);
        } catch(Exception e) {
            throw new Exception("Exception in retriving group page info : " + e);
        }
        return null;
	}
	
	public Station getStationList(String key, String stationName) throws Exception {
		String output = null;
        try {
            String url = "http://localhost:8080/api/subway/stationNames/Name/$1/$2";
            
            url = url.replace("$1", key);
            url = url.replace("$2", stationName);
            System.out.println("client : url = " + url);
 
//            url = url + URLEncoder.encode(stationName, "UTF-8");
 
//            HttpClient client = new HttpClient();
//            HttpMethod method = new GetMethod(url);
//            //client.executeMethod( mPost );
////            Header mtHeader = new Header();
////            mtHeader.setName("content-type");
////            mtHeader.setValue("application/x-www-form-urlencoded");
////            mtHeader.setName("accept");
////            mtHeader.setValue("application/xml");
////            method.addRequestHeader(mtHeader);
//            client.executeMethod(method);
//            output = method.getResponseBodyAsString( );
//            method.releaseConnection( );
            
            HttpGet httget = new HttpGet(url); 
//        	List nvps = new ArrayList();
//        	nvps.add(new BasicNameValuePair("key", key));
//        	nvps.add(new BasicNameValuePair("stationName", stationName));
//        	httpost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
//        	httpost.setHeader("Content-type", "application/x-www-form-urlencoded; charset=UTF-8");
        	HttpClient httpClient = new DefaultHttpClient();
        	HttpResponse response = httpClient.execute(httget);
        	
//        	output = EntityUtils.toString(response.getEntity());
//        	output = URLDecoder.decode(EntityUtils.toString(response.getEntity()), "UTF-8");
//        	URLEncoder.encode(stationName, "UTF-8");
        	
        	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(response.getEntity().getContent(), "UTF-8"));
        	output = bufferedReader.readLine();
        	
            System.out.println("client : out = " + output);
        } catch(Exception e) {
            throw new Exception("client : Exception in retriving group page info : " + e);
        }
        return null;
	}
}
