/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuancam.bigdataplatform.sdk.elasticsearchConnector;
import org.apache.hadoop.conf.Configuration;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;
import org.elasticsearch.spark.rdd.EsSpark;
/**
 *
 * @author tuannv6
 */
public class ElasticsearchConnector {
    public void saveDataToElasticsearch(String indexName) {
        Dataset<Row> ds;
//        EsSpark.saveToEs(ds.toJavaRDD(), indexName);
        Configuration conf = new Configuration();

    }
}
