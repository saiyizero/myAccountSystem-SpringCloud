CREATE TABLE `hxsys_ap_prptis` (
  `intseqno` int(10) NOT NULL COMMENT '参数序号',
  `cansname` varchar(50) NOT NULL COMMENT '参数名称',
  `cansvaul` varchar(500) NOT NULL COMMENT '参数值',
  `servname` varchar(50) NOT NULL COMMENT '服务名称',
  `ementnme` varchar(50) NOT NULL COMMENT '环境名称',
  `fenzinme` varchar(50) NOT NULL COMMENT '分支名称',
  PRIMARY KEY (`intseqno`),
  KEY `hxsys_ap_prptis_idx1` (`servname`,`ementnme`,`fenzinme`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='子服务参数配置表';