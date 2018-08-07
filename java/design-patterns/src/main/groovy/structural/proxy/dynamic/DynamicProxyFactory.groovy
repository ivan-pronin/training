package structural.proxy.dynamic

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy

class DynamicProxyFactory {

    static PersonBean getOwnerProxy(PersonBean personBean) {
        return createProxy(personBean, new OwnerInvocationHandler(personBean))
    }

    static PersonBean getNonOwnerProxy(PersonBean personBean) {
        return createProxy(personBean, new NonOwnerInvocationHandler(personBean))
    }

    private static PersonBean createProxy(PersonBean personBean, InvocationHandler handler) {
        return (PersonBean) Proxy.newProxyInstance(
                personBean.getClass().getClassLoader(),
                personBean.getClass().getInterfaces(),
                handler
        )
    }
}
