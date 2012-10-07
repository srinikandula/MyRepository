package com.samples.divya;

import java.lang.Object;
import java.util.Random;
import java.math.BigInteger;

public class Walsh extends Object {

   public static int data_size;
   public static int data_sizemo;
   public static int data_sizeo2;

   public static int straddle_width;
   public static int pair;

   public static int left_index;
   public static int right_index;

   public static int a;
   public static int b;

   public static int block;
   public static int blockstart;

   public static int max;
   public static int average;
   public static int min;

   public static int application = 0;
   public static int debug = 0;

   public static int i;

   public static int ret_val;

   public static int temp;
   public static int difference;

   public static int data[];

   public static int bitCount(int z) {
      ret_val = 0;
   
      while (z > 0) {
         if ((z & 1) == 1) {
            ret_val++;
         }
      
         z = z >>> 1;
      }
   
      return ret_val;
   }


   public static int totalBits(int[] data) {
      data_size = data.length;
   
      temp = 0;
      for (i = 0; i < data_size; i++) {
         if (data[i] != 0) 
            temp++;         
      }
   
      return temp;
   }


   public static boolean isBooleanFunction(int[] data) {
      data_size = data.length;
   
      temp = 0;
      for (i = 0; i < data_size; i++) {
         if ((data[i] != 0) && (data[i] != 1))
            return false;
      }
   
      return true;
   }


   public static boolean isRightSize(int[] data) {
      data_size   = data.length;
   
      if (bitCount(data_size) == 1) {
         return true;
      }
      return false;
   }


   public static int[] FWT(int[] data) {
      data_size   = data.length;
      data_sizemo = data_size - 1;
      data_sizeo2 = data_size >>> 1;
   
      if (isRightSize(data)) {                  
         if (debug != 0) 
            System.out.println("Debug: array size = (0 ... " + data_sizemo + ")");       
      
      
      
         straddle_width = 1;
      
         blockstart = data_sizemo;
         do {
            left_index = 0;
            blockstart = blockstart >>> 1;
         
            for (block = blockstart; block >= 0; block--) {
               right_index = left_index + straddle_width;
               for (pair = 0; pair < straddle_width; pair++) {
                  a = data[left_index];
                  b = data[right_index];
                  data[left_index] = a + b;
                  data[right_index] = a - b;
                  left_index++;
                  right_index++;
               }
            
               left_index = right_index;
            }
         
            straddle_width = (straddle_width << 1) & data_sizemo;
         } while (straddle_width != 0);
      
         data[0] = data_sizeo2 - data[0];
      
         return data;
      }
      else
      {
         System.out.println("Error: Array size is '" + data_size + "' - which is not a power of two.");
      
         return null;
      }
   
   }


   public static int nonLinearity(int[] data) {
      data_size   = data.length;
      data_sizeo2 = data_size >>> 1;
   
      max = 0;
   
      for (i = 0; i < data_size; i++) {
         temp = data[i];
         temp = (temp >= 0) ? temp : 0 - temp;
         if (temp > max) 
            max = temp;
      }
   
      return data_sizeo2 - max;
   }

}