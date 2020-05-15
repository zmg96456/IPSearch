package com;

import java.io.IOException;
import java.util.List;

import com.tledu.aaa.manger.DataProcessManager;
import com.tledu.aaa.pojo.IPAndLocationPojo;
import com.tledu.aaa.util.IPUtil;

/**
 * 测试10
 * 二分法测试
 * 二分法一般是递归,所以我们不能写在main方法中,单独编写方法
 * 测试 : 五步  
 * 边界 : 左边界,右边界 边界之外 : 左边界之外,右边界之外 边界之内,左边界之内,右边界之内, 并且 有这个数据和没有这个数据
 */
public class TestBinrarySearch_01 {
		public static void main(String[] args) throws IOException {
			int[]  intArray ={1,3,5,7,8,10,12};
			int aid = 5;
			int startIndex = 0;
			int endIndex = intArray.length - 1;
			int resultIndex = binaraySearchInt(intArray, aid, startIndex, endIndex);
			System.out.println(resultIndex);
			
			user u1 =new user(2, "1");
			user u2=new user(5, "1");
			user u3 =new user(8, "1");
			user[] userArray ={u1,u2,u3};
			user userAid =new user(8, " ");
			startIndex = 0;
			endIndex = userArray.length-1;
			resultIndex =binaraySearchUser(userArray, userAid, startIndex, endIndex);
			System.out.println(resultIndex);
			
			String ipFile ="ip_location_relation.txt";
			String encoding ="utf-8";
			List<IPAndLocationPojo> iList=DataProcessManager.getPojoList(ipFile, encoding);
			IPAndLocationPojo[] iPojos = DataProcessManager.convertListToArrayAndSort(iList);
			String aidIP = "112.123.154.210";
			startIndex = 0;
			endIndex =iPojos.length-1;
			resultIndex = binaraySearchIpPojo(iPojos, aidIP, startIndex, endIndex);
			System.out.println(iPojos[resultIndex]);
		}
		
		/**
		 * 基本类型二分法
		 * intArray  有序数组
		 * aid  目标数据
		 * startIndex  起始索引
		 * endIndex	 结束索引
		 */
		
		public static int binaraySearchInt(int[] intArray ,int aid,int startIndex,int endIndex){
			if (startIndex>endIndex) {
				return -1;
			}
			
			int mid = (startIndex+endIndex)/2;
			if (aid>intArray[mid]) {
				startIndex =mid+1;
			}else if (aid<intArray[mid]) {
				endIndex =mid -1;
			}else {
				return mid;
			}
			return binaraySearchInt(intArray, aid, startIndex, endIndex);
		}
		
		
		/**
		 * 复杂类型二分法
		 * userArray   有序数组
		 * userAid   目标数据
		 * startIndex  起始索引
		 * endIndex  结束索引
		 */
		
		public static int binaraySearchUser(user[] userArray, user userAid ,int startIndex,int endIndex){
			if (startIndex>endIndex) {
				return -1;
			}
			int mid = (startIndex+endIndex)/2;
			if (userAid.getAge()>userArray[mid].getAge()) {
				startIndex =mid +1;
			}else if (userAid.getAge()<userArray[mid].getAge()) {
				endIndex = mid-1;
			}else {
				return mid;
			}
			return binaraySearchUser(userArray, userAid, startIndex, endIndex);
		}
		
		
		/**
		 *  本业务二分法测试
		 */
		public static int binaraySearchIpPojo(IPAndLocationPojo[] ipPojos, String aidIP,int startIndex, int endIndex){
			if (startIndex>endIndex) {
				return -1;
			}
			int mid = (startIndex+endIndex)/2;
			long IPLong = IPUtil.ipToLong(aidIP);
			if (IPLong >ipPojos[mid].getEndIPLong()) {
				startIndex =mid +1;
				
			}else if (IPLong< ipPojos[mid].getStartIPLong()) {
				endIndex = mid -1;
			}else {
				return mid;
			}
			return binaraySearchIpPojo(ipPojos, aidIP, startIndex, endIndex);
					
		}
}
