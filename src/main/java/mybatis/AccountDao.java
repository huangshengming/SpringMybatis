package mybatis;

import com.spring.FpsKbe;
import db.bean.TAccount;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@FpsKbe
public interface AccountDao {

    @Select("select * from TAccount where `AccountId`=#{value}")
    TAccount selectByAccountId(@Param("value") int accountId);

    @Insert("insert into TAccount(`AccountId`,`AccountName`) VALUES(#{bean.accountId}, #{bean.accountName})")
    void insert(@Param("bean")  TAccount tAccount);

    @Update("update TAccount set AccountName=#{bean.accountName} where `AccountId`=#{bean.accountId}")
    int update(@Param("bean")  TAccount tAccount);
}
