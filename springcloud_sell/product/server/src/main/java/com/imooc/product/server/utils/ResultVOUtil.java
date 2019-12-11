package com.imooc.product.server.utils;


import com.imooc.product.server.vo.ResultVO;

/**
 * @author ：menglc
 * @date ：Created in 2019/12/4 10:57
 */
public class ResultVOUtil {
    
    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
