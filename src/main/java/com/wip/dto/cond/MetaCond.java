/**
* @Description: 类名中的 "Cond" 是 "Condition" 的缩写，意味着这个类用于封装筛选或条件参数，以便在查询Meta时可以根据这些条件进行过滤。
* @Date: 2023/11/3
*/
package com.wip.dto.cond;

/**
 * Meta查询条件
 */
public class MetaCond {

    /**
     * 名称
     */
    private String name;

    /**
     * 类型
     */
    private String type;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
