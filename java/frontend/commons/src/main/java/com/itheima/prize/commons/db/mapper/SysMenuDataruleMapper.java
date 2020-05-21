package com.itheima.prize.commons.db.mapper;

import com.itheima.prize.commons.db.entity.SysMenuDatarule;
import com.itheima.prize.commons.db.entity.SysMenuDataruleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface SysMenuDataruleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_datarule
     *
     * @mbg.generated
     */
    long countByExample(SysMenuDataruleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_datarule
     *
     * @mbg.generated
     */
    int deleteByExample(SysMenuDataruleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_datarule
     *
     * @mbg.generated
     */
    @Delete({
        "delete from sys_menu_datarule",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_datarule
     *
     * @mbg.generated
     */
    @Insert({
        "insert into sys_menu_datarule (menu_id, field_name, ",
        "symbol, value, create_time)",
        "values (#{menuId,jdbcType=INTEGER}, #{fieldName,jdbcType=VARCHAR}, ",
        "#{symbol,jdbcType=VARCHAR}, #{value,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(SysMenuDatarule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_datarule
     *
     * @mbg.generated
     */
    int insertSelective(SysMenuDatarule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_datarule
     *
     * @mbg.generated
     */
    List<SysMenuDatarule> selectByExample(SysMenuDataruleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_datarule
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, menu_id, field_name, symbol, value, create_time",
        "from sys_menu_datarule",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.itheima.prize.commons.db.mapper.SysMenuDataruleMapper.BaseResultMap")
    SysMenuDatarule selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_datarule
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysMenuDatarule record, @Param("example") SysMenuDataruleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_datarule
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysMenuDatarule record, @Param("example") SysMenuDataruleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_datarule
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysMenuDatarule record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_menu_datarule
     *
     * @mbg.generated
     */
    @Update({
        "update sys_menu_datarule",
        "set menu_id = #{menuId,jdbcType=INTEGER},",
          "field_name = #{fieldName,jdbcType=VARCHAR},",
          "symbol = #{symbol,jdbcType=VARCHAR},",
          "value = #{value,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SysMenuDatarule record);
}