package cn.lu.demo.idworkerconsumer.controller;

import cn.bdqn.shop.service.IdWorkerService;
import cn.lu.demo.idworkerconsumer.pojo.IdWorker;
import com.alibaba.boot.dubbo.annotation.DubboConsumer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdWorkerController {
    @DubboConsumer
    private IdWorkerService idWorkerService;

    @RequestMapping("getId")
    public IdWorker getId(){

        long id = idWorkerService.getId();

        IdWorker idWorker = new IdWorker();
        idWorker.setId(id);

        if(id <= 0){
            idWorker.setId(0);
        }
        return idWorker;
    }
}
