package org.example.HtmlFormatHelper;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HtmlFormatHelperTest {

    @Test
    void testGetStrongFormat() {
        HtmlFormatHelper htmlFormatHelper = new HtmlFormatHelper();
        String input = "test";
        String attendue = "<strong>test</strong>";
        assertEquals(attendue, htmlFormatHelper.getStrongFormat(input));
    }

    @Test
    void testGetItalicFormat() {
        HtmlFormatHelper htmlFormatHelper = new HtmlFormatHelper();
        String input = "test italique";
        String attendue = "<i>test italique</i>";
        assertEquals(attendue, htmlFormatHelper.getItalicFormat(input));
    }

    @Test
    void getFormattedListElements() {
        HtmlFormatHelper htmlFormatHelper = new HtmlFormatHelper();
        List<String> input = Arrays.asList("machin 1", "bidule 2", "truc 3");
        String attendue = "<ul><li>machin 1</li><li>bidule 2</li><li>truc 3</li></ul>";
        assertEquals(attendue, htmlFormatHelper.getFormattedListElements(input));
    }
}