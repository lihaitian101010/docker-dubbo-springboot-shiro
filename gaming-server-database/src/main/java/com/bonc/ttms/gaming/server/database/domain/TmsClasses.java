package com.bonc.ttms.gaming.server.database.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tms_classes")
public class TmsClasses {
    /**
     * 分类主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 分类名称
     */
    private String name;

    /**
     * 分类序号
     */
    private Integer sort;

    /**
     * 父类id 
     */
    @Column(name = "parentId")
    private Integer parentid;

    /**
     * 备注
     */
    private String note;

    /**
     * 创建人用户名
     */
    @Column(name = "createdUser")
    private String createduser;

    /**
     * 创建时间
     */
    @Column(name = "createdTime")
    private Date createdtime;

    /**
     * 修改人用户名
     */
    @Column(name = "modifiedUser")
    private String modifieduser;

    /**
     * 最后修改时间
     */
    @Column(name = "modifiedTime")
    private Date modifiedtime;

    /**
     * 获取分类主键
     *
     * @return id - 分类主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置分类主键
     *
     * @param id 分类主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取分类名称
     *
     * @return name - 分类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置分类名称
     *
     * @param name 分类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取分类序号
     *
     * @return sort - 分类序号
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置分类序号
     *
     * @param sort 分类序号
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取父类id 
     *
     * @return parentId - 父类id 
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父类id 
     *
     * @param parentid 父类id 
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取备注
     *
     * @return note - 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     *
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 获取创建人用户名
     *
     * @return createdUser - 创建人用户名
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * 设置创建人用户名
     *
     * @param createduser 创建人用户名
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * 获取创建时间
     *
     * @return createdTime - 创建时间
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * 设置创建时间
     *
     * @param createdtime 创建时间
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * 获取修改人用户名
     *
     * @return modifiedUser - 修改人用户名
     */
    public String getModifieduser() {
        return modifieduser;
    }

    /**
     * 设置修改人用户名
     *
     * @param modifieduser 修改人用户名
     */
    public void setModifieduser(String modifieduser) {
        this.modifieduser = modifieduser;
    }

    /**
     * 获取最后修改时间
     *
     * @return modifiedTime - 最后修改时间
     */
    public Date getModifiedtime() {
        return modifiedtime;
    }

    /**
     * 设置最后修改时间
     *
     * @param modifiedtime 最后修改时间
     */
    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }
}