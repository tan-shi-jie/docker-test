package org.jeecg.modules.api.controller;

import com.netflix.client.http.HttpResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;


/**
 * 服务化 system模块 对外接口请求类
 */
@RestController
@RequestMapping("/sys/api")
public class SystemAPIController {


    /**
     * 发送系统消息
     */
    @GetMapping("/")
    public void sendSysAnnouncement(HttpServletResponse httpResponse) throws IOException {

        httpResponse.getWriter().println("HellWorld!");
    }


}
