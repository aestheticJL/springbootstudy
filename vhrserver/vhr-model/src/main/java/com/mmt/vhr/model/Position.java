package com.mmt.vhr.model;

import java.util.Date;

public class Position {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.id
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.name
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.createDate
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column position.enabled
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Boolean enabled;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.id
     *
     * @return the value of position.id
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.id
     *
     * @param id the value for position.id
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.name
     *
     * @return the value of position.name
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.name
     *
     * @param name the value for position.name
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.createDate
     *
     * @return the value of position.createDate
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.createDate
     *
     * @param createDate the value for position.createDate
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column position.enabled
     *
     * @return the value of position.enabled
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column position.enabled
     *
     * @param enabled the value for position.enabled
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}