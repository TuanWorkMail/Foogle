package com.tuan.foogle;

import com.univocity.parsers.tsv.TsvParser;
import com.univocity.parsers.tsv.TsvParserSettings;

import java.io.*;
import java.util.List;

/**
 * Created by nyg1hc on 2/8/2018.
 */
public class TsvReader {

    public void readTsv(final String path) {

        TsvParserSettings settings = new TsvParserSettings();
        //the file used in the example uses '\n' as the line separator sequence.
        //the line separator sequence is defined here to ensure systems such as MacOS and Windows
        //are able to process this file correctly (MacOS uses '\r'; and Windows uses '\r\n').
        settings.getFormat().setLineSeparator("\n");

        // creates a TSV parser
        TsvParser parser = new TsvParser(settings);

        // parses all rows in one go.
        List<String[]> allRows = parser.parseAll(getReader("C:\\Users\\nyg1hc\\Downloads\\ALO.tsv"));
    }

    public Reader getReader(String path) {
        try {
            return new InputStreamReader(new FileInputStream(path), "UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
