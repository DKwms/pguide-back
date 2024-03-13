package org.pguide.project.match.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName mms_project_status_dict
 */
@TableName(value ="mms_project_status_dict")
@Data
public class MmsProjectStatusDict implements Serializable {
    /**
     * 项目状态id
     */
    @TableId
    private Integer projectStatusId;

    /**
     * 项目状态名
     */
    private String projectStatusName;

    /**
     * 
     */
    private LocalDateTime created;

    /**
     * 
     */
    private LocalDateTime updated;

    /**
     * 
     */
    private Integer deleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}