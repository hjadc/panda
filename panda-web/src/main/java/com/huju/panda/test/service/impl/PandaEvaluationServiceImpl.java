package com.huju.panda.test.service.impl;

import com.huju.panda.test.dao.PandaEvaluationMyDao;
import com.huju.panda.test.service.PandaEvaluationService;
import com.huju.panda.test.vo.IndexVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by v_huju on 2018/2/2.
 */
@Service
public class PandaEvaluationServiceImpl implements PandaEvaluationService{

    @Autowired
    private PandaEvaluationMyDao pandaEvaluationMyDao;

    public List<IndexVo> getIndex() {
        return pandaEvaluationMyDao.getIndex();
    }
}
