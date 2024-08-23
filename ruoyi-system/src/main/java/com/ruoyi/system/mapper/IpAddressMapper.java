package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.IpAddress;

/**
 * IP地址 Mapper接口
 * 
 * @author ruoyi
 * @date 2024-08-21
 */
public interface IpAddressMapper 
{
    /**
     * 查询IP地址 
     * 
     * @param id IP地址 主键
     * @return IP地址 
     */
    public IpAddress selectIpAddressById(Long id);

    /**
     * 查询IP地址 列表
     * 
     * @param ipAddress IP地址 
     * @return IP地址 集合
     */
    public List<IpAddress> selectIpAddressList(IpAddress ipAddress);

    /**
     * 新增IP地址 
     * 
     * @param ipAddress IP地址 
     * @return 结果
     */
    public int insertIpAddress(IpAddress ipAddress);

    /**
     * 修改IP地址 
     * 
     * @param ipAddress IP地址 
     * @return 结果
     */
    public int updateIpAddress(IpAddress ipAddress);

    /**
     * 删除IP地址 
     * 
     * @param id IP地址 主键
     * @return 结果
     */
    public int deleteIpAddressById(Long id);

    /**
     * 批量删除IP地址 
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteIpAddressByIds(Long[] ids);
}
