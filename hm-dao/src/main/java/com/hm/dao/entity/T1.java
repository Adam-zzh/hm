package com.hm.dao.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
@TableName("t1")
@Data
// @ExcelProperty(value = "${column.comment}", index = 0)
public class T1 implements Serializable {
    private static final long serialVersionUID = -54543351503903026L;
     @TableField("id")
     private Long id;
     /**
     * 名称
     */
     @TableField("name")
     private String name;
     @TableField("code")
     private String code;
 
 
}
