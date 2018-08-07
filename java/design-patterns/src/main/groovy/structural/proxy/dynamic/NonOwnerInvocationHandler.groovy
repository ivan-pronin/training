package structural.proxy.dynamic

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

class NonOwnerInvocationHandler implements InvocationHandler {

    PersonBeanImpl personBean

    NonOwnerInvocationHandler(PersonBeanImpl personBean) {
        this.personBean = personBean
    }

    @Override
    Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String methodName = method.getName()
        // Groovy returns 'getMetaClass' as method name, nothing works here as expected
        try {
            if (!methodName.contains("Rating")) {
                throw new IllegalAccessException()
            } else {
                return method.invoke(personBean, args)
            }
        } catch (Exception e) {
            e.printStackTrace()
        }
    }
}
