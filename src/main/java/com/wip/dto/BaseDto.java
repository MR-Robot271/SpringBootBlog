/**
 * @Description: 类名中的 "Dto" 是 "Data Transfer Object" 的缩写，表示这个类是一个数据传输对象，用于在不同层之间传递数据，
 *               通常是用于将数据从业务逻辑层传递给表示层或客户端。
 * @Date: 2023/11/3
 */
package com.wip.dto;

/**
 * 公共属性的类
 */
public class BaseDto {

    /**
     * 用户名
     */
    private String userName;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
