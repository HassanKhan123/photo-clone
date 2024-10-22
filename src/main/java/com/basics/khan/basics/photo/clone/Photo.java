package com.basics.khan.basics.photo.clone;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.validation.constraints.NotEmpty;

public class Photo {
    private String id;

    @NotEmpty
    private String fileName;

    private String contentType;

    private byte[] data;

    public Photo() {
    }

    public Photo(String id, String fileName) {
        this.id = id;
        this.fileName = fileName;
    }

    @JsonIgnore
    public byte[] getData() {
        return data;
    }

    public String getId() {
        return id;
    }

    public String getContentType() {
        return contentType;
    }

    public void setId(String id) {
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
