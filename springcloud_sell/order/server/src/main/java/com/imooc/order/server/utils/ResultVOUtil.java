package com.imooc.order.server.utils;


import com.imooc.order.server.vo.ResultVO;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/9 22:20
 */
public class ResultVOUtil {
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }
}
