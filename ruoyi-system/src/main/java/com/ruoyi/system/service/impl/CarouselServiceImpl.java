package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CarouselMapper;
import com.ruoyi.system.domain.Carousel;
import com.ruoyi.system.service.ICarouselService;

/**
 * 轮播图Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-07-17
 */
@Service
public class CarouselServiceImpl implements ICarouselService 
{
    @Autowired
    private CarouselMapper carouselMapper;

    /**
     * 查询轮播图
     * 
     * @param id 轮播图主键
     * @return 轮播图
     */
    @Override
    public Carousel selectCarouselById(Long id)
    {
        return carouselMapper.selectCarouselById(id);
    }

    /**
     * 查询轮播图列表
     * 
     * @param carousel 轮播图
     * @return 轮播图
     */
    @Override
    public List<Carousel> selectCarouselList(Carousel carousel)
    {
        return carouselMapper.selectCarouselList(carousel);
    }

    /**
     * 新增轮播图
     * 
     * @param carousel 轮播图
     * @return 结果
     */
    @Override
    public int insertCarousel(Carousel carousel)
    {
        return carouselMapper.insertCarousel(carousel);
    }

    /**
     * 修改轮播图
     * 
     * @param carousel 轮播图
     * @return 结果
     */
    @Override
    public int updateCarousel(Carousel carousel)
    {
        return carouselMapper.updateCarousel(carousel);
    }

    /**
     * 批量删除轮播图
     * 
     * @param ids 需要删除的轮播图主键
     * @return 结果
     */
    @Override
    public int deleteCarouselByIds(Long[] ids)
    {
        return carouselMapper.deleteCarouselByIds(ids);
    }

    /**
     * 删除轮播图信息
     * 
     * @param id 轮播图主键
     * @return 结果
     */
    @Override
    public int deleteCarouselById(Long id)
    {
        return carouselMapper.deleteCarouselById(id);
    }
}
