package Util;

import java.nio.charset.Charset;
import java.util.List;

public final class Show
{

	public static void showListNode(ListNode listNode)
	{
		while (listNode!=null)
		{
			System.out.print(listNode.val+"->");
			listNode = listNode.next;
		}
		System.out.println();
	}
	public static void showArray(double[] array)
	{
		if (array==null||array.length==0)
		{
			System.out.println("null");
			return;
		}
		for (int i = 0 ; i < array.length;i++)
			System.out.println(array[i]);
	}

	public static void showArray(int[] array)
	{
		if (array==null||array.length==0)
		{
			System.out.println("null");
			return;
		}
		for (int i = 0 ; i < array.length;i++)
			System.out.println(array[i]);
	}
	
	public static void showListInt(List<Integer> list)
	{
		if (list.size()==0||list==null)
			System.out.println("null");
		for (int i = 0 ; i < list.size();i++)
			System.out.print(list.get(i)+", ");
	}
	
	public static void showListString(List<String> list)
	{
		if (list.size()==0||list==null)
			System.out.println("null");
		for (int i = 0 ; i < list.size();i++)
			System.out.print(list.get(i)+", ");
	}
	
	public static void showListListInt(List<List<Integer>> list)
	{
		if (list.size()==0||list==null)
			System.out.println("null");
		for (int i = 0 ; i < list.size();i++)
		{
			showListInt(list.get(i));
			System.out.println();
		}
	}
	
	public static void showListChar(List<Charset> list)
	{
		if (list.size()==0||list==null)
			System.out.println("null");
		for (int i = 0 ; i < list.size();i++)
			System.out.print(list.get(i)+", ");
	}
	public static void showListListChar(List<List<Charset>> list)
	{
		if (list.size()==0||list==null)
			System.out.println("null");
		for (int i = 0 ; i < list.size();i++)
			showListChar(list.get(i));
	}

	public  static void show(Interval i)
	{
		System.out.println(i.start+"-"+i.end);
	}

	public static void show(List<Interval> list)
	{
		for ( Interval interval: list) {
			show(interval);
		}
	}

}
