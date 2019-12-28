package com.virugan.webclient;

import com.virugan.tables.as.hxsysAsNbfhzh;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "project-assets")
public interface insideAcctWebClient {

    @GetMapping("insideAcctWebServ/queryAcctMsgSingle")
    public hxsysAsNbfhzh queryAcctMsgSingle(hxsysAsNbfhzh hxsysasnbfhzh);
}
