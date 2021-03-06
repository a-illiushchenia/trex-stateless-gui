/**
 * *****************************************************************************
 * Copyright (c) 2016
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************
 */
package com.exalttech.trex.remote.models.validate;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

/**
 *
 * @author Georgekh
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "max_bps_l1",
    "max_bps_l2",
    "max_line_util",
    "max_pps",
    "min_bps_l1",
    "min_bps_l2",
    "min_line_util",
    "min_pps"
})
public class Rate {

    @JsonProperty("max_bps_l1")
    private long maxBpsL1;
    @JsonProperty("max_bps_l2")
    private long maxBpsL2;
    @JsonProperty("max_line_util")
    private Double maxLineUtil;
    @JsonProperty("max_pps")
    private long maxPps;
    @JsonProperty("min_bps_l1")
    private int minBpsL1;
    @JsonProperty("min_bps_l2")
    private int minBpsL2;
    @JsonProperty("min_line_util")
    private double minLineUtil;
    @JsonProperty("min_pps")
    private int minPps;
    
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     */
    public Rate() {
        this.maxBpsL1 = 0;
        this.maxBpsL2 = 0;
        this.maxLineUtil = 0.0;
        this.maxPps = 0;
        this.maxBpsL1 = 0;
        this.minBpsL2 = 0;
        this.minLineUtil = 0;
        this.minPps = 0;
    }

    /**
     *
     * @return The maxBpsL1
     */
    @JsonProperty("max_bps_l1")
    public long getMaxBpsL1() {
        return maxBpsL1;
    }

    /**
     *
     * @param maxBpsL1 The max_bps_l1
     */
    @JsonProperty("max_bps_l1")
    public void setMaxBpsL1(long maxBpsL1) {
        this.maxBpsL1 = maxBpsL1;
    }

    /**
     *
     * @return The maxBpsL2
     */
    @JsonProperty("max_bps_l2")
    public long getMaxBpsL2() {
        return maxBpsL2;
    }

    /**
     *
     * @param maxBpsL2 The max_bps_l2
     */
    @JsonProperty("max_bps_l2")
    public void setMaxBpsL2(long maxBpsL2) {
        this.maxBpsL2 = maxBpsL2;
    }

    /**
     *
     * @return The maxLineUtil
     */
    @JsonProperty("max_line_util")
    public Double getMaxLineUtil() {
        return maxLineUtil;
    }

    /**
     *
     * @param maxLineUtil The max_line_util
     */
    @JsonProperty("max_line_util")
    public void setMaxLineUtil(Double maxLineUtil) {
        this.maxLineUtil = maxLineUtil;
    }

    /**
     *
     * @return The maxPps
     */
    @JsonProperty("max_pps")
    public long getMaxPps() {
        return maxPps;
    }

    /**
     *
     * @param maxPps The max_pps
     */
    @JsonProperty("max_pps")
    public void setMaxPps(long maxPps) {
        this.maxPps = maxPps;
    }
    
    /**
     * 
     * @return 
     */
    @JsonProperty("min_bps_l1")
    public int getMinBpsL1() {
        return minBpsL1;
    }
    
    /**
     * 
     * @param minBpsL1 
     */
    @JsonProperty("min_bps_l1")
    public void setMinBpsL1(int minBpsL1) {
        this.minBpsL1 = minBpsL1;
    }
    
    /**
     * 
     * @return 
     */
    @JsonProperty("min_bps_l2")
    public int getMinBpsL2() {
        return minBpsL2;
    }
    
    /**
     * 
     * @param minBpsL2 
     */
    @JsonProperty("min_bps_l2")
    public void setMinBpsL2(int minBpsL2) {
        this.minBpsL2 = minBpsL2;
    }
    
    /**
     * 
     * @return 
     */
    @JsonProperty("min_line_util")
    public double getMinLineUtil() {
        return minLineUtil;
    }
    
    /**
     * 
     * @param minLineUtil 
     */
    @JsonProperty("min_line_util")
    public void setMinLineUtil(double minLineUtil) {
        this.minLineUtil = minLineUtil;
    }
    
    /**
     * 
     * @return 
     */
    @JsonProperty("min_pps")
    public int getMinPps() {
        return minPps;
    }
    
    /**
     * 
     * @param minPps 
     */
    @JsonProperty("min_pps")
    public void setMinPps(int minPps) {
        this.minPps = minPps;
    }

    
    /**
     *
     * @return
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @Override
    public String toString() {
        return "Rate{" + "maxBpsL1=" + maxBpsL1 + ", maxBpsL2=" + maxBpsL2 + ", maxLineUtil=" + maxLineUtil + ", maxPps=" + maxPps + " minBpsL1 = "+minBpsL1+" minBpsL2 = "+minBpsL2+
                " minLineUtil = "+minLineUtil+" minPps = "+minPps+", additionalProperties=" + additionalProperties + '}';
    }

    /**
     *
     * @param name
     * @param value
     */
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
