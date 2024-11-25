package com.basics.khan.basics.photo.clone.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.NotEmpty;

@Table("PHOTOZ")
public class Photo {
    @Id
    private Integer id;

    @NotEmpty
    private String fileName;

    private String contentType;

    private byte[] data;

    public Photo() {
    }

    @JsonIgnore
    public byte[] getData() {
        return data;
    }

    public Integer getId() {
        return id;
    }

    public String getContentType() {
        return contentType;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

}
