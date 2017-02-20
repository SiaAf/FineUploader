package com.fineuploader;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties("fineuploader")
public class UploadServerProperties {


    private Path baseDir = Paths.get("./uploads");

    public Path getBaseDir() {
        return baseDir;
    }

    public void setBaseDir(Path baseDir) {
        this.baseDir = baseDir;
    }

}
