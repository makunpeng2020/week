package com.makunpeng.common.utils;

import java.util.Random;

public class RandNumUtil {

	public static double getValue(final double min,
			final double max,final int scale){
		//TODO ʵ�ִ���	
		int i=(int) min;//��������int����
		int j=(int) max;
		
		int random = random(i, j);
		String spli= min+"";
		String spli1= max+"";//תΪ�ַ�������
		String[] split = spli.split("");//���ո����ַ���
		int co=0;
		//�ҵ� double���͵� .����λ��
		for (int k = 0; k < split.length; k++) {
			if (split[k].equals(".")) {
				co=k;
			}
		}
		String sub=spli.substring(co+1);
		//��ȡ�� . ���������
		
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
		//��� ֵ�к��� 0 ��ô �ж�
		if (sub.contains("0")||sub1.contains("0")) {
			for (int k = 0; k < scale; k++) {
				zero1+=random(1,10)+"";		//��1-10��ȡ����������ַ���
			}
		}
		random2 = random(Integer.parseInt(sub),Integer.parseInt(sub1));
		if (zero1!=null&&!zero1.equals("")) {
			random2=Integer.parseInt(zero1);	//С�����Ϊ0  ��Ϊ0������
		}
		String ra=random+"."+random2;				
		return Double.parseDouble(ra);
	}
	/**
	 * �����������
	 * @Title: random 
	 * @Description: TODO
	 * @param min
	 * @param max
	 * @return
	 * @return: int
	 */
	public static int random(int min, int max){
		//TODO ʵ�ִ���
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
