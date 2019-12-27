package com.virugan.servimpl;

import com.virugan.comptype.py.payAccountingCtx;
import com.virugan.comptype.py.payOtherHandleCtx;
import com.virugan.comptype.py.payQueryCtx;
import com.virugan.service.paymentInterOffice;

import java.util.List;

public class paymentInterOfficeImpl implements paymentInterOffice {
    @Override
    public boolean transSameFaredma(payAccountingCtx payaccountingctx) throws Exception {
        return false;
    }

    @Override
    public boolean transBetweenFaredma(payAccountingCtx payaccountingctx) throws Exception {
        return false;
    }

    @Override
    public List queryTransDetails(payQueryCtx payqueryctx) throws Exception {
        return null;
    }

    @Override
    public boolean transByHandwork(payOtherHandleCtx payotherhandlectx) throws Exception {
        return false;
    }

    @Override
    public boolean settleByHandwork(payOtherHandleCtx payotherhandlectx) throws Exception {
        return false;
    }
}
