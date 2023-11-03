/**
* @Description: 类名中的 "Dto" 是 "Data Transfer Object" 的缩写，表示这个类是一个数据传输对象，用于在不同层之间传递数据，
*               通常是用于将数据从业务逻辑层传递给表示层或客户端。
* @Date: 2023/11/3
*/
package com.wip.dto;

import com.wip.model.MetaDomain;

/**
 * 标签、分类列表
 */
public class MetaDto extends MetaDomain {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
