package com.example.trade.service.abs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * @description: trade业务抽象类
 * @author: chuan
 * @create: 2019-10-24 10:41
 * @note @Transactional默认传播属性为 Propagation.REQUIRED
 **/
public abstract class AbstractTradeService {

    @Autowired
    private TradeDAO tradeDAO;

    @Transactional
    public  boolean insertTrade(TradeModel tradeModel){

        //1.校验参数
        if(!checkTradeParam(tradeModel)){
            throw
        }
        
        this.tradeDAO.insertTrade();
        return false;
    }

    protected abstract boolean checkTradeParam(TradeModel tradeModel);

    protected abstract boolean submitTrade(String orderId);

}
