package com.ict.service;

import com.ict.vo.CVO;
import com.ict.vo.TVO;
import com.ict.vo.VO;

public interface MyService {
	// MyDAO�� insertCard�� insertTicket�� ���� ó������
	// �������� ��ó���� ��� �ϳ��� ������ ó���ϴ� ���� Ʈ������̶�� �Ѵ�.
	int insertCT(VO vo) throws Exception;
	int insertCT2(CVO cvo, TVO tvo) throws Exception;
}
