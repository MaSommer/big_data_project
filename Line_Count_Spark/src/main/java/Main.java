import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SparkConf conf = new SparkConf().setAppName("TheLegends");
		
		JavaSparkContext ctx = new JavaSparkContext(conf);
		
		JavaRDD<String> textLoadRDD = ctx.textFile("/Users/MaSommer/Google Drive/Skole/4.Year/Vaar/BigData/HADOOP_HOME.3/spark-2.1.0-bin-hadoop2.7/README.md");
		
		System.out.println(textLoadRDD.count());
		
		System.out.println("hei");
		
	}

}
