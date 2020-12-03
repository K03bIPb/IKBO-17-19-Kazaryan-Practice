package ru.rtu.main.Practice17;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class main17 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String practiceDataFolder = "src/ru/rtu/main/Practice17/Data/";
        String srcFolder = "images";
        String dstFolder = "dst";
        int cores = Runtime.getRuntime().availableProcessors();
        File srcDir = new File(practiceDataFolder + srcFolder);
        File[] files = srcDir.listFiles();
        try {
            if (!Files.exists(Paths.get(practiceDataFolder + dstFolder))) {
                Files.createDirectories(Paths.get(practiceDataFolder + dstFolder));
            }
            assert files != null;
            int cut = files.length / cores;
            int pos = 0;
            File[][] cutList = new File[cores][cut];
            for (int i = 0; i < cores; i++) {
                File[] tempFiles = new File[cut];
                System.arraycopy(files, pos, tempFiles, 0, tempFiles.length);
                pos = pos + cut;
                cutList[i] = tempFiles;
            }
            for (File[] list : cutList) {
                Thread thread = new Thread(new ThreadPractice17(list, practiceDataFolder + dstFolder, start));
                thread.start();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
