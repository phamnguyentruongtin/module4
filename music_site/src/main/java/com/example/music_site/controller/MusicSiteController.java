package com.example.music_site.controller;

import com.example.music_site.model.Music;
import com.example.music_site.music_service.IMusicServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class MusicSiteController {

    @Autowired
   private IMusicServices iMusicServices;


    @GetMapping("musichome")
    public String showList(Model model){
       List <Music> musicList = iMusicServices.getAllSong();
        model.addAttribute("musicList",musicList);
        return "home";
    }

    @GetMapping("showcreate")
    public String showCreate(Model model){
        model.addAttribute("music",new Music());
        return "create";
    }

    @PostMapping("docreate")
    public String doCreate(Music music, RedirectAttributes redirectAttributes){
        iMusicServices.addNewSongOrEditSong(music);
        String sms = "success";
        redirectAttributes.addFlashAttribute("sms", sms);
        return "redirect:home";
    }
    @GetMapping("removesong")
    public String remove(String musicName,RedirectAttributes redirectAttributes){
        Music music = iMusicServices.getMusicByNameSong(musicName);
        iMusicServices.removeSong(music);
        String sms = "success";
        redirectAttributes.addFlashAttribute("sms",sms);
        return "redirect:home";
    }

    @GetMapping("editsong")
    public String editSong(String musicName,Model model){
        Music music = iMusicServices.getMusicByNameSong(musicName);
        model.addAttribute("music",music);
        return "edit";
    }

    @PostMapping("doedit")
    public String doEdit(Music music, RedirectAttributes redirectAttributes){
        iMusicServices.addNewSongOrEditSong(music);
        String sms = "success";
        redirectAttributes.addFlashAttribute("sms", sms);
        return "redirect:home";
    }
}
