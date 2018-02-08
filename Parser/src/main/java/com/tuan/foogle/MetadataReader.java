package com.tuan.foogle;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by nyg1hc on 2/8/2018.
 */
public class MetadataReader {

    public static final long NUMBER_OF_METADATA_LINES_TO_READ = 7;

    public void readMetadata() {

        String fileName = "C:\\Users\\nyg1hc\\Downloads\\ALO.tsv";

        //read file into stream, try-with-resources
        try (Stream<String> streams = Files.lines(Paths.get(fileName))) {

//            these 2 snippet are the same
//            streams.forEach(stream -> System.out.println(stream));
//            streams.forEach(System.out::println);

            streams
                    .limit(NUMBER_OF_METADATA_LINES_TO_READ)
                    .filter(line -> line.startsWith("#"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
