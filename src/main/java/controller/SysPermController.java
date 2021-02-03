package controller;



import .service.SysPermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 权限管理
 *
 * @author zzq
 * @version 1.0.0
 * @date 2021/01/26 16:05:31
 * @copyright www.ucarinc.com All Rights Reserved.
 */
@Controller
@RequestMapping("/sysPerm/")
public class SysPermController {

    @Autowired
    private SysPermService sysPermService;

}