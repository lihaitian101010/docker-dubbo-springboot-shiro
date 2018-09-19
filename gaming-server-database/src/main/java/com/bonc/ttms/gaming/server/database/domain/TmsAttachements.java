package com.bonc.ttms.gaming.server.database.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tms_attachements")
public class TmsAttachements {
    /**
     * 附件主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 标题
     */
    private String title;

    /**
     * 文件名称 
     */
    @Column(name = "fileName")
    private String filename;

    /**
     * 文件类型
     */
    @Column(name = "contentType")
    private String contenttype;

    /**
     * 备注
     */
    @Column(name = "filePath")
    private String filepath;

    /**
     * 文件摘要
     */
    @Column(name = "fileDisgest")
    private String filedisgest;

    /**
     * 附件归属类型
     */
    @Column(name = "athType")
    private Integer athtype;

    /**
     * 归属对象id
     */
    @Column(name = "belongId")
    private Integer belongid;

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
     * 获取附件主键
     *
     * @return id - 附件主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置附件主键
     *
     * @param id 附件主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取文件名称 
     *
     * @return fileName - 文件名称 
     */
    public String getFilename() {
        return filename;
    }

    /**
     * 设置文件名称 
     *
     * @param filename 文件名称 
     */
    public void setFilename(String filename) {
        this.filename = filename;
    }

    /**
     * 获取文件类型
     *
     * @return contentType - 文件类型
     */
    public String getContenttype() {
        return contenttype;
    }

    /**
     * 设置文件类型
     *
     * @param contenttype 文件类型
     */
    public void setContenttype(String contenttype) {
        this.contenttype = contenttype;
    }

    /**
     * 获取备注
     *
     * @return filePath - 备注
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * 设置备注
     *
     * @param filepath 备注
     */
    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    /**
     * 获取文件摘要
     *
     * @return fileDisgest - 文件摘要
     */
    public String getFiledisgest() {
        return filedisgest;
    }

    /**
     * 设置文件摘要
     *
     * @param filedisgest 文件摘要
     */
    public void setFiledisgest(String filedisgest) {
        this.filedisgest = filedisgest;
    }

    /**
     * 获取附件归属类型
     *
     * @return athType - 附件归属类型
     */
    public Integer getAthtype() {
        return athtype;
    }

    /**
     * 设置附件归属类型
     *
     * @param athtype 附件归属类型
     */
    public void setAthtype(Integer athtype) {
        this.athtype = athtype;
    }

    /**
     * 获取归属对象id
     *
     * @return belongId - 归属对象id
     */
    public Integer getBelongid() {
        return belongid;
    }

    /**
     * 设置归属对象id
     *
     * @param belongid 归属对象id
     */
    public void setBelongid(Integer belongid) {
        this.belongid = belongid;
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