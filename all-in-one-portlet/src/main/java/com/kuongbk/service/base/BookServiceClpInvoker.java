package com.kuongbk.service.base;

import com.kuongbk.service.BookServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class BookServiceClpInvoker {
    private String _methodName40;
    private String[] _methodParameterTypes40;
    private String _methodName41;
    private String[] _methodParameterTypes41;

    public BookServiceClpInvoker() {
        _methodName40 = "getBeanIdentifier";

        _methodParameterTypes40 = new String[] {  };

        _methodName41 = "setBeanIdentifier";

        _methodParameterTypes41 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName40.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes40, parameterTypes)) {
            return BookServiceUtil.getBeanIdentifier();
        }

        if (_methodName41.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes41, parameterTypes)) {
            BookServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
