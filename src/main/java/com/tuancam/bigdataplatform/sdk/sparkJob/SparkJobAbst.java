/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuancam.bigdataplatform.sdk.sparkJob;

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.sql.SparkSession;

/**
 *
 * @author tuannv6
 */
public class SparkJobAbst {

    private static String _appName;
    private static SparkConf _conf;
    private SparkContext _sc;

    public static String getAppName() {
        return _appName;
    }

    public static SparkConf getConf() {
        return _conf;
    }

    public static void setAppName(String _appName) {
        SparkJobAbst._appName = _appName;
    }

    public static void setConf(SparkConf _conf) {
        SparkJobAbst._conf = _conf;
    }

    public void setSc(SparkContext _sc) {
        this._sc = _sc;
    }
        

    private SparkJobAbst(String appName, SparkConf conf) {
        this._appName = appName;
        this._conf = conf;
    }

    public static SparkSession sparkSession() {
        SparkConf conf = new SparkConf().setAppName(_appName).setMaster("local[*]");
        SparkSession spark = SparkSession
                .builder()
                .config(conf)
                .getOrCreate();
        return spark;
    }

    public static void main(String[] args) {
        String appName = "testSparkJob";
        SparkConf conf = new SparkConf();
        SparkJobAbst sparkAbc = new SparkJobAbst(appName, conf);
        sparkAbc.sparkSession();
        System.out.println("test spark session !!!");
    }
}
