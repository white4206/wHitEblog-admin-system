package com.ruoyi.system.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * IP地址 对象 ip_address
 *
 * @author ruoyi
 * @date 2024-08-21
 */
public class IpAddress extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * ip id
     */
    private Long id;

    /**
     * ip
     */
    @Excel(name = "ip")
    private String ip;

    /**
     * 归属地
     */
    @Excel(name = "归属地")
    private String address;

    /**
     * 访问时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Excel(name = "访问时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date accessTime;

    /**
     * 访问设备
     */
    @Excel(name = "访问设备")
    private String accessOs;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAccessTime(Date accessTime) {
        this.accessTime = accessTime;
    }

    public Date getAccessTime() {
        return accessTime;
    }

    public void setAccessOs(String accessOs) {
        this.accessOs = accessOs;
    }

    public String getAccessOs() {
        return accessOs;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("ip", getIp())
                .append("address", getAddress())
                .append("accessTime", getAccessTime())
                .append("accessOs", getAccessOs())
                .toString();
    }
}
