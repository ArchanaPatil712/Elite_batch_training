package streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FisrtSteamDemo {
	public static void print(Object obj) {
		System.out.println(obj);
	}
	public static int add(int a, int b) {
		return a+b;
	}

	public static void main(String[] args) {
		Integer[] ar= {1,2,4,3,2,5,6,7};
		List<Integer> num=Arrays.asList(ar);
		Stream<Integer> srt1=num.stream();
		//srt1.forEach(System.out::println);
		/*for(int n : num) {
			System.out.println(n);
		}*/
		//System.out.println(srt1.count());
		//num.stream().distinct().forEach(System.out::println);
		//System.out.println(num.stream().distinct().count());
		//System.out.println(num.stream().filter(n->n>5).count());
		//num.stream().distinct().sorted().forEach(System.out::println);
		//System.out.println(num.stream().reduce(0, (n,m)->n+m));
		//System.out.println(num.stream().reduce(0,Integer::sum));
		//System.out.println(num.stream().reduce(0,FisrtSteamDemo::add));
		//num.stream().limit(5).forEach(System.out::println);
		IntStream istr=IntStream.range(1, 99);
		//System.out.println(istr.count());
		//System.out.println(istr.sum());
		//System.out.println(istr.skip(5).sum());
		IntStream istr1=IntStream.of(4,6,2,7,8,9,10);
		//System.out.println(istr1.count());
		//System.out.println(istr1.sum());
		IntSummaryStatistics statics =istr.summaryStatistics();
		System.out.println(statics);
	}

}
