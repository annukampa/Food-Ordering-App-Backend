package com.upgrad.FoodOrderingApp.service.businness;

import com.upgrad.FoodOrderingApp.service.dao.PaymentDao;
import com.upgrad.FoodOrderingApp.service.entity.PaymentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    /**
     * This method implements to get all the payment methods
     *
     * @return
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public List<PaymentEntity> getPaymentMethods() {
        List<PaymentEntity> paymentEntityList = paymentDao.getPaymentMethods();
        return paymentEntityList;
    }
}
