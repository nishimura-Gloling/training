package com.example.demo.util;


import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Version;

/**
 * DB共通Entity
 */
@MappedSuperclass
public class UtilEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 登録日 */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "regdate")
    private Date regdate;

    /** 更新日 */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "upddate")
    private Date upddate ;

    /** バージョン */
    @Version
    @Column(name = "VERSION")
    private Integer version;
}
