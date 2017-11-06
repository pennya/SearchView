package com.example.kjh.searchview;

/**
 * Created by KJH on 2017-11-07.
 */

public class SearchEntity {
    private String title;
    private String address;

    public SearchEntity(String title, String address) {
        this.title = title;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
