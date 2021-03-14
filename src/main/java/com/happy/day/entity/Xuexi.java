package com.happy.day.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author yangming
 * @since 2021-03-14
 */
@Data
  @EqualsAndHashCode(callSuper = false)
    public class Xuexi extends Model<Xuexi> {

    private static final long serialVersionUID=1L;

      @TableId(value = "sid", type = IdType.AUTO)
      private BigDecimal sid;

    private BigDecimal price;

    private String xname;


    @Override
    protected Serializable pkVal() {
          return this.sid;
      }

}
