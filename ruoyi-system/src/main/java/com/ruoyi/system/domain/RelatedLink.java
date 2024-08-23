package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 相关链接管理对象 related_link
 * 
 * @author ruoyi
 * @date 2024-07-18
 */
public class RelatedLink extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 相关链接id */
    private Long id;

    /** 链接地址 */
    @Excel(name = "链接地址")
    private String linkUrl;

    /** 图标 */
    @Excel(name = "图标")
    private String icon;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 排序 */
    @Excel(name = "排序")
    private Long sort;

    /** 状态 */
    @Excel(name = "状态")
    private Long status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setLinkUrl(String linkUrl) 
    {
        this.linkUrl = linkUrl;
    }

    public String getLinkUrl() 
    {
        return linkUrl;
    }
    public void setIcon(String icon) 
    {
        this.icon = icon;
    }

    public String getIcon() 
    {
        return icon;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("linkUrl", getLinkUrl())
            .append("icon", getIcon())
            .append("title", getTitle())
            .append("sort", getSort())
            .append("status", getStatus())
            .append("remark", getRemark())
            .toString();
    }
}
