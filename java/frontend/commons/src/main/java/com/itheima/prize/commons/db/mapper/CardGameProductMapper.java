package com.itheima.prize.commons.db.mapper;

import com.itheima.prize.commons.db.entity.CardGameProduct;
import com.itheima.prize.commons.db.entity.CardGameProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface CardGameProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_product
     *
     * @mbg.generated
     */
    long countByExample(CardGameProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_product
     *
     * @mbg.generated
     */
    int deleteByExample(CardGameProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_product
     *
     * @mbg.generated
     */
    @Delete({
        "delete from card_game_product",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_product
     *
     * @mbg.generated
     */
    @Insert({
        "insert into card_game_product (gameid, productid, ",
        "amount)",
        "values (#{gameid,jdbcType=INTEGER}, #{productid,jdbcType=INTEGER}, ",
        "#{amount,jdbcType=SMALLINT})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(CardGameProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_product
     *
     * @mbg.generated
     */
    int insertSelective(CardGameProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_product
     *
     * @mbg.generated
     */
    List<CardGameProduct> selectByExample(CardGameProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_product
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "id, gameid, productid, amount",
        "from card_game_product",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.itheima.prize.commons.db.mapper.CardGameProductMapper.BaseResultMap")
    CardGameProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_product
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CardGameProduct record, @Param("example") CardGameProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_product
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CardGameProduct record, @Param("example") CardGameProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CardGameProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table card_game_product
     *
     * @mbg.generated
     */
    @Update({
        "update card_game_product",
        "set gameid = #{gameid,jdbcType=INTEGER},",
          "productid = #{productid,jdbcType=INTEGER},",
          "amount = #{amount,jdbcType=SMALLINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CardGameProduct record);
}