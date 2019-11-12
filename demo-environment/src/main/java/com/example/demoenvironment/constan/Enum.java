package com.example.demoenvironment.constan;

public class Enum {

    public enum MQExceptionType {

        PRODUCT_PUSH_FAIL("1001","生产者推送消息失败"),
        CONSUMER_FAIL("1002","消费者消费失败");

        private String errCode;
        private String errMsg;

        MQExceptionType(String errCode, String errMsg) {
            this.errCode = errCode;
            this.errMsg = errMsg;
        }

        public String getErrCode() {
            return errCode;
        }

        public String getErrMsg() {
            return errMsg;
        }
    }


    public enum MQProductBind {

        //提交订单
        MQ_BIND_SUBMIT_ORDER(Constans.MQ_DIRECT_EXCHANGE_ORDER_SUBMIT,Constans.MQ_QUEUE_ORDER_SUBMIT,Constans.MQ_ROUTINGKEY_ORDER_SUBMIT);

        private String exchangeName;
        private String queueName;
        private String routerKey;

        MQProductBind(String exchangeName, String queueName, String routerKey) {
            this.exchangeName = exchangeName;
            this.queueName = queueName;
            this.routerKey = routerKey;
        }

        public String getExchangeName() {
            return exchangeName;
        }

        public String getQueueName() {
            return queueName;
        }

        public String getRouterKey() {
            return routerKey;
        }
    }
}
