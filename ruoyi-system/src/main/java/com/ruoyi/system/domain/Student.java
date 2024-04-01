package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 学生对象 student
 * 
 * @author ruoyi
 * @date 2024-03-30
 */
public class Student extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String fatherName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String motherName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String phone;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String carBrand;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String classroom;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long createAt;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setFatherName(String fatherName) 
    {
        this.fatherName = fatherName;
    }

    public String getFatherName() 
    {
        return fatherName;
    }
    public void setMotherName(String motherName) 
    {
        this.motherName = motherName;
    }

    public String getMotherName() 
    {
        return motherName;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setCarBrand(String carBrand) 
    {
        this.carBrand = carBrand;
    }

    public String getCarBrand() 
    {
        return carBrand;
    }
    public void setClassroom(String classroom) 
    {
        this.classroom = classroom;
    }

    public String getClassroom() 
    {
        return classroom;
    }
    public void setCreateAt(Long createAt) 
    {
        this.createAt = createAt;
    }

    public Long getCreateAt() 
    {
        return createAt;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("fatherName", getFatherName())
            .append("motherName", getMotherName())
            .append("phone", getPhone())
            .append("carBrand", getCarBrand())
            .append("classroom", getClassroom())
            .append("createAt", getCreateAt())
            .toString();
    }
}
