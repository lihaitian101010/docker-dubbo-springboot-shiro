package com.bonc.ttms.gaming.server.database.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tms_projects")
public class TmsProjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 项目编码
     */
    private String code;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 开始日期
     */
    @Column(name = "beginDate")
    private Date begindate;

    /**
     * 结束日期
     */
    @Column(name = "endDate")
    private Date enddate;

    /**
     * 是否有效
     */
    private Boolean valid;

    /**
     * 备注
     */
    private String note;

    /**
     * 创建时间
     */
    @Column(name = "createdTime")
    private Date createdtime;

    /**
     * 修改时间
     */
    @Column(name = "modifiedTime")
    private Date modifiedtime;

    /**
     * 创建用户
     */
    @Column(name = "createdUser")
    private String createduser;

    /**
     * 修改用户
     */
    @Column(name = "modifiedUser")
    private String modifieduser;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取项目编码
     *
     * @return code - 项目编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置项目编码
     *
     * @param code 项目编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取项目名称
     *
     * @return name - 项目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置项目名称
     *
     * @param name 项目名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取开始日期
     *
     * @return beginDate - 开始日期
     */
    public Date getBegindate() {
        return begindate;
    }

    /**
     * 设置开始日期
     *
     * @param begindate 开始日期
     */
    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    /**
     * 获取结束日期
     *
     * @return endDate - 结束日期
     */
    public Date getEnddate() {
        return enddate;
    }

    /**
     * 设置结束日期
     *
     * @param enddate 结束日期
     */
    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    /**
     * 获取是否有效
     *
     * @return valid - 是否有效
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * 设置是否有效
     *
     * @param valid 是否有效
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
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
     * 获取修改时间
     *
     * @return modifiedTime - 修改时间
     */
    public Date getModifiedtime() {
        return modifiedtime;
    }

    /**
     * 设置修改时间
     *
     * @param modifiedtime 修改时间
     */
    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    /**
     * 获取创建用户
     *
     * @return createdUser - 创建用户
     */
    public String getCreateduser() {
        return createduser;
    }

    /**
     * 设置创建用户
     *
     * @param createduser 创建用户
     */
    public void setCreateduser(String createduser) {
        this.createduser = createduser;
    }

    /**
     * 获取修改用户
     *
     * @return modifiedUser - 修改用户
     */
    public String getModifieduser() {
        return modifieduser;
    }

    /**
     * 设置修改用户
     *
     * @param modifieduser 修改用户
     */
    public void setModifieduser(String modifieduser) {
        this.modifieduser = modifieduser;
    }
}