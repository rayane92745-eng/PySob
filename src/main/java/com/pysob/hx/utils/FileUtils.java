package com.pysob.hx.utils;

import java.nio.file.*;
import java.io.IOException;

public class FileUtils {
    public static String readFile(String path) throws IOException {
        return Files.readString(Paths.get(path));
    }
}