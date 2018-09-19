package com.bonc.ttms.gaming.server.database.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "sys_users")
public class SysUsers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 盐  密码加密时前缀，使加密后的值不同
     */
    private String salt;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 状态  0：禁用   1：正常  默认值 ：1
     */
    private Byte valid;

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
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取盐  密码加密时前缀，使加密后的值不同
     *
     * @return salt - 盐  密码加密时前缀，使加密后的值不同
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 设置盐  密码加密时前缀，使加密后的值不同
     *
     * @param salt 盐  密码加密时前缀，使加密后的值不同
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取状态  0：禁用   1：正常  默认值 ：1
     *
     * @return valid - 状态  0：禁用   1：正常  默认值 ：1
     */
    public Byte getValid() {
        return valid;
    }

    /**
     * 设置状态  0：禁用   1：正常  默认值 ：1
     *
     * @param valid 状态  0：禁用   1：正常  默认值 ：1
     */
    public void setValid(Byte valid) {
        this.valid = valid;
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