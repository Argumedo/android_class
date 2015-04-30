package com.detroitteatime.myflickr;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by mark on 4/30/15.
 */
public class FlickrPhoto {

    String id, owner, secret, server, farm, title;
    Boolean isPublic, isFriend, isFamily;

    public FlickrPhoto(JSONObject jsonPhoto) throws JSONException {
        this.id = (String) jsonPhoto.optString("id");
        this.secret = (String) jsonPhoto.optString("secret");
        this.owner = (String) jsonPhoto.optString("owner");
        this.server = (String) jsonPhoto.optString("server");
        this.farm = (String) jsonPhoto.optString("farm");
        this.title = (String)jsonPhoto.optString("title");
        this.isPublic = (Boolean) jsonPhoto.optBoolean("ispublic");
        this.isFriend = (Boolean) jsonPhoto.optBoolean("isfriend");
        this.isFamily = (Boolean) jsonPhoto.optBoolean("isfamily");
    }

}
