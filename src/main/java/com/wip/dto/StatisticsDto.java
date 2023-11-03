/**
 * @Description: 类名中的 "Dto" 是 "Data Transfer Object" 的缩写，表示这个类是一个数据传输对象，用于在不同层之间传递数据，
 *               通常是用于将数据从业务逻辑层传递给表示层或客户端。
 * @Date: 2023/11/3
 */
package com.wip.dto;

/**
 * 后台统计对象
 */
public class StatisticsDto {

    /**
     * 文章数
     */
    private Long articles;

    /**
     * 评论数
     */
    private Long comments;

    /**
     * 链接数
     */
    private Long links;

    /**
     * 文件数
     */
    private Long attachs;

    public Long getArticles() {
        return articles;
    }

    public void setArticles(Long articles) {
        this.articles = articles;
    }

    public Long getComments() {
        return comments;
    }

    public void setComments(Long comments) {
        this.comments = comments;
    }

    public Long getLinks() {
        return links;
    }

    public void setLinks(Long links) {
        this.links = links;
    }

    public Long getAttachs() {
        return attachs;
    }

    public void setAttachs(Long attachs) {
        this.attachs = attachs;
    }
}
