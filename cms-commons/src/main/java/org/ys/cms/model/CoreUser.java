package org.ys.cms.model;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author YS
 * @since 2018-10-05
 */
@TableName("core_user")
public class CoreUser extends Model<CoreUser> {

	private static final long serialVersionUID = 576912890836511494L;

	@TableId("core_user_id")
    private String coreUserId;

    @TableField("user_name")
    private String userName;

    private String password;

    private String sex;
    
    private String phone;

    private Date birthday;

    @TableField("comment_info")
    private String commentInfo;
    
    @TableField("created_time")
    private Date createdTime;
    
    @TableField("modified_time")
    private Date modifiedTime;    

    public String getCoreUserId() {
        return coreUserId;
    }

    public void setCoreUserId(String coreUserId) {
        this.coreUserId = coreUserId;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public String getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(String commentInfo) {
        this.commentInfo = commentInfo;
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

	@Override
    protected Serializable pkVal() {
        return this.coreUserId;
    }

    @Override
    public String toString() {
        return "CoreUser{" +
        "coreUserId=" + coreUserId +
        ", userName=" + userName +
        ", password=" + password +
        ", sex=" + sex +
        ", phone=" + phone +
        ", birthday=" + birthday +
        ", commentInfo=" + commentInfo +
        ", createdTime=" + createdTime +
        ", modifiedTime=" + modifiedTime +
        "}";
    }
}
