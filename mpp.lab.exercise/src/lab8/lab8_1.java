package lab8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class lab8_1 {
  public static void main(String args[])
  {
	  BiFunction<Double,Double,List<Double>> fu=(x,y) -> {
		  List<Double> list = new ArrayList<>();
		  list.add(Math.pow(x,y));
		  list.add(x * y);
		  return list;
		  };
	List<Double> result= fu.apply(2.0, 3.0);
	System.out.println(result);
  }
  
}
