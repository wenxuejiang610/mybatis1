package com.sidlu.dao.dao;

import com.sidlu.dao.model.Emp;

public interface EmpMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbggenerated
     */


    int deleteByPrimaryKey(Integer id);



    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbggenerated
     */
    int insert(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbggenerated
     */
    int insertSelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbggenerated
     */
    Emp selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Emp record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table emp
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Emp record);

}