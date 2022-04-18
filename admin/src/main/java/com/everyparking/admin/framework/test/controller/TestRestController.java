package com.everyparking.admin.framework.test.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.everyparking.admin.framework.common.controller.BaseController;
import com.everyparking.admin.framework.common.vo.Ajax;
import com.everyparking.admin.framework.test.service.TestService;

@RestController
@RequestMapping("/test")
public class TestRestController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(TestRestController.class);

    @Autowired
    private TestService testService;

    @RequestMapping("/testAjax")
    public ModelAndView testAjax(@RequestBody HashMap<String, Object> params){

        ModelAndView mav = createMav();
        try {
            mav = createMav(testService.getDBTest(params), testService.getDBTestCount(params));
        }catch (Exception e){
            logger.error(e.getMessage());
            super.setMessage(mav, Ajax.SEARCH.TEXT+"."+Ajax.TYPE_FAIL);
        }
        return mav;
    }

    @RequestMapping("/testSaveAjax")
    public ModelAndView testSaveAjax(@RequestBody HashMap<String,Object> params){
        ModelAndView mav = createMav(Ajax.SAVE.TEXT+"."+Ajax.TYPE_SUCCESS);
        try {
            mav = createMav(testService.DBUploadTest("1"));
        }catch (Exception e){
            logger.error(e.getMessage());
            super.setMessage(mav, Ajax.SAVE.TEXT+"."+Ajax.TYPE_FAIL);
        }
        return mav;
    }

    @RequestMapping("/ajaxCall")
    public ModelAndView testajaxCall(@RequestBody HashMap<String,Object> params){
        ModelAndView mav = createMav(Ajax.SAVE.TEXT+"."+Ajax.TYPE_SUCCESS);
        try {
            mav = createMav();
        }catch (Exception e){
            logger.error(e.getMessage());
            super.setMessage(mav, Ajax.SAVE.TEXT+"."+Ajax.TYPE_FAIL);
        }
        return mav;
    }

    @RequestMapping("/insertTest")
    public ModelAndView insertTest(@RequestBody HashMap<String,Object> params) throws Exception{
        ModelAndView mav = super.createMav();
        try {
            mav = super.createMav(testService.insertTest());
            super.setMessage(mav, Ajax.DELETE.TEXT+"."+Ajax.TYPE_SUCCESS);
        }catch (Exception e){
            logger.error(e.getMessage());
            super.setCustomMessage(mav, Ajax.TYPE_FAIL, e.getMessage());
        }
        return mav;
    }

}
