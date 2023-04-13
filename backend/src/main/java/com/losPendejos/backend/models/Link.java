package com.losPendejos.backend.models;

import org.springframework.context.annotation.ComponentScan;

import javax.persistence.Entity;

import javax.persistence.*;

@Entity
@Table(name = "link", schema = "film")
public class Link {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String linkValue;
    private String language;
    private Boolean subtitles;
    private String subtitleLanguage;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private FilmEntity filmEntity;

    public Link(String linkValue, String language, Boolean subtitles, String subtitleLanguage) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLinkValue() {
        return linkValue;
    }

    public void setLinkValue(String linkValue) {
        this.linkValue = linkValue;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(Boolean subtitles) {
        this.subtitles = subtitles;
    }

    public String getSubtitleLanguage() {
        return subtitleLanguage;
    }

    public void setSubtitleLanguage(String subtitleLanguage) {
        this.subtitleLanguage = subtitleLanguage;
    }

    public FilmEntity getFilm() {
        return filmEntity;
    }

    public void setFilm(FilmEntity filmEntity) {
        this.filmEntity = filmEntity;
    }
}
