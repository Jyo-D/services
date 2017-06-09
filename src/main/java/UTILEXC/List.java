package UTILEXC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class List {
	
	static int count=0;
	static ArrayList<String> list=new ArrayList<String>();
	static String av;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   
		No_Of_Array();
		System.out.println(list.size());
		av=list.get(1);
		System.out.println(av);
	    for(int i=0;i<=list.size();i++)
	    {
	    	System.out.println(list.get(i));
	    	
	    }
	
	
	    
	}
		
			
		
		

	
	public static void No_Of_Array() {
		// TODO Auto-generated method stub

		String response="{\'lookupName\':\'mat\',\'lookupcol\':[{\'_id\':\'591427eb42c39d2f77585dd6\',\'userId\':{\'use\':\'OBT-B17xOibeZ\'}} ,{\'av\':[{\'123\':\'456\'}],\'avatar\':\'null\' ,\'firstName\':\'Balakrishnan\' }, {\'name\':\'jyoti\',  \'age\':\'NOYB\'}] } " ;

		char ch;
		char ch2;
		
		
		
		for(int i=0;i<=response.length();i++) {
			try{ch=response.charAt(i);
			ch2=response.charAt(i+1);
			String s = new StringBuilder().append(ch).append(ch2).toString();
		
			System.out.println(s);
			if(s.equals(":["))
			{
				count++;
				int k=response.indexOf(s,i)-1;
				int rev=k;
	            System.out.println(k);
	            System.out.println(response.charAt(k+2));
	            String array_name=new String("");
	            int j=rev;
				while(array_name.equals("")==true)     //for(int j=rev;j<=rev;j--)
				{
					ch=response.charAt(j);
					//ch2=response.charAt(j-1);
					String s1 = new StringBuilder().append(ch).toString();
			        System.out.println("s1="+s1);
			        if(s1.equals("'")==true)
					{
						int m=response.indexOf(s1,j-1);
					
						try{array_name=response.substring(m+1, k);
								System.out.println(array_name+"=array_name");
								}catch(Exception e){}
						
						list.add(array_name);
						
					}j--;}
			
			     
				
				
				}}catch(Exception e){}
		}
		//System.out.println(count);
		}
}
	



/*ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
				lists.add(new ArrayList());
				lists.add(new ArrayList());

				for(ArrayList<Integer> list : lists) {
				    list.add(1);
				    System.out.println(list);
				}*/
