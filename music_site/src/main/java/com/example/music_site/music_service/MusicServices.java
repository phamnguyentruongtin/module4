package com.example.music_site.music_service;

import com.example.music_site.model.Music;
import com.example.music_site.music_repository.IMusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServices implements IMusicServices{
    @Autowired
    IMusicRepository musicRepository;

    @Override
    public void addNewSongOrEditSong(Music song) {
       musicRepository.save(song);
    }

    @Override
    public List<Music> getAllSong() {
        List<Music> musicList = musicRepository.findAll();
        return musicList ;
    }

    @Override
    public void removeSong(Music song) {
        musicRepository.delete(song);
    }

    @Override
    public Music getMusicByNameSong(String nameSong) {
        Music music = musicRepository.findByNameMusicContent(nameSong);
        return music;
    }
}
