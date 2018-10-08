package org.ys.cms.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 日志类
 * </p>
 *
 * @author YS
 * @since 2018-10-06
 */
@TableName("cms_log")
public class CmsLog extends Model<CmsLog> {
	private static final long serialVersionUID = -2518676727333682273L;

	@TableId("cms_log_id")
    private String cmsLogId;

    @TableField("log_type")
    private String logType;

    @TableField("created_time")
    private Date createdTime;

    @TableField("modified_time")
    private Date modifiedTime;

    private String module;

    private String user;

    @TableField("ip_address")
    private String ipAddress;

    @TableField("log_info")
    private String logInfo;

    public String getCmsLogId() {
        return cmsLogId;
    }

    public void setCmsLogId(String cmsLogId) {
        this.cmsLogId = cmsLogId;
    }
    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }
    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
    public String getLogInfo() {
        return logInfo;
    }

    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
    }

    @Override
    protected Serializable pkVal() {
        return this.cmsLogId;
    }

    @Override
    public String toString() {
        return "CmsLog{" +
        "cmsLogId=" + cmsLogId +
        ", logType=" + logType +
        ", createdTime=" + createdTime +
        ", modifiedTime=" + modifiedTime +
        ", module=" + module +
        ", user=" + user +
        ", ipAddress=" + ipAddress +
        ", logInfo=" + logInfo +
        "}";
    }
}
