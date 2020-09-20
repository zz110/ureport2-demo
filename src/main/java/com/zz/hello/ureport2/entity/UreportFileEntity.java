package com.zz.hello.ureport2.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Data
public class UreportFileEntity {


    private Long id;
    private String name;
    private byte[] content;
    private Date createTime;
    private Date updateTime;
}
