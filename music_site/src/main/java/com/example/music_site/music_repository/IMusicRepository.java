package com.example.music_site.music_repository;

import com.example.music_site.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IMusicRepository extends JpaRepository<Music,String> {
    Music findBymusicNameContaining(String name);
}
