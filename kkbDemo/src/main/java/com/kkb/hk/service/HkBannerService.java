package com.kkb.hk.service;

import com.kkb.hk.entity.HkBanner;
import com.kkb.hk.entity.page.PageResult;
import com.kkb.hk.vo.request.banner.HkBannerRequest;
import com.kkb.hk.vo.response.banner.HkBannerResponse;

import java.util.List;

/**
 * @className HkBannerService
 * @description:  表(HkBanner)表服务接口
 * @author Allen
 * @date 2021/12/16 15:56
 */
public interface HkBannerService {

    /**
     * @description:  查询banner列表
     * @param: [hkBannerRequest]
     * @return: java.util.List<com.kkb.hk.vo.response.banner.HkBannerResponse>
     * @author Allen
     * @date: 2021/12/16 16:23
     */
    List<HkBannerResponse> qryList(HkBannerRequest hkBannerRequest);

    /**
     * @description:  查询banner列表分页查询
     * @param: [hkBannerRequest]
     * @return: com.kkb.hk.entity.page.PageResult
     * @author Allen
     * @date: 2021/12/16 16:23
     */
    PageResult qryListByPage(HkBannerRequest hkBannerRequest);

    /**
     * @description:  新增
     * @param: [hkBanner]
     * @return: int
     * @author ZJJ
     * @date: 2021/12/31 17:00
     */

    int insertHkBanner(HkBanner hkBanner);

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
     * @return: int
     * @author ZJJ
     * @date: 2021/12/31 17:00
     */

    HkBanner findHkBannerById(int id);
}
