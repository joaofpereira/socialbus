package pt.sapo.labs.api.services;

import com.twitter.hbc.twitter4j.v3.RawJsonStatusListener;
import com.twitter.hbc.twitter4j.v3.handler.StatusStreamHandler;
import org.apache.commons.configuration.Configuration;
import org.json.simple.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: arian
 * Date: 8/22/13
 * Time: 4:49 PM
 * To change this template use File | Settings | File Templates.
 */
public interface StatusAdapter extends StatusStreamHandler,RawJsonStatusListener {

    public Configuration getConfiguration();
    public void setConfiguration(Configuration configuration);

    public void initialize();
//    public Map getStatusMetadata();
//    public void setStatusMetadata(Map metadata);
    void onStatus(JSONObject jsonObject);
    void onStatus(String jsonString);

    boolean isEnabled();
}
