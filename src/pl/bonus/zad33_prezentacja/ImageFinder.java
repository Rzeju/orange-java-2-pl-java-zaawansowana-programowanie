package pl.bonus.zad33_prezentacja;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ImageFinder {

    public static List<File> findImages(String directoryName) {
        File directory = new File(directoryName);
        List<File> result = new ArrayList<>();

        File[] files = directory.listFiles();
        for (File file : files) {
            if (file.isFile() && (file.getName().endsWith(".jpg") || file.getName().endsWith(".png"))) {
                result.add(file);
            } else if (file.isDirectory()) {
                result.addAll(findImages(file.getAbsolutePath()));
            }
        }

        return result;
    }
}
