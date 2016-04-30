package com.agroho.model;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by rezaul on 4/28/16.
 */
public class FileBucket {

    MultipartFile file;

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
