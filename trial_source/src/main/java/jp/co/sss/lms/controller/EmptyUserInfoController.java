package jp.co.sss.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import jakarta.servlet.http.HttpSession;
import jp.co.sss.lms.dto.LoginUserDto;
import jp.co.sss.lms.service.StudentAttendanceService;

@Controller
public class EmptyUserInfoController {
	@Autowired
	private StudentAttendanceService studentAttendanceService;
	@Autowired
	private HttpSession session;
	LoginUserDto loginUserDto = (LoginUserDto) session.getAttribute("loginUser");

	/*@RequestMapping(path = "/detail", method = RequestMethod.GET)
	public String index(Model model) {
		//勤怠一覧情報の取得
		//Tsudentの方に書く必要がある　このコントローラーは削除
		List<AttendanceManagementDto> attendanceManagementDtoList = studentAttendanceService
				.getAttendanceManagement(loginUserDto.getCourseId(), loginUserDto.getLmsUserId());
		model.addAttribute("attendanceManagementDtoList", attendanceManagementDtoList);
	
		Integer count = studentAttendanceService.enterCount(loginUserDto.getLmsUserId());
		if (count > 0) {
			model.addAttribute("error", "過去日の勤怠に未入力があります。");
		}
		return "attendance/detail";
	}*/
}
