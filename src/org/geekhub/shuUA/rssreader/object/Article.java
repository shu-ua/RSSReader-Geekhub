package org.geekhub.shuUA.rssreader.object;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: shu
 * Date: 04.02.13
 * Time: 18:46
 * To change this template use File | Settings | File Templates.
 */
public class Article {
    private String title;
    private String link;
    private String content;
    private Date pubDate;
    private String  imgLink;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Date getPubDate() {
        return pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
