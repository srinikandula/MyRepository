package com.samples;

public class SplitStringExample {

	public static void main(String[] args) {
		String str ="This a is cool thing";
		String words[] = str.split("is");
		System.out.println("Words count "+words.length);
		for(int i=0;i<words.length;i++){
			System.out.println(words[i]);
		}
			
	}
}
