package com.detroitteatime.flickrgrabber;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by mark on 4/29/15.
 */
public class LoadPhotos extends AsyncTask<String, String, String> {
    private String apiKey = null;


    public LoadPhotos(){}

    public LoadPhotos(String apiKey) {
        this.apiKey = apiKey;

    }


    @Override
    protected String doInBackground(String... strings) {

        HttpURLConnection connection = null;
        try {
            URL dataUrl = new URL("http://api.flickr.com/services/rest/?method=flickr.photos.getRecent&api+key=" +
                    apiKey + "&per_page=" + Constants.NUM_PHOTOS + "&format=json&nojsoncallback=1");
            connection = (HttpURLConnection) dataUrl.openConnection();
            connection.connect();
            int status = connection.getResponseCode();
            Log.d("TAG", "status " + status);
            //if it is successful
            if(status == 200){
                InputStream is = connection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                String responseString;
                StringBuilder sb = new StringBuilder();

                while((responseString = reader.readLine())!= null){
                    sb = sb.append(responseString);
                }

                String photoData = sb.toString();
                mPhotos = FlickrPhoto.makePhotoList(photoData);
                

            }
        } catch (MalformedURLException e) {
            Log.i(Constants.TAG, "Malformed Url");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

}
