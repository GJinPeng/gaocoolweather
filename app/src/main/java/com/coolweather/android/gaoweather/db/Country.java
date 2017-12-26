package com.coolweather.android.gaoweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/12/26.
 */

public class Country extends DataSupport {
    private int id;
    private String countryName;
    private int countryCode;

    public int getId() {
        return id;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }
}
