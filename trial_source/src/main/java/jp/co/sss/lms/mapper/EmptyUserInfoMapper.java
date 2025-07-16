package jp.co.sss.lms.mapper;

import java.util.Date;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface EmptyUserInfoMapper {
	/*勤怠情報未入力
	*
	*@param lmsUserId
	*@param deleteFlg
	*@param trainingDate
	*@return
	*/

Integer findByEnpty(@Param("lmsUserId")Integer lmsUserId, @Param("deleteFlg") Short deleteFlg,
@Param("trainingDate") Date trainingDate);
}
