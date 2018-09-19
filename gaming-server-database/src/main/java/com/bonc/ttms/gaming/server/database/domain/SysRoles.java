package com.bonc.ttms.gaming.server.database.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_roles")
public class SysRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色名称
     */
    private String name;

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
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取角色名称
     *
     * @return name - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name;
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