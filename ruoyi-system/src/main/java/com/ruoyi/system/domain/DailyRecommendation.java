package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 今日推荐管理 对象 daily_recommendation
 * 
 * @author ruoyi
 * @date 2024-07-18
 */
public class DailyRecommendation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 今日推荐id */
    private Long id;

    /** 今日推荐标题 */
    @Excel(name = "今日推荐标题")
    private String dailyTitle;

    /** 今日推荐按钮文本 */
    @Excel(name = "今日推荐按钮文本")
    private String btnText;

    /** 标题 */
    @Excel(name = "标题")
    private String title;

    /** 封面 */
    @Excel(name = "封面")
    private String cover;

    /** 描述 */
    @Excel(name = "描述")
    private String description;

    /** 地址 */
    @Excel(name = "地址")
    private String url;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDailyTitle(String dailyTitle) 
    {
        this.dailyTitle = dailyTitle;
    }

    public String getDailyTitle() 
    {
        return dailyTitle;
    }
    public void setBtnText(String btnText) 
    {
        this.btnText = btnText;
    }

    public String getBtnText() 
    {
        return btnText;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setCover(String cover) 
    {
        this.cover = cover;
    }

    public String getCover() 
    {
        return cover;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("dailyTitle", getDailyTitle())
            .append("btnText", getBtnText())
            .append("title", getTitle())
            .append("cover", getCover())
            .append("description", getDescription())
            .append("url", getUrl())
            .append("createTime", getCreateTime())
            .toString();
    }
}
