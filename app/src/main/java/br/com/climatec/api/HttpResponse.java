package br.com.climatec.api;

import com.google.gson.annotations.SerializedName;
import br.com.climatec.models.WeatherCurrent;
public class HttpResponse {
    @SerializedName("current")
    private WeatherCurrent current;

    public WeatherCurrent getCurrent() { return current; }

}
