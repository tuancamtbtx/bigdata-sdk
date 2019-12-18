/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tungtung.bigdataplatform.sdk.sparkJob;

import org.apache.spark.SparkConf;
import org.apache.spark.sql.SparkSession;

/**
 *
 * @author tuannv6
 */
public class SparkJob {
    public static SparkSession initSparkSession(String appName) {
        SparkConf conf = new SparkConf().setAppName(appName).setMaster("local[*]");
        SparkSession spark = SparkSession
                .builder()
                .config(conf)
                .getOrCreate();
        return spark;
    }

    public static void main(String[] args) {
        String appName = "testSparkJob";
        SparkSession spark = initSparkSession(appName);
        System.out.println("test spark session !!!");
    }
}
