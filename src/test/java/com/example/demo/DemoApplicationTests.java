package com.example.demo;

import com.example.demo.dao.UserInfoDao;
import com.example.demo.data.Pay;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.service.PayService;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Resource(name = "payService")
	PayService testService;

	@Autowired
	UserInfoDao userInfoDao;

	@Test
	public void testDepartment() {
		//List<Department> list = departmentDao.selectDepartmentBypage(1,0);
		//System.out.println(list.size());
	}



	@Test
	public  void  testdata(){
		Pay pay = testService.qryBankByPay("fxh0014");
		System.out.print("======"+pay);
	}
}
