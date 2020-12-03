package ru.rtu.main.Practice16;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class main16 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String practiceDataFolder = "src/ru/rtu/main/Practice16/Data/";
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
                Thread thread = new Thread(new ThreadPractice16(list, practiceDataFolder + dstFolder, start));
                thread.start();
            }
            /*int middle = files.length/2;
            File[] files1 = new File[middle];
            File[] files2 = new File[files.length - middle];

            System.arraycopy(files, 0, files1, 0, files1.length);
            Thread resize1 = new Thread(new ThreadPractice16(files1, practiceDataFolder + dstFolder, start));
            resize1.start();

            System.arraycopy(files, middle, files2, 0, files2.length);
            Thread resize2 = new Thread(new ThreadPractice16(files2, practiceDataFolder + dstFolder, start));
            resize2.start();*/
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
