package com.example.music_site.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Music {
    @Id
    private String musicName;
    private String musical;
    private String musicType;
    private String url;

    public Music(String musicName, String musical, String musicType, String url) {
        this.musicName = musicName;
        this.musical = musical;
        this.musicType = musicType;
        this.url = url;
    }

    public Music() {
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getMusical() {
        return musical;
    }

    public void setMusical(String musical) {
        this.musical = musical;
    }

    public String getMusicType() {
        return musicType;
    }

    public void setMusicType(String musicType) {
        this.musicType = musicType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
