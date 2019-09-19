package com.ruoyi.project.his;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 模态窗口
 * 
 * @author ruoyi
 */
@Controller
@RequestMapping(HisManageController.prefix)
public class HisManageController
{
    public static final  String prefix = "his";
    public static final String INDEX = "/index";
    public static final String SHENHE = "/shenhe";
    public static final String DENGJIBU = "/dengjibu";
    public static final String REPORT = "/report";

    public static final String CRBGL = "/crbgl";
    public static final String SWBLGL = "/swblgl";
    public static final String SYXBLGL = "/syxblgl";
    public static final String MXBJCGL = "/mxbjcgl";
    public static final String LGBLJCGL = "/lgbljcgl";
    public static final String YYHTZDGL = "/yyhtzdgl";
    public static final String GWZSGL = "/gwzsgl";
    public static final String NYZDGL = "/nyzdgl";


    /**
     * 模态窗口
     */
    @GetMapping("/{model}/{function}")
    public String getPage(@PathVariable String model, @PathVariable String function)
    {
        return prefix + "/" + model + "/" + function;
    }

    /**
     * 模态窗口
     *//*
    @GetMapping(CRBGL + INDEX)
    public String index1()
    {
        return prefix + CRBGL + INDEX;
    }

    *//**
     * 模态窗口
     *//*
    @GetMapping(SWBLGL + INDEX)
    public String index2()
    {
        return prefix + SWBLGL + INDEX;
    }

    *//**
     * 模态窗口
     *//*
    @GetMapping(SYXBLGL + INDEX)
    public String index3()
    {
        return prefix + SYXBLGL + INDEX;
    }

    *//**
     * 模态窗口
     *//*
    @GetMapping(MXBJCGL + INDEX)
    public String index4()
    {
        return prefix + MXBJCGL + INDEX;
    }

    *//**
     * 模态窗口
     *//*
    @GetMapping(NYZDGL + INDEX)
    public String index5()
    {
        return prefix + NYZDGL + INDEX;
    }

    *//**
     * 模态窗口
     *//*
    @GetMapping(LGBLJCGL + INDEX)
    public String index6()
    {
        return prefix + LGBLJCGL + INDEX;
    }

    *//**
     * 模态窗口
     *//*
    @GetMapping(YYHTZDGL + INDEX)
    public String index7()
    {
        return prefix + YYHTZDGL + INDEX;
    }

    *//**
     * 模态窗口
     *//*
    @GetMapping(GWZSGL + INDEX)
    public String index8()
    {
        return prefix + GWZSGL + INDEX;
    }*/
}
