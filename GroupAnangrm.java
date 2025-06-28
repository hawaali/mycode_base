package com.pratcie.akshay.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnangrm {
	
	public static void main(String[] args) {
		
		String arr [] = {"eat","tea","tan","ate","nat","bat"};
		Map<String, List<String>> map = new HashMap<>();
		
		for(String val : arr) {
			
			char [] str =val.toCharArray();
			
			Arrays.sort(str);
			
			String nowSorted =  String.valueOf(str);
			
			
			if(!map.isEmpty() && map.containsKey(nowSorted)) {
				
				List<String> list = map.get(nowSorted);
				
				list.add(val);
				
			}else{
				List<String> list = new ArrayList<String>();
				list.add(val);
				map.put(nowSorted, list);
			}

			
		}
		
		System.out.println(map.values());
		
		//System.out.println(map);
		
	}

}
