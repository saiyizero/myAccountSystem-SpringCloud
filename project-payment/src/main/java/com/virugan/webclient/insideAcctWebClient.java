package com.virugan.webclient;

import com.virugan.tables.as.hxsysAsNbfhzh;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "project-assets")
public interface insideAcctWebClient {

    @RequestMapping(value = "insideAcctWebServ/queryAcctMsgSingle",method = RequestMethod.GET,consumes = "application/json")
    public hxsysAsNbfhzh queryAcctMsgSingle(@RequestBody hxsysAsNbfhzh hxsysasnbfhzh);
}
