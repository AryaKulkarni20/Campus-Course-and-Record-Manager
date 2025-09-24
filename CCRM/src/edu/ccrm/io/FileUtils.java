package edu.ccrm.io;
import java.nio.file.*;
import java.io.*;
import java.util.*;

public class FileUtils {
    public static List<String> readLines(String filename) throws IOException {
        return Files.readAllLines(Paths.get(filename));
    }
    public static void writeLines(String filename, List<String> lines) throws IOException {
        Files.write(Paths.get(filename), lines);
    }
}
