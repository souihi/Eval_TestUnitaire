package org.example.HtmlFormatHelper;

import java.util.List;

public class HtmlFormatHelper {

    public String getStrongFormat(String content) {
        return "<strong>" + content + "</strong>";
    }

    public String getItalicFormat(String content) {
        return "<i>" + content + "</i>";
    }

    // Plus difficile
    public String getFormattedListElements(List<String> contents) {
        StringBuilder htmlList = new StringBuilder();
        htmlList.append("<ul>");

        for (String item : contents) {
            htmlList.append("<li>");
            htmlList.append(item);
            htmlList.append("</li>");
        }

        htmlList.append("</ul>");
        return htmlList.toString();
    }
}
