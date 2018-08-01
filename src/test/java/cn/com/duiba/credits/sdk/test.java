package cn.com.duiba.credits.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

	public static void main(String[] args) {

		String Appkey = "21bPuGyabWsbjFAxtUBbbMqDSX1a";
		String appSecret ="34mpqvaceTjkcYewPBrBiAWC5YWv";
		CreditTool tool = new CreditTool(Appkey,appSecret);
		List<String> orderNums = new ArrayList<String>();
		orderNums.add("1232323");
		orderNums.add("1232323");
		String url = tool.queryForFrontItem("5");

		System.out.println(url);
		String urls = "https://www.duiba.com.cn/test/assableurl?vv=cc";
		Map<String, String> params = new HashMap<String, String>();
		params.put("aa","张三");
		params.put("bb","sdsd");
		String urlpar = AssembleTool.assembleUrl(urls,params);
  		//System.out.println(urlpar);

	}
}
