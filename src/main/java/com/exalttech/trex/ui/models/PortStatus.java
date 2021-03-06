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
package com.exalttech.trex.ui.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javafx.beans.property.*;

import javax.annotation.Generated;

/**
 * Port status response data model
 * @author GeorgeKH
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "jsonrpc",
    "result"
})
public class PortStatus {

    @JsonProperty("id")
    private String id;

    @JsonProperty("jsonrpc")
    private String jsonrpc;

    @JsonProperty("result")
    private PortStatusResult result;

    /**
     * 
     * @return 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return 
     */
    @JsonProperty("jsonrpc")
    public String getJsonrpc() {
        return jsonrpc;
    }

    /**
     * 
     * @param jsonrpc 
     */
    @JsonProperty("jsonrpc")
    public void setJsonrpc(String jsonrpc) {
        this.jsonrpc = jsonrpc;
    }

    /**
     * 
     * @return 
     */
    @JsonProperty("result")
    public PortStatusResult getResult() {
        return result;
    }

    /**
     * 
     * @param result 
     */
    @JsonProperty("result")
    public void setResult(PortStatusResult result) {
        this.result = result;
    }

    /**
     * class present port status result model
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonIgnoreProperties(ignoreUnknown = true)
    @JsonPropertyOrder({
            "attr",
            "max_stream_id",
            "owner",
            "rx_info",
            "state"
    })
    public class PortStatusResult {

        @JsonProperty("attr")
        private PortStatusResultAttr attr;

        @JsonProperty("max_stream_id")
        private int max_stream_id;

        @JsonProperty("owner")
        private String owner;

        @JsonProperty("service")
        private Boolean service;

        @JsonProperty("rx_info")
        private PortStatusResultRxInfo rx_info;

        @JsonProperty("state")
        private String state;

        @JsonProperty("max_stream_id")
        public int getMax_stream_id() {
            return max_stream_id;
        }

        @JsonProperty("max_stream_id")
        public void setMax_stream_id(int max_stream_id) {
            this.max_stream_id = max_stream_id;
        }

        @JsonProperty("rx_info")
        public PortStatusResultRxInfo getRx_info() {
            return rx_info;
        }

        @JsonProperty("rx_info")
        public void setRx_info(PortStatusResultRxInfo rx_info) {
            this.rx_info = rx_info;
        }

        /**
         *
         * @return
         */
        @JsonProperty("owner")
        public String getOwner() {
            return owner;
        }

        /**
         *
         * @param owner
         */
        @JsonProperty("owner")
        public void setOwner(String owner) {
            this.owner = owner;
        }
        /**
         *
         * @return
         */
        @JsonProperty("service")
        public boolean getService() {
            return service;
        }

        /**
         *
         * @param owner
         */
        @JsonProperty("service")
        public void setService(boolean service) {
            this.service = service;
        }

        /**
         *
         * @return
         */
        @JsonProperty("state")
        public String getState() {
            return state;
        }

        /**
         *
         * @param state
         */
        @JsonProperty("state")
        public void setState(String state) {
            this.state = state;
        }

        /**
         *
         * @return
         */
        @JsonProperty("attr")
        public PortStatusResultAttr getAttr() {
            return attr;
        }

        /**
         *
         * @param attr
         */
        @JsonProperty("attr")
        public void setAttr(PortStatusResultAttr attr) {
            this.attr = attr;
        }

        /**
         * class present port status result-attr model
         */
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonPropertyOrder({
                "fc",
                "link",
                "promiscuous",
                "led"
        })
        public class PortStatusResultAttr {

            @JsonProperty("fc")
            private PortStatusResultAttrFc fc;
            @JsonProperty("layer_cfg")
            private PortStatusResultAttrLayerCfg layer_cfg;
            @JsonProperty("link")
            private PortStatusResultAttrLink link;
            @JsonProperty("multicast")
            private PortStatusResultAttrMulticast multicast;
            @JsonProperty("promiscuous")
            private PortStatusResultAttrPromiscuous promiscuous;
            @JsonProperty("rx_filter_mode")
            private String rx_filter_mode;
            @JsonProperty("speed")
            private int speed;
            private IntegerProperty speedProperty = new SimpleIntegerProperty();
            @JsonProperty("led")
            private PortStatusResultAttrLed led;
            private StringProperty rxFilterModeProperty = new SimpleStringProperty();
            private PortStatusResultRxInfo rx_info;
            private Boolean service;

            public PortStatusResultAttrMulticast getMulticast() {
                return multicast;
            }

            public void setMulticast(PortStatusResultAttrMulticast multicast) {
                this.multicast = multicast;
            }

            public String getRx_filter_mode() {
                return rx_filter_mode;
            }

            public void setRx_filter_mode(String rx_filter_mode) {
                this.rx_filter_mode = rx_filter_mode;
                rxFilterModeProperty.set(rx_filter_mode);
            }

            public int getSpeed() {
                return speedProperty.get();
            }

            public void setSpeed(int speed) {
                this.speedProperty.set(speed);
            }

            /**
             *
             * @return
             */
            @JsonProperty("fc")
            public PortStatusResultAttrFc getFc() {
                return fc;
            }

            /**
             *
             * @param owner
             */
            @JsonProperty("fc")
            public void setFc(PortStatusResultAttrFc fc) {
                this.fc = fc;
            }

            /**
             *
             * @return
             */
            @JsonProperty("link")
            public PortStatusResultAttrLink getLink() {
                return link;
            }

            /**
             *
             * @param link
             */
            @JsonProperty("link")
            public void setLink(PortStatusResultAttrLink link) {
                this.link = link;
            }

            /**
             *
             * @return
             */
            @JsonProperty("promiscuous")
            public PortStatusResultAttrPromiscuous getPromiscuous() {
                return promiscuous;
            }

            /**
             *
             * @param promiscuous
             */
            @JsonProperty("promiscuous")
            public void setPromiscuous(PortStatusResultAttrPromiscuous promiscuous) {
                this.promiscuous = promiscuous;
            }

            /**
             *
             * @return
             */
            @JsonProperty("led")
            public PortStatusResultAttrLed getLed() {
                return led;
            }

            /**
             *
             * @param led
             */
            @JsonProperty("led")
            public void setLed(PortStatusResultAttrLed led) {
                this.led = led;
            }

            /**
             *
             * @return
             */
            @JsonProperty("layer_cfg")
            public PortStatusResultAttrLayerCfg getLayer_cfg() {
                return layer_cfg;
            }

            /**
             *
             * @param led
             */
            @JsonProperty("layer_cfg")
            public void setLayer_cfg(PortStatusResultAttrLayerCfg layer_cfg) {
                this.layer_cfg = layer_cfg;
            }

            public StringProperty rxFilterModeProperty() {
                return rxFilterModeProperty;
            }

            public void updateFrom(PortStatusResultAttr attr) {
                promiscuous.updateFrom(attr.getPromiscuous());
                multicast.updateFrom(attr.getMulticast());
                link.updateFrom(attr.getLink());
                layer_cfg.updateFrom(attr.getLayer_cfg());
                fc.updateFrom(attr.getFc());
                service = attr.getService();

            }

            public PortStatusResultRxInfo getRxInfo() {
                return rx_info;
            }

            public Boolean getService() {
                return service;
            }

            public IntegerProperty speedProperty() {
                return speedProperty;
            }


            /**
             * class present port status result-attr-fc-mode model
             */
            @JsonInclude(JsonInclude.Include.NON_NULL)
            @JsonIgnoreProperties(ignoreUnknown = true)
            @JsonPropertyOrder({
                    "mode"
            })
            public class PortStatusResultAttrFc {

                @JsonProperty("mode")
                private int mode;

                /**
                 *
                 * @return
                 */
                @JsonProperty("mode")
                public int getMode() {
                    return mode;
                }

                /**
                 *
                 * @param mode
                 */
                @JsonProperty("mode")
                public void setMode(int mode) {
                    this.mode = mode;
                }

                public String toString() {
                    return mode==0
                            ? "none"
                            : mode==1
                                ? "tx"
                                : mode==2
                                    ? "rx"
                                    : mode==3 ? "full" : "ERROR";
                }

                public void updateFrom(PortStatusResultAttrFc fc) {
                    setMode(fc.getMode());
                }
            }

            /**
             * class present port status result-attr-link-up model
             */
            @JsonInclude(JsonInclude.Include.NON_NULL)
            @JsonIgnoreProperties(ignoreUnknown = true)
            @JsonPropertyOrder({
                    "up"
            })
            public class PortStatusResultAttrLink {

                @JsonProperty("up")
                private boolean up;

                /**
                 *
                 * @return
                 */
                @JsonProperty("up")
                public boolean getUp() {
                    return up;
                }

                /**
                 *
                 * @param up
                 */
                @JsonProperty("up")
                public void setUp(boolean up) {
                    this.up = up;
                }

                public String toString() {
                    if (up) return "up";
                    return "down";
                }

                public void updateFrom(PortStatusResultAttrLink link) {
                    setUp(link.getUp());
                }
            }

            /**
             * class present port status result-attr-link-up model
             */
            @JsonInclude(JsonInclude.Include.NON_NULL)
            @JsonIgnoreProperties(ignoreUnknown = true)
            @JsonPropertyOrder({
                    "enabled"
            })
            public class PortStatusResultAttrPromiscuous {

                @JsonProperty("enabled")
                private boolean enabled;
                private BooleanProperty enabledProperty = new SimpleBooleanProperty();

                /**
                 *
                 * @return
                 */
                @JsonProperty("enabled")
                public boolean getEnabled() {
                    return enabled;
                }

                /**
                 *
                 * @param enabled
                 */
                @JsonProperty("enabled")
                public void setEnabled(boolean enabled) {
                    this.enabled = enabled;
                    enabledProperty.set(enabled);
                }

                public String toString() {
                    if (enabled) return "enabled";
                    return "disabled";
                }

                public BooleanProperty enabledProperty() {
                    return enabledProperty;
                }

                public void updateFrom(PortStatusResultAttrPromiscuous promiscuous) {
                    setEnabled(promiscuous.getEnabled());
                }
            }

            /**
             * class present port status result-attr-link-up model
             */
            @JsonInclude(JsonInclude.Include.NON_NULL)
            @JsonIgnoreProperties(ignoreUnknown = true)
            @JsonPropertyOrder({
                    "enabled"
            })
            public class PortStatusResultAttrMulticast {

                @JsonProperty("enabled")
                private boolean enabled;
                private BooleanProperty enabledProperty = new SimpleBooleanProperty();

                /**
                 *
                 * @return
                 */
                @JsonProperty("enabled")
                public boolean getEnabled() {
                    return enabled;
                }

                /**
                 *
                 * @param enabled
                 */
                @JsonProperty("enabled")
                public void setEnabled(boolean enabled) {
                    this.enabled = enabled;
                    enabledProperty.set(enabled);
                }

                public String toString() {
                    if (enabled) return "enabled";
                    return "disabled";
                }

                public BooleanProperty enabledProperty() {
                    return enabledProperty;
                }

                public void updateFrom(PortStatusResultAttrMulticast multicast) {
                    setEnabled(multicast.getEnabled());
                }
            }

            /**
             * class present port status result-attr-link-up model
             */
            @JsonInclude(JsonInclude.Include.NON_NULL)
            @JsonIgnoreProperties(ignoreUnknown = true)
            @JsonPropertyOrder({
                    "enabled"
            })
            public class PortStatusResultAttrLed {

                @JsonProperty("on")
                private boolean on;

                /**
                 *
                 * @return
                 */
                @JsonProperty("on")
                public boolean getOn() {
                    return on;
                }

                /**
                 *
                 * @param on
                 */
                @JsonProperty("on")
                public void setOn(boolean on) {
                    this.on = on;
                }

                public String toString() {
                    if (on) return "on";
                    return "off";
                }
            }

            /**
             * class present port status result-attr-link-up model
             */
            @JsonInclude(JsonInclude.Include.NON_NULL)
            @JsonIgnoreProperties(ignoreUnknown = true)
            @JsonPropertyOrder({
                    "ether",
                    "ipv4"
            })
            public class PortStatusResultAttrLayerCfg {

                @JsonProperty("ether")
                private PortStatusResultAttrLayerCfgEther ether;
                @JsonProperty("ipv4")
                private PortStatusResultAttrLayerCfgIPv4 ipv4;

                /**
                 *
                 * @return ether
                 */
                @JsonProperty("ether")
                public PortStatusResultAttrLayerCfgEther getEther() {
                    return ether;
                }

                /**
                 *
                 * @param ether
                 */
                @JsonProperty("ether")
                public void setEther(PortStatusResultAttrLayerCfgEther ether) {
                    this.ether = ether;
                }

                /**
                 *
                 * @return ipv4
                 */
                @JsonProperty("ipv4")
                public PortStatusResultAttrLayerCfgIPv4 getIpv4() {
                    return ipv4;
                }

                /**
                 *
                 * @param ipv4
                 */
                @JsonProperty("ipv4")
                public void setIpv4(PortStatusResultAttrLayerCfgIPv4 ipv4) {
                    this.ipv4 = ipv4;
                }

                public void updateFrom(PortStatusResultAttrLayerCfg layer_cfg) {
                    ether.updateFrom(layer_cfg.getEther());
                    ipv4.updateFrom(layer_cfg.getIpv4());
                }

                /**
                 * class present port status result-attr-link-up model
                 */
                @JsonInclude(JsonInclude.Include.NON_NULL)
                @JsonIgnoreProperties(ignoreUnknown = true)
                @JsonPropertyOrder({
                        "dst",
                        "src",
                        "state"
                })
                public class PortStatusResultAttrLayerCfgEther {

                    @JsonProperty("dst")
                    private String dst;
                    @JsonProperty("src")
                    private String src;
                    @JsonProperty("state")
                    private String state;
                    
                    private StringProperty dstProperty = new SimpleStringProperty();
                    private StringProperty srcProperty = new SimpleStringProperty();

                    @JsonProperty("dst")
                    public String getDst() {
                        return dstProperty.get();
                    }

                    @JsonProperty("dst")
                    public void setDst(String dst) {
                        dstProperty.setValue(dst);
                    }

                    @JsonProperty("src")
                    public String getSrc() {
                        return srcProperty.get();
                    }

                    @JsonProperty("src")
                    public void setSrc(String src) {
                        srcProperty.set(src);
                    }

                    @JsonProperty("state")
                    public String getState() {
                        return state;
                    }

                    @JsonProperty("state")
                    public void setState(String state) {
                        this.state = state;
                    }

                    public void updateFrom(PortStatusResultAttrLayerCfgEther ether) {
                        setState(ether.getState());
                        setSrc(ether.getSrc());
                        setDst(ether.getDst());
                    }

                    public StringProperty dstProperty() {
                        return dstProperty;
                    }
                }

                /**
                 * class present port status result-attr-link-up model
                 */
                @JsonInclude(JsonInclude.Include.NON_NULL)
                @JsonIgnoreProperties(ignoreUnknown = true)
                @JsonPropertyOrder({
                        "dst",
                        "src",
                        "state"
                })
                public class PortStatusResultAttrLayerCfgIPv4 {

                    @JsonProperty("dst")
                    private String dst;
                    @JsonProperty("src")
                    private String src;
                    @JsonProperty("state")
                    private String state;
                    
                    private StringProperty dstProperty = new SimpleStringProperty();
                    private StringProperty srcProperty = new SimpleStringProperty();

                    @JsonProperty("dst")
                    public String getDst() {
                        return dstProperty.get();
                    }

                    @JsonProperty("dst")
                    public void setDst(String dst) {
                        this.dstProperty.set(dst);
                    }

                    @JsonProperty("src")
                    public String getSrc() {
                        return srcProperty.get();
                    }

                    @JsonProperty("src")
                    public void setSrc(String src) {
                        this.srcProperty.set(src);
                    }

                    @JsonProperty("state")
                    public String getState() {
                        return state;
                    }

                    @JsonProperty("state")
                    public void setState(String state) {
                        this.state = state;
                    }

                    public void updateFrom(PortStatusResultAttrLayerCfgIPv4 ipv4) {
                        setState(ipv4.getState());
                        setSrc(ipv4.getSrc());
                        setDst(ipv4.getDst());
                    }

                    public StringProperty srcProperty() {
                        return srcProperty;
                    }

                    public StringProperty dstProperty() {
                        return dstProperty;
                    }
                }
            }
        }


        /**
         * class present port status result-attr model
         */
        @JsonInclude(JsonInclude.Include.NON_NULL)
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonPropertyOrder({
                "grat_arp",
                "latency",
                "queue",
                "sniffer"
        })
        public class PortStatusResultRxInfo {

            @JsonProperty("grat_arp")
            private PortStatusResultRxInfoGratArp grat_arp;
            
            @JsonProperty("latency")
            private PortStatusResultRxInfoLatency latency;
            @JsonProperty("queue")
            private PortStatusResultRxInfoQueue queue;

            @JsonProperty("grat_arp")
            public PortStatusResultRxInfoGratArp getGrat_arp() {
                return grat_arp;
            }

            @JsonProperty("grat_arp")
            public void setGrat_arp(PortStatusResultRxInfoGratArp grat_arp) {
                this.grat_arp = grat_arp;
            }

            @JsonProperty("latency")
            public PortStatusResultRxInfoLatency getLatency() {
                return latency;
            }

            @JsonProperty("latency")
            public void setLatency(PortStatusResultRxInfoLatency latency) {
                this.latency = latency;
            }

            @JsonProperty("queue")
            public PortStatusResultRxInfoQueue getQueue() {
                return queue;
            }

            @JsonProperty("queue")
            public void setQueue(PortStatusResultRxInfoQueue queue) {
                this.queue = queue;
            }

            public void updateFrom(PortStatusResultRxInfo rxInfo) {
                grat_arp.updateFrom(rxInfo.getGrat_arp());
                latency.updateFrom(rxInfo.getLatency());
                queue.updateFrom(rxInfo.getQueue());
            }

            @JsonInclude(JsonInclude.Include.NON_NULL)
            @JsonIgnoreProperties(ignoreUnknown = true)
            @JsonPropertyOrder({
                    "is_active"
            })
            public class PortStatusResultRxInfoGratArp {

                private StringProperty stateProperty = new SimpleStringProperty();
                
                @JsonProperty("interval_sec")
                private int interval_sec;

                @JsonProperty("interval_sec")
                public void setInterval_sec(int interval_sec) {
                    this.interval_sec = interval_sec;
                }

                @JsonProperty("interval_sec")
                public int getInterval_sec() {
                    return interval_sec;
                }

                @JsonProperty("is_active")
                private boolean is_active;

                @JsonProperty("is_active")
                public boolean getIs_active() {
                    return is_active;
                }

                @JsonProperty("is_active")
                public void setIs_active(boolean is_active) {
                    this.is_active = is_active;
                }

                public void updateFrom(PortStatusResultRxInfoGratArp grat_arp) {
                    setInterval_sec(grat_arp.getInterval_sec());
                    setIs_active(grat_arp.getIs_active());
                    if (grat_arp.getIs_active()) {
                        stateProperty.set(grat_arp.getInterval_sec() + " second(s)");
                    } else {
                        stateProperty.set("Off");
                    }
                }

                public StringProperty stateProperty() {
                    return stateProperty;
                }
            }

            @JsonInclude(JsonInclude.Include.NON_NULL)
            @JsonIgnoreProperties(ignoreUnknown = true)
            @JsonPropertyOrder({
                    "is_active"
            })
            public class PortStatusResultRxInfoQueue {

                private StringProperty statusProperty = new SimpleStringProperty();
                
                @JsonProperty("is_active")
                private boolean is_active;

                @JsonProperty("is_active")
                public boolean isIs_active() {
                    return is_active;
                }

                @JsonProperty("is_active")
                public void setIs_active(boolean is_active) {
                    this.is_active = is_active;
                    statusProperty().set(is_active ? "On" : "Off");
                }

                public StringProperty statusProperty() {
                    return statusProperty;
                }
                
                public String getStatus() {
                    return statusProperty.get();
                }

                public void updateFrom(PortStatusResultRxInfoQueue queue) {
                    setIs_active(queue.isIs_active());
                }
            }

            @JsonInclude(JsonInclude.Include.NON_NULL)
            @JsonIgnoreProperties(ignoreUnknown = true)
            @JsonPropertyOrder({
                    "is_active"
            })
            public class PortStatusResultRxInfoLatency {

                @JsonProperty("is_active")
                private boolean is_active;

                @JsonProperty("is_active")
                public boolean isIs_active() {
                    return is_active;
                }

                @JsonProperty("is_active")
                public void setIs_active(boolean is_active) {
                    this.is_active = is_active;
                }

                public void updateFrom(PortStatusResultRxInfoLatency latency) {
                    setIs_active(latency.isIs_active());
                }
            }

            @JsonInclude(JsonInclude.Include.NON_NULL)
            @JsonIgnoreProperties(ignoreUnknown = true)
            @JsonPropertyOrder({
                    "is_active"
            })
            public class PortStatusResultRxInfoSniffer {

                @JsonProperty("is_active")
                private boolean is_active;

                @JsonProperty("is_active")
                public boolean isIs_active() {
                    return is_active;
                }

                @JsonProperty("is_active")
                public void setIs_active(boolean is_active) {
                    this.is_active = is_active;
                }

                public void updateFrom(PortStatusResultRxInfoSniffer sniffer) {
                    setIs_active(sniffer.isIs_active());
                }
            }
        }
    }
}
