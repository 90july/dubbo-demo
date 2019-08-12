package net.sunnada.mapper;

import java.math.BigDecimal;
import java.util.List;
import net.sunnada.pojo.License;
import net.sunnada.pojo.LicenseExample;
import net.sunnada.pojo.LicenseWithBLOBs;
import org.apache.ibatis.annotations.Param;

public interface LicenseMapper {
    long countByExample(LicenseExample example);

    int deleteByExample(LicenseExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(LicenseWithBLOBs record);

    int insertSelective(LicenseWithBLOBs record);

    List<LicenseWithBLOBs> selectByExampleWithBLOBs(LicenseExample example);

    List<License> selectByExample(LicenseExample example);

    LicenseWithBLOBs selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") LicenseWithBLOBs record, @Param("example") LicenseExample example);

    int updateByExampleWithBLOBs(@Param("record") LicenseWithBLOBs record, @Param("example") LicenseExample example);

    int updateByExample(@Param("record") License record, @Param("example") LicenseExample example);

    int updateByPrimaryKeySelective(LicenseWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LicenseWithBLOBs record);

    int updateByPrimaryKey(License record);
}