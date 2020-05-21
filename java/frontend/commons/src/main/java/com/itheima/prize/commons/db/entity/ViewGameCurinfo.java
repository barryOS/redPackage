package com.itheima.prize.commons.db.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class ViewGameCurinfo implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_game_curinfo.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_game_curinfo.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_game_curinfo.starttime
     *
     * @mbg.generated
     */
    private Date starttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_game_curinfo.endtime
     *
     * @mbg.generated
     */
    private Date endtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_game_curinfo.type
     *
     * @mbg.generated
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_game_curinfo.total
     *
     * @mbg.generated
     */
    private BigDecimal total;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column view_game_curinfo.hit
     *
     * @mbg.generated
     */
    private Long hit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table view_game_curinfo
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_game_curinfo.id
     *
     * @return the value of view_game_curinfo.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_game_curinfo.id
     *
     * @param id the value for view_game_curinfo.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_game_curinfo.title
     *
     * @return the value of view_game_curinfo.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_game_curinfo.title
     *
     * @param title the value for view_game_curinfo.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_game_curinfo.starttime
     *
     * @return the value of view_game_curinfo.starttime
     *
     * @mbg.generated
     */
    public Date getStarttime() {
        return starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_game_curinfo.starttime
     *
     * @param starttime the value for view_game_curinfo.starttime
     *
     * @mbg.generated
     */
    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_game_curinfo.endtime
     *
     * @return the value of view_game_curinfo.endtime
     *
     * @mbg.generated
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_game_curinfo.endtime
     *
     * @param endtime the value for view_game_curinfo.endtime
     *
     * @mbg.generated
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_game_curinfo.type
     *
     * @return the value of view_game_curinfo.type
     *
     * @mbg.generated
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_game_curinfo.type
     *
     * @param type the value for view_game_curinfo.type
     *
     * @mbg.generated
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_game_curinfo.total
     *
     * @return the value of view_game_curinfo.total
     *
     * @mbg.generated
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_game_curinfo.total
     *
     * @param total the value for view_game_curinfo.total
     *
     * @mbg.generated
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column view_game_curinfo.hit
     *
     * @return the value of view_game_curinfo.hit
     *
     * @mbg.generated
     */
    public Long getHit() {
        return hit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column view_game_curinfo.hit
     *
     * @param hit the value for view_game_curinfo.hit
     *
     * @mbg.generated
     */
    public void setHit(Long hit) {
        this.hit = hit;
    }
}