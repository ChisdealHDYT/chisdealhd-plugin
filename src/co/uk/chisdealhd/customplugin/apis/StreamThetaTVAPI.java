package co.uk.chisdealhd.customplugin.apis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class StreamThetaTVAPI {

	private String channel;
	  
	  private URL url;
	  
	  private BufferedReader reader;
	  
	  private boolean online = false;
	  
	  public StreamThetaTVAPI(String channel, String[] args) {
	    this.channel = channel;
	    refresh();
	  }
	  
	  public void refresh() {
	    try {
	      this.url = new URL("https://api.chisdealhd.co.uk/v1/thetatvapi/" + this.channel);
	      HttpURLConnection con = (HttpURLConnection)this.url.openConnection();
	      con.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
	      this.reader = new BufferedReader(new InputStreamReader(con.getInputStream()));
	      if (!this.reader.readLine().contains("\"online\":false")) {
	        this.online = true;
	      } else {
	        this.online = false;
	      } 
	    } catch (MalformedURLException e) {
	      e.printStackTrace();
	    } catch (IOException e) {
	      e.printStackTrace();
	    } 
	  }
	  
	  public URL getUrl() {
	    return this.url;
	  }
	  
	  public boolean isOnline() {
	    return this.online;
	  }
	}
	
