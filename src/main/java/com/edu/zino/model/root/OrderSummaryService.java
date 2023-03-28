package com.edu.zino.model.root;


import java.util.List;
import java.util.Map;

import com.edu.zino.domain.Member;
import com.edu.zino.domain.OrderSummary;

public interface OrderSummaryService {
	//과목검색
	public List selectAllByTeacher(int teacher_idx);
	
	//과목, 닉네임으로 검색
	public List selectAllBySearch(Map<String, Object> searchMap);
	
	//회원별 강사내역 가져오기
	public List selectAllByMemberTeacher(int member_idx);
}
