/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tuancam.bigdataplatform.sdk.kafkaConnector;

import org.apache.kafka.clients.consumer.*;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.common.serialization.LongDeserializer;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.util.Collections;
import java.util.Properties;

/**
 *
 * @author tuannv6
 */
public class ConsumerCreator {

    private static String _TOPIC;
    private static String _BOOTSTRAP_SERVERS;

    public ConsumerCreator(String TOPIC, String BOOTSTRAP_SERVERS) {
        this._TOPIC = TOPIC;
        this._BOOTSTRAP_SERVERS = BOOTSTRAP_SERVERS;
    }
    

}
