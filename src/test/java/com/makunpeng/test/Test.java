package com.makunpeng.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Random;

import com.makunpeng.common.bean.TPS;
import com.makunpeng.common.utils.DateHelp;
import com.makunpeng.common.utils.RandNumUtil;
import com.makunpeng.common.utils.ZHStringUtil;

public class Test {
	@org.junit.Test
	public void test() {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < 100; i++) {
			TPS tps=new TPS();
			tps.setAge(RandNumUtil.random(1, 100));//随机年龄
			tps.setId(new BigInteger(i+1+""));	//设置自增
			tps.setName(ZHStringUtil.getZHName());//随机姓名
			tps.setSalary(new BigDecimal(RandNumUtil.getValue(30000.00, 80000.00, 2)));//随机工资
			tps.setStartDate(DateHelp.RandomDate(new Date(),new Date(2012, 01, 01)));//随机日期
			
			System.out.println(i+1+"  "+tps);
		}
	}

}
