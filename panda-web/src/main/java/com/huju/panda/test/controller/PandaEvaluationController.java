package com.huju.panda.test.controller;

import com.alibaba.fastjson.JSONObject;
import com.huju.panda.test.service.PandaEvaluationService;
import com.huju.panda.test.vo.IndexVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Contended;

import java.util.List;

/**
 * Created by v_huju on 2018/2/2.
 */
@Controller
@RequestMapping("/test")
public class PandaEvaluationController {

    @Autowired
    private PandaEvaluationService pandaEvaluationService;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        List<IndexVo> index = pandaEvaluationService.getIndex();
        return JSONObject.toJSONString(index);
    }
}