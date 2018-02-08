package com.tuan.foogle;

import com.tuan.foogle.TsvReader;

/**
 * Created by Tuan Nguyen Anh on 2/8/2018.
 */
public class Main {

    public static void main(String[] args) {
        String inputPath = "";
        for (int i = 0; i < args.length; i++) {
            switch (i) {
                case 0:
                    inputPath = args[0];
                    break;
            }
        }
        TsvReader tsvReader = new TsvReader();
        tsvReader.readTsv(inputPath);
        MetadataReader metadataReader = new MetadataReader();
        metadataReader.readMetadata();
    }
}
