package com.makunpeng.common.utils;

import java.util.Random;

public class ZHStringUtil {
	/*
	 * 6. ����ZHStringUtil�����ַ��������༰������������Bug��16�֣� ������ϸ���£�
	 */

	public static String getZHString(int n){
		//TODO ʵ�ִ���
		String string="";
		for (int i = 0; i <n; i++) {
			Random ran=new Random();//�������������
			int  high;//�������ĵ� ����ֵ
			int  low;
			high=(176+Math.abs(ran.nextInt(39)));//���ȡֵ
			low=(161+Math.abs(ran.nextInt(93)));
			byte[] arr=new byte[2];//�����ֽ�����
			arr[0]=(new Integer(high).byteValue());
			arr[1]=(new Integer(low).byteValue());
			try {
				string+=new String(arr,"GBK");//תΪ���� 
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
				System.out.println("�д���"); //���������ʾ
			}
		}

		return string;
	}
	//����2�����������������������ʵ�տ�ͷ���л����ϲμ����ټ���.txt��������ʹ��1-2���������(8��) 
	 public static String getZHName(){
		 //TODO ʵ�ִ��� 
		 String str[]={"��","Ǯ","��","��","��","��","֣","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ʩ","��","��","��","��","��","��","κ","��","��","��","л","��","��","��","ˮ","�","��","��","��","��","��","��","��","��","��","³","Τ","��","��","��","��","��","��","��","��","Ԭ","��","ۺ","��","ʷ","��","��","��","�","Ѧ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ʱ","��","Ƥ","��","��","��","��","��","Ԫ","��","��","��","ƽ","��","��","��","��","��","Ҧ","��","տ","��","��","ë","��","��","��","��","��","�","��","��","��","��","̸","��","é","��","��","��","��","��","��","ף","��","��","��","��","��","��","ϯ","��","��","ǿ","��","·","¦","Σ","��","ͯ","��","��","÷","ʢ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","֧","��","��","��","¬","Ī","��","��","��","��","��","��","Ӧ","��","��","��","��","��","��","��","��","��","��","��","��","ʯ","��","��","ť","��","��","��","��","��","��","½","��","��","��","��","�","��","��","�L","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ɽ","��","��","��","�","��","ȫ","ۭ","��","��","��","��","��","��","��","��","��","��","��","б","��","��","��","��","��","��","��","ղ","��","��","Ҷ","��","˾","��","۬","��","��","��","ӡ","��","��","��","��","ۢ","��","��","��","��","��","��","׿","��","��","��","��","��","��","��","��","��","��","˫","��","ݷ","��","��","̷","��","��","��","��","��","��","��","Ƚ","��","۪","Ӻ","�S","�","ɣ","��","�","ţ","��","ͨ","��","��","��","��","ۣ","��","��","ũ","��","��","ׯ","��","��","��","��","��","Ľ","��","��","ϰ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","»","��","��","ŷ","�","��","��","ε","Խ","��","¡","ʦ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","��","ɳ","ؿ","��","��","��","��","��","��","��","��","��","��","��","��","��","��","Ȩ","��","��","��","��","��","��","��","��","��","��","۳","Ϳ","��","��","˧","��","��","��","��","��","��","��","Ĳ","��","٦","��","��","ī","��","��","��","��","��","��","١","��ٹ","˾��","�Ϲ�","ŷ��","�ĺ�","���","����","����","����","�ʸ�","ξ��","����","�̨","��ұ","����","���","����","����","̫��","����","����","����","��ԯ","���","����","����","����","Ľ��","����","����","˾ͽ","˾��","آ��","˾��","��","��","�ӳ�","���","��ľ","����","����","���","����","����","����","�ذ�","�й�","�׸�","����","�θ�","����","����","����","����","��","��","����","΢��","����","����","����","����","�Ϲ�"};
		 //����� 0�� �ַ�����ĳ����м����ȡ��һ���±�
		 int random = RandNumUtil.random(0, str.length);
		 //���� �����  + �������
		 return str[random]+getZHString(RandNumUtil.random(1,2));
		 
	 }
	 

	public static void main(String[] args) {
		String zhString = getZHName();
		System.out.println(zhString);
	}
}
