package com.makunpeng.common.utils;

import java.util.Random;

public class RandNumUtil {

	public static double getValue(final double min,
			final double max,final int scale){
		//TODO 实现代码	
		int i=(int) min;//定义两个int类型
		int j=(int) max;
		
		int random = random(i, j);
		String spli= min+"";
		String spli1= max+"";//转为字符串类型
		String[] split = spli.split("");//按空格拆分字符串
		int co=0;
		//找到 double类型的 .所在位置
		for (int k = 0; k < split.length; k++) {
			if (split[k].equals(".")) {
				co=k;
			}
		}
		String sub=spli.substring(co+1);
		//截取从 . 往后的内容
		
		String[] split1 = spli1.split("");
		int co1=0;
		for (int k = 0; k < split1.length; k++) {
			if (split[k].equals(".")) {
				co1=k;
			}
		}
		String sub1=spli1.substring(co1+1);
		String zero="";
		for (int k = 0; k < scale; k++) {
			zero+="0";
		}
		String zero1="";
		int random2;
		//如果 值中含有 0 那么 判断
		if (sub.contains("0")||sub1.contains("0")) {
			for (int k = 0; k < scale; k++) {
				zero1+=random(1,10)+"";		//从1-10抽取随机数生成字符串
			}
		}
		random2 = random(Integer.parseInt(sub),Integer.parseInt(sub1));
		if (zero1!=null&&!zero1.equals("")) {
			random2=Integer.parseInt(zero1);	//小数点后都为0  不为0则跳过
		}
		String ra=random+"."+random2;				
		return Double.parseDouble(ra);
	}
	/**
	 * 生成随机整数
	 * @Title: random 
	 * @Description: TODO
	 * @param min
	 * @param max
	 * @return
	 * @return: int
	 */
	public static int random(int min, int max){
		//TODO 实现代码
		Random r=new Random();
		return r.nextInt(max-min+1)+min;
	} 
public static void main(String[] args) {
	int random = random(1, 10);
	System.out.println(random);
	double value = getValue(25400.15, 67078.98, 2);
	System.out.println(value);
}
}
