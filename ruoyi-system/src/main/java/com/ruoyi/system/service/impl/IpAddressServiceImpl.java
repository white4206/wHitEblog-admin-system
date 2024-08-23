package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.IpAddressMapper;
import com.ruoyi.system.domain.IpAddress;
import com.ruoyi.system.service.IIpAddressService;

/**
 * IP地址 Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-08-21
 */
@Service
public class IpAddressServiceImpl implements IIpAddressService 
{
    @Autowired
    private IpAddressMapper ipAddressMapper;

    /**
     * 查询IP地址 
     * 
     * @param id IP地址 主键
     * @return IP地址 
     */
    @Override
    public IpAddress selectIpAddressById(Long id)
    {
        return ipAddressMapper.selectIpAddressById(id);
    }

    /**
     * 查询IP地址 列表
     * 
     * @param ipAddress IP地址 
     * @return IP地址 
     */
    @Override
    public List<IpAddress> selectIpAddressList(IpAddress ipAddress)
    {
        return ipAddressMapper.selectIpAddressList(ipAddress);
    }

    /**
     * 新增IP地址 
     * 
     * @param ipAddress IP地址 
     * @return 结果
     */
    @Override
    public int insertIpAddress(IpAddress ipAddress)
    {
        return ipAddressMapper.insertIpAddress(ipAddress);
    }

    /**
     * 修改IP地址 
     * 
     * @param ipAddress IP地址 
     * @return 结果
     */
    @Override
    public int updateIpAddress(IpAddress ipAddress)
    {
        return ipAddressMapper.updateIpAddress(ipAddress);
    }

    /**
     * 批量删除IP地址 
     * 
     * @param ids 需要删除的IP地址 主键
     * @return 结果
     */
    @Override
    public int deleteIpAddressByIds(Long[] ids)
    {
        return ipAddressMapper.deleteIpAddressByIds(ids);
    }

    /**
     * 删除IP地址 信息
     * 
     * @param id IP地址 主键
     * @return 结果
     */
    @Override
    public int deleteIpAddressById(Long id)
    {
        return ipAddressMapper.deleteIpAddressById(id);
    }
}
