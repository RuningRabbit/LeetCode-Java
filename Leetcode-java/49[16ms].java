public static List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> list = new ArrayList<List<String>>();
		Map<String,List<String>> map=new HashMap<String,List<String>>();
		
		for (int i = 0; i < strs.length; i++) {
			char[] charArray = strs[i].toCharArray();
			Arrays.sort(charArray);
			String sortedStr = new String(charArray);
			
			if(map.get(sortedStr)==null){
			List<String> subList = new ArrayList<String>();
			list.add(subList);
			subList.add(strs[i]);
			map.put(sortedStr,subList);			
			}
			else{
				List<String> a=map.get(sortedStr);
				a.add(strs[i]);	
			}
			
		}
		return list;
	}