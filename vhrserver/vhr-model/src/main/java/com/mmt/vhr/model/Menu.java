package com.mmt.vhr.model;

import java.util.List;

public class Menu {
    private List<Menu> children;

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.id
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.url
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String url;

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.path
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String path;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.component
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String component;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.name
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.iconCls
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private String iconCls;

    private Meta meta;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.parentId
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.enabled
     *
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    private Boolean enabled;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.id
     *
     * @return the value of menu.id
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.id
     *
     * @param id the value for menu.id
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.url
     *
     * @return the value of menu.url
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.url
     *
     * @param url the value for menu.url
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.path
     *
     * @return the value of menu.path
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getPath() {
        return path;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.path
     *
     * @param path the value for menu.path
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.component
     *
     * @return the value of menu.component
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getComponent() {
        return component;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.component
     *
     * @param component the value for menu.component
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setComponent(String component) {
        this.component = component == null ? null : component.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.name
     *
     * @return the value of menu.name
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.name
     *
     * @param name the value for menu.name
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.iconCls
     *
     * @return the value of menu.iconCls
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public String getIconCls() {
        return iconCls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.iconCls
     *
     * @param iconCls the value for menu.iconCls
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setIconCls(String iconCls) {
        this.iconCls = iconCls == null ? null : iconCls.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.parentId
     *
     * @return the value of menu.parentId
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.parentId
     *
     * @param parentId the value for menu.parentId
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.enabled
     *
     * @return the value of menu.enabled
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.enabled
     *
     * @param enabled the value for menu.enabled
     * @mbg.generated Mon Mar 23 22:38:18 CST 2020
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}