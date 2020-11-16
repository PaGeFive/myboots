package com.pgf.initlogin.common.result;

import lombok.Data;

/**
 * @author pgf
 */
@Data
public class CommonResult {
    private int code;
    private String msg;
    private Object data;

    public static CommonResult fail(int code,String msg){
        return fail(code,msg,null);
    }



    public static CommonResult success(Object data){
        return success(200,"成功", data);
    }

    /**
     * 通用返回
     * @param code
     * @param msg
     * @param data
     * @return
     */
    public static CommonResult success(int code,String msg,Object data){
        CommonResult result = new CommonResult();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static CommonResult fail(int code,String msg,Object data){
        CommonResult result = new CommonResult();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

}
