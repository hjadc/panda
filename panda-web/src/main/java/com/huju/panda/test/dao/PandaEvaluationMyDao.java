package com.huju.panda.test.dao;

import com.huju.panda.test.vo.IndexVo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by v_huju on 2018/2/2.
 */
@Repository("pandaEvaluationMyDao")
public interface PandaEvaluationMyDao {

    @Select("SELECT * FROM kpi_index")
    List<IndexVo> getIndex();
}
