package db.impl;

import db.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriterImpl implements FileWriter {
    @Override
    public void writeToFile(String pathName, String report) {
        try {
            Files.write(Path.of(pathName), report.getBytes());
        } catch (IOException e) {
            throw new RuntimeException("Can't write this file " + pathName, e);
        }
    }
}
