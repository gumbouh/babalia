package com.gumbou.babalia.modules.test.controller;

import com.gumbou.babalia.common.api.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(tags = "testController")
@Tag(name = "testController",description = "测试")
@Controller
@RequestMapping("/test")
public class TestController {

    @ApiOperation("测试")
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<String> getBrandList() {
        return CommonResult.success("hello");
    }
}
