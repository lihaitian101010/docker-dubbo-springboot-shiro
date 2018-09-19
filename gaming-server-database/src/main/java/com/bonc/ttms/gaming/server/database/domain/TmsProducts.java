package com.bonc.ttms.gaming.server.database.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "tms_products")
public class TmsProducts {
    /**
     * 自增长主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 产品编号
     */
    private String code;

    /**
     * 产品名称
     */
    private String name;

    /**
     * 团号Id
     */
    @Column(name = "teamId")
    private Integer teamid;

    /**
     * 特殊提示
     */
    @Column(name = "exText")
    private String extext;

    /**
     * 上架时间
     */
    @Column(name = "onlineDate")
    private Date onlinedate;

    /**
     * 下架时间
     */
    @Column(name = "offlineDate")
    private Date offlinedate;

    /**
     * 预售数量
     */
    private Integer quantity;

    /**
     * 最低数量
     */
    @Column(name = "minQty")
    private Integer minqty;

    /**
     * 已售数量
     */
    @Column(name = "soldQty")
    private Integer soldqty;

    /**
     * 产品价格
     */
    private Long price;

    /**
     * 产品分类编号
     */
    @Column(name = "classId")
    private Integer classid;

    /**
     * 晚数
     */
    private Integer nights;

    /**
     * 产品状态  0：待售  1：上架   2：下架
     */
    private Integer state;

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
     * 最后修改人用户名
     */
    @Column(name = "modifiedUser")
    private String modifieduser;

    /**
     * 最后修改时间
     */
    @Column(name = "modifiedTime")
    private Date modifiedtime;

    /**
     * 获取自增长主键
     *
     * @return id - 自增长主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增长主键
     *
     * @param id 自增长主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取产品编号
     *
     * @return code - 产品编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置产品编号
     *
     * @param code 产品编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取产品名称
     *
     * @return name - 产品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置产品名称
     *
     * @param name 产品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取团号Id
     *
     * @return teamId - 团号Id
     */
    public Integer getTeamid() {
        return teamid;
    }

    /**
     * 设置团号Id
     *
     * @param teamid 团号Id
     */
    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    /**
     * 获取特殊提示
     *
     * @return exText - 特殊提示
     */
    public String getExtext() {
        return extext;
    }

    /**
     * 设置特殊提示
     *
     * @param extext 特殊提示
     */
    public void setExtext(String extext) {
        this.extext = extext;
    }

    /**
     * 获取上架时间
     *
     * @return onlineDate - 上架时间
     */
    public Date getOnlinedate() {
        return onlinedate;
    }

    /**
     * 设置上架时间
     *
     * @param onlinedate 上架时间
     */
    public void setOnlinedate(Date onlinedate) {
        this.onlinedate = onlinedate;
    }

    /**
     * 获取下架时间
     *
     * @return offlineDate - 下架时间
     */
    public Date getOfflinedate() {
        return offlinedate;
    }

    /**
     * 设置下架时间
     *
     * @param offlinedate 下架时间
     */
    public void setOfflinedate(Date offlinedate) {
        this.offlinedate = offlinedate;
    }

    /**
     * 获取预售数量
     *
     * @return quantity - 预售数量
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * 设置预售数量
     *
     * @param quantity 预售数量
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * 获取最低数量
     *
     * @return minQty - 最低数量
     */
    public Integer getMinqty() {
        return minqty;
    }

    /**
     * 设置最低数量
     *
     * @param minqty 最低数量
     */
    public void setMinqty(Integer minqty) {
        this.minqty = minqty;
    }

    /**
     * 获取已售数量
     *
     * @return soldQty - 已售数量
     */
    public Integer getSoldqty() {
        return soldqty;
    }

    /**
     * 设置已售数量
     *
     * @param soldqty 已售数量
     */
    public void setSoldqty(Integer soldqty) {
        this.soldqty = soldqty;
    }

    /**
     * 获取产品价格
     *
     * @return price - 产品价格
     */
    public Long getPrice() {
        return price;
    }

    /**
     * 设置产品价格
     *
     * @param price 产品价格
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 获取产品分类编号
     *
     * @return classId - 产品分类编号
     */
    public Integer getClassid() {
        return classid;
    }

    /**
     * 设置产品分类编号
     *
     * @param classid 产品分类编号
     */
    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    /**
     * 获取晚数
     *
     * @return nights - 晚数
     */
    public Integer getNights() {
        return nights;
    }

    /**
     * 设置晚数
     *
     * @param nights 晚数
     */
    public void setNights(Integer nights) {
        this.nights = nights;
    }

    /**
     * 获取产品状态  0：待售  1：上架   2：下架
     *
     * @return state - 产品状态  0：待售  1：上架   2：下架
     */
    public Integer getState() {
        return state;
    }

    /**
     * 设置产品状态  0：待售  1：上架   2：下架
     *
     * @param state 产品状态  0：待售  1：上架   2：下架
     */
    public void setState(Integer state) {
        this.state = state;
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
     * 获取最后修改人用户名
     *
     * @return modifiedUser - 最后修改人用户名
     */
    public String getModifieduser() {
        return modifieduser;
    }

    /**
     * 设置最后修改人用户名
     *
     * @param modifieduser 最后修改人用户名
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