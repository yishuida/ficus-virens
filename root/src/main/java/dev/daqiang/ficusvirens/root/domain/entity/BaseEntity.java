package dev.daqiang.ficusvirens.root.domain.entity;

import java.util.Date;

/**
 * @author Vista Yih
 * @date 2019/12/19
 */
public abstract class BaseEntity {
    Long createBy;

    Date createTime;

    Long lastUpdateBy;

    Date lastUpdateTime;


    Long objectVersionNumber;

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(Long lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    public Date getLasetUpdateTime() {
        return lastUpdateTime;
    }

    public void setLasetUpdateTime(Date lasetUpdateTime) {
        this.lastUpdateTime = lasetUpdateTime;
    }

    public Long getObjectVersionNumber() {
        return objectVersionNumber;
    }

    public void setObjectVersionNumber(Long objectVersionNumber) {
        this.objectVersionNumber = objectVersionNumber;
    }
}
