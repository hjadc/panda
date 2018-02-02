package com.huju.panda.test.service;

import com.huju.panda.test.vo.IndexVo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by v_huju on 2018/2/2.
 */
public interface PandaEvaluationService {

    List<IndexVo> getIndex();
}
