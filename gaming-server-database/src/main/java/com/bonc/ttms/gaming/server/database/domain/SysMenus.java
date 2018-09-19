package com.bonc.ttms.gaming.server.database.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_menus")
public class SysMenus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 资源URL
     */
    private String url;

    /**
     * 类型     1：菜单   2：按钮
     */
    private Integer type;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 备注
     */
    private String note;

    /**
     * 父菜单ID，一级菜单为0
     */
    @Column(name = "parentId")
    private Integer parentid;

    /**
     * 授权(如：user:create)
     */
    private String permission;

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
     * 获取资源名称
     *
     * @return name - 资源名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置资源名称
     *
     * @param name 资源名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取资源URL
     *
     * @return url - 资源URL
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置资源URL
     *
     * @param url 资源URL
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取类型     1：菜单   2：按钮
     *
     * @return type - 类型     1：菜单   2：按钮
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型     1：菜单   2：按钮
     *
     * @param type 类型     1：菜单   2：按钮
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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
     * 获取父菜单ID，一级菜单为0
     *
     * @return parentId - 父菜单ID，一级菜单为0
     */
    public Integer getParentid() {
        return parentid;
    }

    /**
     * 设置父菜单ID，一级菜单为0
     *
     * @param parentid 父菜单ID，一级菜单为0
     */
    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取授权(如：user:create)
     *
     * @return permission - 授权(如：user:create)
     */
    public String getPermission() {
        return permission;
    }

    /**
     * 设置授权(如：user:create)
     *
     * @param permission 授权(如：user:create)
     */
    public void setPermission(String permission) {
        this.permission = permission;
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