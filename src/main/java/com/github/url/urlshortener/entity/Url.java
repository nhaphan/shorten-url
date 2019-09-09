package com.github.url.urlshortener.entity;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "URL")
public class Url {
    @Id
    @Column(name="hash")
    private String hash;
    @Column(name="original_url")
    private String originalUrl;
    @Column(name = "creation_date")
    @CreationTimestamp
    private Date creationDate;


    public Url() {}
    public Url(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


    public Url(String hash, String originalUrl, Date creationDate) {
        this.hash = hash;
        this.originalUrl = originalUrl;
        this.creationDate = creationDate;
    }
}
