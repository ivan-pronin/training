package structural.proxy.dynamic

import java.lang.reflect.InvocationHandler
import java.lang.reflect.InvocationTargetException
import java.lang.reflect.Method

class OwnerInvocationHandler implements InvocationHandler {

    PersonBeanImpl personBean

    OwnerInvocationHandler(PersonBeanImpl personBean) {
        this.personBean = personBean
    }

    @Override
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName()
        try {
            if (methodName.startsWith("get") || methodName.startsWith("set")) {
                return method.invoke(personBean, args)
            } else if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessException()
            } else {
                return null
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace()
        }
    }
}
