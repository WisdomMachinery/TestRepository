package com.kkb.hk.dao;

import com.kkb.hk.entity.HkBanner;
import com.kkb.hk.vo.request.banner.HkBannerRequest;
import com.kkb.hk.vo.response.banner.HkBannerResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @className HkBannerDao
 * @description:  表(HkBanner)表数据库访问层
 * @author Allen
 * @date 2021/12/16 15:49
 */
@Mapper
public interface HkBannerDao {

    /**
     * @description:查询banner列表
     * @param: [hkBannerRequest]
     * @return: java.util.List<com.kkb.hk.vo.response.banner.HkBannerResponse>
     * @author Allen
     * @date: 2021/12/16 16:25
     */
    List<HkBannerResponse> qryList(HkBannerRequest hkBannerRequest);

    /**
     * @description:查询banner列表分页查询
     * @param: [hkBannerRequest]
     * @return: java.util.List<com.kkb.hk.vo.response.banner.HkBannerResponse>
     * @author Allen
     * @date: 2021/12/16 16:27
     */
    List<HkBannerResponse> qryListByPage(HkBannerRequest hkBannerRequest);


    /**
     * @description:  新增
     * @param: [hkBanner]
     * @return:int
     * @author ZJJ
     * @date: 2021/12/31 17:00
     */

    int addList(HkBanner hkBanner);

    /**
     * @description:  根据id删除
     * @param: [hkBanner]
     * @return: int
     * @author ZJJ
     * @date: 2021/12/31 17:00
     */
    int deleteHkBanner(int id);

    /**
     * @description:  修改
     * @param: [hkBanner]
     * @return: int
     * @author ZJJ
     * @date: 2021/12/31 17:00
     */
    int updateHkBanner(HkBanner hkBanner);
    /**
     * @description:  查询
     * @param: [hkBanner]
     * @return: HkBanner
     * @author ZJJ
     * @date: 2021/12/31 17:00
     */
    HkBanner findHkBannerById(int id);
}

