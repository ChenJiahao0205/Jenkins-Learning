package pers.chenjiahao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Jenkins示例代码
 * @author ChenJiahao(五条)
 * @date 2024/08/11 15:19:12
 */
@RestController
public class JenkinsDemoController {

    @GetMapping("demo01")
    public Object jenkinsDemo01(){
        return "jenkinsDemo01";
    }

    @GetMapping("demo02")
    public Object jenkinsDemo02(){
        return "jenkinsDemo02-提交代码自动化部署测试";
    }

    @GetMapping("demo03")
    public Object jenkinsDemo03(){
        return "jenkinsDemo03-提交代码自动化部署测试";
    }

    @GetMapping("demo04")
    public Object jenkinsDemo04(){
        return "jenkinsDemo04-提交代码自动化部署测试";
    }
}
