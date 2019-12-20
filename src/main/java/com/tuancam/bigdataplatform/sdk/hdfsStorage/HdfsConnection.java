/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuancam.bigdataplatform.sdk.hdfsStorage;
import com.tuancam.bigdataplatform.sdk.sparkJob.SparkJobAbst;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.SparkSession;
/**
 *
 * @author tuannv6
 */
public class HdfsConnection  {
    private static String host; // default : localhost
    private static String port; // default : 9000
    public void saveDatasetAsParquetfile(Dataset<Row> ds,String fileName){
        String appName = "demo";
//        SparkJobAbst spark = SparkJobAbst(appName);        
    }
}
