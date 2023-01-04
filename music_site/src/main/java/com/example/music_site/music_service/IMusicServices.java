package com.example.music_site.music_service;

import com.example.music_site.model.Music;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IMusicServices {
    void addNewSongOrEditSong(Music song);
    List<Music> getAllSong();
    void removeSong(Music song);
    Music getMusicByNameSong(String nameSong);

}
