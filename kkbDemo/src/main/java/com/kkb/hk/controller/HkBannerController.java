package com.kkb.hk.controller;

import com.kkb.hk.entity.HkBanner;
import com.kkb.hk.service.HkBannerService;
import com.kkb.hk.utils.ReqResultUtil;
import com.kkb.hk.vo.request.banner.HkBannerRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @className HkBannerController
 * @description:banner接口层
 * @author Allen
 * @date 2021/12/16 15:48
 */
@RestController
@RequestMapping("hkBanner")
@Slf4j
public class HkBannerController {


    @Resource
    private HkBannerService hkBannerService;

    /**
     * @description:  查询banner列表
     * @param: []
     * @return: org.springframework.http.ResponseEntity<java.lang.String>
     * @author Allen
     * @date: 2021/12/16 15:48
     */
    @RequestMapping(value = "/qryList", method = RequestMethod.POST)
    public ResponseEntity<String> qryList(HkBannerRequest hkBannerRequest) {
        log.info("进入banner列表接口");
        log.info("开始");
        return ReqResultUtil.genSuccessResultResponse(hkBannerService.qryList(hkBannerRequest));

    }

    /**
     * @description:分页查询banner列表
     * @param: [hkBannerRequest]
     * @return: org.springframework.http.ResponseEntity<java.lang.String>
     * @author Allen
     * @date: 2021/12/16 18:53
     */
    @RequestMapping(value = "/qryListByPage", method = RequestMethod.POST)
    public ResponseEntity<String> qryListByPage(HkBannerRequest hkBannerRequest) {
        log.info("进入banner列表接口");
        return ReqResultUtil.genSuccessResultResponse(hkBannerService.qryListByPage(hkBannerRequest));
    }

    /**
     * 新增HkBanner信息
     * @param hkBanner
     * @return
     */
    @RequestMapping(value = "/insertHkBanner",method = RequestMethod.POST)
    public int insertHkBanner(@RequestBody HkBanner hkBanner){
        int result = hkBannerService.insertHkBanner(hkBanner);
        return result;
    }


    /**
     * 根据id删除HkBanner信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteHkBanner/{id}",method = RequestMethod.POST)
    public int deleteHkBanner(@PathVariable("id") int id){
        int result = hkBannerService.deleteHkBanner(id);
        return result;
    }

    /**
     * 修改HkBanner信息
     * @param
     * @return
     */
    @RequestMapping(value = "/updateHkBanner",method = RequestMethod.POST)
    public int deleteHkBanner(@RequestBody HkBanner hkBanner){
        int result = hkBannerService.updateHkBanner(hkBanner);
        return result;
    }
    /**
     * 根据id查询HkBanner信息
     * @param
     * @return
     */
    @RequestMapping(value = "/findHkBannerById/{id}",method = RequestMethod.POST)
    public HkBanner findHkBannerById(@PathVariable("id") int id){
        return this.hkBannerService.findHkBannerById(id);
    }



}

